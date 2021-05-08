package com.android.a51notificationbadge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nex3z.notificationbadge.NotificationBadge;

public class MainActivity extends AppCompatActivity {

    NotificationBadge notificationBadge;
    Button btnIncrease,btnMany,btnClear;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationBadge = findViewById(R.id.badge);
        btnIncrease = findViewById(R.id.btnIncrease);
        btnMany = findViewById(R.id.btnMany);
        btnClear = findViewById(R.id.btnClear);

        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationBadge.setNumber(++count);
            }
        });

        btnMany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationBadge.setNumber(99);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationBadge.setNumber(0);
            }
        });
    }
}