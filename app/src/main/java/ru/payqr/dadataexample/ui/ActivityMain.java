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

package ru.payqr.dadataexample.ui;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ru.payqr.dadataexample.R;
import ru.payqr.dadataexample.interfaces.OnSuggestionsListener;
import ru.payqr.dadataexample.utils.ServerUtils;

public class ActivityMain extends AppCompatActivity implements TextWatcher, OnSuggestionsListener {

    private static final List<String> EMPTY = new ArrayList<>();
    private DaDataArrayAdapter<String> adapter;
    private AutoCompleteTextView textView;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (AutoCompleteTextView) findViewById(R.id.autocompletetextview_activitymain);
        adapter = new DaDataArrayAdapter<>(this, android.R.layout.simple_list_item_1, EMPTY);

        textView.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();

        textView.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    @Override
    public void afterTextChanged(final Editable s) {
        ServerUtils.query(s.toString(), this);
    }

    @Override
    public synchronized void onSuggestionsReady(List<String> suggestions) {
        // Clear current suggestions
        adapter.clear();

        // If current device is 3.0 and higher,
        // we use addAll(..) method
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            adapter.addAll(suggestions);
        } else {
            for (String s : suggestions) {
                adapter.add(s);
            }
        }

        // Notify about the change
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onError(String message) {
        // Cancel current toast for
        // showing only one toast at a time
        if (toast != null)
            toast.cancel();

        toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}