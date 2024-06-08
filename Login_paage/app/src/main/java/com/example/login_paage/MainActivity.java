package com.example.login_paage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.login_paage.Dash_board;

public class MainActivity extends AppCompatActivity {
    Button btn;

    EditText edt1, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.mybtb);
        edt1 = findViewById(R.id.mybox);
        edt2 = findViewById(R.id.mypass);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = "hello" + edt1.getText().toString().trim()
                        + "with" +edt2.getText().toString().trim();


                Intent intent = new Intent( MainActivity.this, Dash_board.class);
                intent.putExtra("data", name);

                startActivity(intent);

            }
       });




}
}