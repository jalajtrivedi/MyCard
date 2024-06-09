package com.example.MAD;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mad.R;

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


                Intent intent = new Intent( MainActivity.this, com.example.MAD.DashBoardActivity.class);
                intent.putExtra("data", name);

                startActivity(intent);

            }
       });




}
}