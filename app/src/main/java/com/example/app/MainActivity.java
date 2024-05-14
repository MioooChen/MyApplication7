package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Database.init(this);

        Button createButton = findViewById(R.id.button1);
        createButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, NewAdvertActivity.class);
            startActivity(intent);
        });

        Button viewButton = findViewById(R.id.button2);
        viewButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, AllItemsActivity.class);
            startActivity(intent);
        });

    }
}