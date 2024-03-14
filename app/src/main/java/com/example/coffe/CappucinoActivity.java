package com.example.coffe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CappucinoActivity extends tabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cappucino);

        ImageButton button = findViewById(R.id.tabs); // Найти кнопку по идентификатору

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CappucinoActivity.this, homeActivity.class);
                startActivity(intent);
            }
        });
    }
}