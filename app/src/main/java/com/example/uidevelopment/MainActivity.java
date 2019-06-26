package com.example.uidevelopment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button convert;
    Button exit;
    EditText millimetres;
    EditText inches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert = findViewById(R.id.convert);
        exit = findViewById(R.id.exit);
        millimetres = findViewById(R.id.Millimetres);
        inches = findViewById(R.id.Inches);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mL = millimetres.getText().toString();
                if(mL == null){
                    return ;
                }
                double ml = Double.valueOf(mL);
                double inch = ml / 25.4;

                inches.setText(String.valueOf(inch));
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
