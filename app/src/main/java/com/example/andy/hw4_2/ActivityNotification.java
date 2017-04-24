package com.example.andy.hw4_2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by Andy on 2017/4/25.
 */

public class ActivityNotification extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(ActivityNotification.this);
        tv.setText("ActivityNotification!");
        setContentView(tv);
    }
}
