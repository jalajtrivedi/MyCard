package com.example.longinpage

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DashBoardActivity extends AppCompatActivity {

    EditText txt;

    Button btb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash_board);

        txt = findViewById(R.id.dummy);
        btb = findViewById(R.id.mybut);

        btb.setOnClickListener( );
    }
}