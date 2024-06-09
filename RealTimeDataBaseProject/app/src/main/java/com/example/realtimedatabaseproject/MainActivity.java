package com.example.realtimedatabaseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText emailbox , passbox;
    Button btn;
    FirebaseDatabase database;
    DatabaseReference root;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.mybtb);
        emailbox =findViewById(R.id.myemail);
        passbox= findViewById(R.id.mypass);
        database= FirebaseDatabase.getInstance();
        root = database.getReference().child("Student List Div 6b33");

        firebaseAuth=FirebaseAuth.getInstance();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = emailbox.getText().toString().trim();
                String pass = passbox.getText().toString().trim();

            }
        });
    }
}