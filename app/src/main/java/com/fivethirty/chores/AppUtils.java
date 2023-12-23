package com.fivethirty.chores;

import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.TextView;

public class AppUtils {
    public static void setTextView(TextView textView,String text,int size,int color){
        textView.setText(text);
        textView.setTextSize(size);
        Typeface typeface = null;
        switch (textView.getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) {
            case Configuration.UI_MODE_NIGHT_YES:
                textView.setTextColor(Color.WHITE);
                break;
            case Configuration.UI_MODE_NIGHT_NO:
                textView.setTextColor(Color.BLACK);
                break;
        }
        if (color > 0) {
            textView.setTextColor(color);
        }
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            typeface = textView.getResources().getFont(R.font.comfortaa_font);
            textView.setTypeface(typeface);
        }
    }

    public static void setTextView(TextView textView,String text,int size) {
        setTextView(textView,text,size,-1);
    }
}
