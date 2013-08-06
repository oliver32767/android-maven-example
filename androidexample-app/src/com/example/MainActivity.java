package com.example;

import android.app.Activity;
import android.os.Bundle;

import com.embarkmobile.androidexample.Counter;

/**
 * Created by obartley on 8/5/13.
 */
public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Counter c = new Counter();
        c.increment();
    }
}