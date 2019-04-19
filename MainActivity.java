package com.example.rafael.minicalcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView,textView2;
    EditText Caja1,Caja2;
    Button Suma,Resta,Multiplicacion,Division;
    Double result=0.0,num1,num2;
    String cadena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
textView=findViewById(R.id.textView);
textView2=findViewById(R.id.textView2);
Caja1=findViewById(R.id.Caja1);
Caja2=findViewById(R.id.Caja2);
Suma=findViewById(R.id.Suma);
Resta=findViewById(R.id.Resta);
Multiplicacion=findViewById(R.id.Multiplicacion);
Division=findViewById(R.id.Division);

Suma.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        cadena=Caja1.getText().toString();
        num1=Double.valueOf(cadena);
        cadena=Caja2.getText().toString();
        num2=Double.valueOf(cadena);
        result=num1+num2;
        textView2.setText(String.valueOf(result));
    }
});
Resta.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        cadena=Caja1.getText().toString();
        num1=Double.valueOf(cadena);
        cadena=Caja2.getText().toString();
        num2=Double.valueOf(cadena);
        result=num1-num2;
        textView2.setText(String.valueOf(result));
    }
});
Division.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        cadena=Caja1.getText().toString();
        num1=Double.valueOf(cadena);
        cadena=Caja2.getText().toString();
        num2=Double.valueOf(cadena);
        result=num1/num2;
        textView2.setText(String.valueOf(result));
    }
});
Multiplicacion.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        cadena=Caja1.getText().toString();
        num1=Double.valueOf(cadena);
        cadena=Caja2.getText().toString();
        num2=Double.valueOf(cadena);
        result=num1*num2;
        textView2.setText(String.valueOf(result));
    }
});
    }
}
