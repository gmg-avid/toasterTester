package com.gmg.android.toaster;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void showtoast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
