package com.example.app_registry.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.app_registry.R;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment {


    EditText hora;
    EditText fecha;
    TextView fechaC;
    Button btn;
    View vista;

    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Date date = new Date();
        vista = inflater.inflate(R.layout.fragment_add, container, false);

        btn = (Button) vista.findViewById(R.id.btnGuardar);
        fechaC = (TextView) vista.findViewById(R.id.fechaC);
        hora = (EditText) vista.findViewById(R.id.hora);
/*
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora.setText(new Date().toString());
            }
        });
*/

        Time hora = new Time(Time.getCurrentTimezone());
        hora.setToNow();


        Time today = new Time(Time.getCurrentTimezone());
        today.setToNow();
        int dia = today.monthDay;
        int mes = today.month;
        int anio = today.year;
        mes = mes+1;
        fechaC.setText("Dia: " + dia +"     Mes: " + mes + "    Año: " + anio);

        return vista;


    }



}
