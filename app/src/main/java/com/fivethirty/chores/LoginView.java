package com.fivethirty.chores;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class LoginView {
    public String userName = null;
    public ConstraintLayout loginLayout;
    public TextView appName;

    public LoginView(String userName, Context context) {
        loginLayout = (ConstraintLayout) View.inflate(context, R.layout.activity_main, null);
        if (userName != null && !userName.isEmpty()) {
            this.userName = userName;
        } else {
            this.userName = "User Name";
        }
        appName = loginLayout.findViewById(R.id.app_name);
        AppUtils.setTextView(appName, "Chores", 70);
    }

    public ConstraintLayout getLoginLayout() {
        return loginLayout;
    }
}
