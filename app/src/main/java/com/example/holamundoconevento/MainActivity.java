package com.example.holamundoconevento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private Button button;
    private RadioButton radioSumar, radioRestar, radioMultiplicar, radioDividir;
    private EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_radio);

        button=(Button)findViewById(R.id.buttonOperar);
        textResultado=(TextView)findViewById(R.id.textResultado);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        radioSumar=(RadioButton)findViewById(R.id.radioSumar);
        radioRestar=(RadioButton)findViewById(R.id.radioRestar);
        radioDividir=(RadioButton)findViewById(R.id.radioDividir);
        radioMultiplicar=(RadioButton)findViewById(R.id.radioMultiplicar);
    }

    public void operar (View view){

        int valor1 = Integer.parseInt(num1.getText().toString());
        int valor2 = Integer.parseInt(num2.getText().toString());

        if(radioSumar.isChecked())
            textResultado.setText("La suma es" + (valor1 + valor2));
        if(radioRestar.isChecked())
            textResultado.setText("La resta es" + (valor1 - valor2));
        if(radioMultiplicar.isChecked())
            textResultado.setText("La multiplicación es" + (valor1 * valor2));
        if(radioDividir.isChecked())
            textResultado.setText("La división es" + (valor1 / valor2));



    }


}