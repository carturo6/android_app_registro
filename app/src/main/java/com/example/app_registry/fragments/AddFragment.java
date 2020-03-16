package com.example.app_registry.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.app_registry.R;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment {

    EditText hora;

    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Date date = new Date();
        hora = (EditText) hora.findViewById(R.id.hora);
        SimpleDateFormat horaC=new SimpleDateFormat("d, MMMM 'del', yyyy");
        String sHora = horaC.format(date);
        hora.setText(sHora);


        return inflater.inflate(R.layout.fragment_add, container, false);
    }

}
