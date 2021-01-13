package com.example.holamundoconevento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_2);

        textView=(TextView)findViewById(R.id.textViewSaludo);
    }

    public void saludando(View view){
        textView.setVisibility(View.VISIBLE);
    }


}