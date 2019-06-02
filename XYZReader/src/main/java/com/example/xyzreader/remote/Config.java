package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
           // url = new URL("https://go.udacity.com/xyz-reader-json" ); // I was told that it is possible to use the below link instead
            url = new URL("https://raw.githubusercontent.com/SuperAwesomeness/XYZReader/master/data.json");

        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }
}
