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

package ru.payqr.dadataexample.interfaces;

import java.util.List;

/**
 * An interface that sends callbacks indicating the status of the query.
 *
 * @author Savelii Zagurskii
 */
public interface OnSuggestionsListener {
    /**
     * Success in getting suggestions.
     *
     * @param suggestions suggestions either from cache or server.
     */
    void onSuggestionsReady(List<String> suggestions);

    /**
     * Something went wrong.
     *
     * @param message error that occurred during getting suggestions.
     */
    void onError(String message);
}