package com.example.app_registry;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class doSeguimiento {

    SQLiteDatabase cx;

    ArrayList<Seguimineto> lista;

    Seguimineto s;
    Context ct;
    String nameBD = "BDseguimiento";
    String tabla = "create table if not exists seguimiento(id integer primary key autoincrement, medicion float, hora int, fecha int)";

    public doSeguimiento(Context s){
        this.ct=s;

        cx = ct.openOrCreateDatabase(nameBD, Context.MODE_WORLD_WRITEABLE, null );
        cx.execSQL(tabla);
    }


    public boolean insertar (Seguimineto s){

        return true;

    }



    public boolean eliminar (int id){

        return true;

    }


    public boolean aditar (Seguimineto s){

        return true;

    }


    public ArrayList<Seguimineto> verTodos(){

        return lista;
    }

    public Seguimineto verUno(int id){

        return s;
    }

}

