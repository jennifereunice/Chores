package com.fivethirty.chores;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginView loginView = new LoginView("",getApplicationContext());
        View contentView = loginView.getLoginLayout();
        setContentView(contentView);
    }
}