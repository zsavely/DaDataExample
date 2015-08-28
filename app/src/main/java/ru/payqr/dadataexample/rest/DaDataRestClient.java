/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Savelii Zagurskii
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package ru.payqr.dadataexample.rest;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.realm.RealmObject;
import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import ru.payqr.dadataexample.BuildConfig;
import ru.payqr.dadataexample.realm.models.dadata.RealmDaDataSuggestion;

/**
 * @author Savelii Zagurskii
 */
public class DaDataRestClient {
    private static final String BASE_URL = "https://dadata.ru";

    private static volatile DaDataRestClient instance;

    private DaDataService apiService;

    private DaDataRestClient() {
        Gson gson = new GsonBuilder()
                .setExclusionStrategies(new ExclusionStrategy() {
                    @Override
                    public boolean shouldSkipField(FieldAttributes f) {
                        return f.getDeclaringClass().equals(RealmObject.class);
                    }

                    @Override
                    public boolean shouldSkipClass(Class<?> clazz) {
                        return false;
                    }
                }).create();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(BuildConfig.DEBUG ? RestAdapter.LogLevel.FULL : RestAdapter.LogLevel.NONE)
                .setEndpoint(BASE_URL)
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade request) {
                        request.addHeader("Content-Type", "application/json");
                        request.addHeader("Accept", "application/json");
                        request.addHeader("Authorization", "Token ".concat(BuildConfig.DADATA_API_KEY));
                    }
                })
                .setConverter(new GsonConverter(gson))
                .build();

        apiService = restAdapter.create(DaDataService.class);
    }

    /**
     * Get default instance of {@code DaDataRestClient}.
     *
     * @return an instance of DaDataRestClient.
     */
    public static DaDataRestClient getInstance() {
        DaDataRestClient localInstance = instance;
        if (localInstance == null) {
            synchronized (DaDataRestClient.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DaDataRestClient();
                }
            }
        }
        return localInstance;
    }

    /**
     * Get suggestion asynchronously.
     *
     * @param body     an object that need to be passed in the body of the request.
     * @param callback a Retrofit callback.
     */
    public void suggestAsync(DaDataBody body, Callback<RealmDaDataSuggestion> callback) {
        apiService.getSuggestionAsync(body, callback);
    }

    /**
     * Get suggestion synchronously.
     *
     * @param body an object that need to be passed in the body of the request.
     * @return
     */
    public RealmDaDataSuggestion suggestSync(DaDataBody body) {
        return apiService.getSuggestionSync(body);
    }
}