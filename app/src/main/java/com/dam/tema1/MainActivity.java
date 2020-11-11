package com.dam.tema1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String orignialText;
    String orignialButtonText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView miTexto=(TextView)findViewById(R.id.textView);
        Button miBoton = (Button)findViewById(R.id.button);
        miBoton.setOnClickListener(this);
        orignialText = (String)miTexto.getText();
        orignialButtonText = (String)miBoton.getText();
    }

    public void onClick(View view) {
        TextView miTexto=(TextView)findViewById(R.id.textView);
        Button miBoton = (Button)findViewById(R.id.button);

        if(miTexto.getText() == orignialText){
            miTexto.setText ("pulsado");
            miBoton.setText ("pulsado");
        }else {
            miTexto.setText (orignialText);
            miBoton.setText (orignialButtonText);
        }
    }
}
