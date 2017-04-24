package com.example.andy.hw4_2;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DialogTitle;

/**
 * Created by Andy on 2017/4/25.
 */

public class ActivityDialog extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("KEY_MSG");

        AlertDialog.Builder adb =
                new AlertDialog.Builder(this);
        adb.setMessage("Received message: Hello  " + msg);
        adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        adb.show();
    }

}
