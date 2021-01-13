package com.example.holamundoconevento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_2);

        button=(Button)findViewById(R.id.btnSaludar);
        textView=(TextView)findViewById(R.id.textViewSaludo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(R.string.testoSaludo);
                textView.setTextSize(20);
                textView.setTextColor(getResources().getColor(R.color.design_default_color_primary));
            }
        });
    }


}