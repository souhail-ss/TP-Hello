package com.example.tp_sayhi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonSayHi = findViewById(R.id.buttonSayHi);
        TextView textViewDisplay = findViewById(R.id.textViewDisplay);
        EditText editTextName = findViewById(R.id.editTextName);

        buttonSayHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                if (name.isEmpty())
                    textViewDisplay.setText("Please provide a name");

                else
                    textViewDisplay.setText("Hello" + name);
            }
        });

    }
}