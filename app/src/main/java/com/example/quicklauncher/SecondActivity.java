package com.example.quicklauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent(). hasExtra("QuickLauncherApp.org")) {
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("QuickLauncherApp.org");
            tv.setText(text);

        }
    }
}

