package com.example.app_registry.Activity_menu;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_registry.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Activity_add extends AppCompatActivity {


    TextView fechaCompleta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_add);
        Date d=new Date();
        //SACAMOS LA FECHA COMPLETA
        fechaCompleta = (TextView) findViewById(R.id.fecha);
        SimpleDateFormat fecc=new SimpleDateFormat("d, MMMM 'del' yyyy");
        String fechacComplString = fecc.format(d);
        fechaCompleta.setText(fechacComplString);

    }


}
