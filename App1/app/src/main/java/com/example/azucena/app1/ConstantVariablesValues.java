package com.example.azucena.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ConstantVariablesValues extends AppCompatActivity {

    private EditText etX, etY;
    private RadioButton rTemperature, rVolume, rPressure;
    private TextView txt1, txt2;
    private RadioGroup RGAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constant_variables_values);

        etX=(EditText)findViewById(R.id.editTextX);
        etY=(EditText)findViewById(R.id.editTextY);
        txt1=(TextView)findViewById(R.id.txtOp1);
        txt2=(TextView)findViewById(R.id.txtOp2);
        RGAll=(RadioGroup)findViewById(R.id.rbGroup);
        rTemperature=(RadioButton)findViewById(R.id.rbTemperature);
        rVolume=(RadioButton)findViewById(R.id.rbVolume);
        rPressure=(RadioButton)findViewById(R.id.rbPressure);

        RGAll.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rTemperature.isChecked()){
                    txt1.setText("Ingresa valor del volumen");
                    txt1.setVisibility(View.VISIBLE);
                    etX.setVisibility(View.VISIBLE);
                    txt2.setText("Ingresa valor de la presión");
                    txt2.setVisibility(View.VISIBLE);
                    etY.setVisibility(View.VISIBLE);
                } else if(rVolume.isChecked()){
                    txt1.setText("Ingresa valor de la temperatura");
                    txt1.setVisibility(View.VISIBLE);
                    etX.setVisibility(View.VISIBLE);
                    txt2.setText("Ingresa valor de la presión");
                    txt2.setVisibility(View.VISIBLE);
                    etY.setVisibility(View.VISIBLE);
                }else if(rPressure.isChecked()){
                    txt1.setText("Ingresa valor de la temperatura");
                    txt1.setVisibility(View.VISIBLE);
                    etX.setVisibility(View.VISIBLE);
                    txt2.setText("Ingresa valor del volumen");
                    txt2.setVisibility(View.VISIBLE);
                    etY.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    //Método Continue2
    public void Continue2(View view){
        String stringX=etX.getText().toString();
        String stringY=etY.getText().toString();
        float floatX=Float.parseFloat(stringX);
        float floatY=Float.parseFloat(stringY);

        Intent next = new Intent(this, ConstantK.class);
        startActivity(next);
    }
}