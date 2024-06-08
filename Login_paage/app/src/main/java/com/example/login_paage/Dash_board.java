package com.example.login_paage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Dash_board extends AppCompatActivity {

    EditText txt;

    Button btb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        txt = findViewById(R.id.dummy);
        btb = findViewById(R.id.mybut);

        btb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dash = getIntent().getStringExtra("data");
                txt.setText(dash);
            }
        });





    }
}