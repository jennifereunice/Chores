package com.fivethirty.chores;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;

public class AppUtils {
    public static void setTextView(TextView textView,String text,int size){
        textView.setText(text);
        textView.setTextSize(size);
        textView.setTextColor(Color.BLACK);
        Typeface typeface = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            typeface = textView.getResources().getFont(R.font.comfortaa_font);
            textView.setTypeface(typeface);
        }
    }
}
