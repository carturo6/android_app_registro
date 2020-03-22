package com.example.app_registry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.app_registry.fragments.AddFragment;
import com.example.app_registry.fragments.HomeFragment;
import com.example.app_registry.fragments.ListFragment;
import com.example.app_registry.Activity_menu.Activity_add;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Activity_List extends AppCompatActivity {

    //Objeto de tipo bottom
    BottomNavigationView mBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        //Instancinado el mBottomNavigation
        mBottomNavigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        //El bottomNavigation tendra un evento que permita saber cual de las opciones a seleccionado
        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                //Con una serie de if podremos saber cual de las opciones el usuario a seleccionado

                if(menuItem.getItemId()== R.id.nav_home){
                    //Mostrar el fragment requerido usando el metod del final
                    showSelectedFragment(new HomeFragment());

                }

                if(menuItem.getItemId()== R.id.nav_list){
                    showSelectedFragment(new ListFragment());
                }

                if(menuItem.getItemId()== R.id.nav_add){
                    showSelectedFragment(new AddFragment());
                }

                /*

                Cada if seleccionado representa el ingreso a un fragment

                Un fragment es un pantalla viviendo dentro de un activity
                 */

                return true;
            }
        });

    }


    //Metodo pare elejir fragment

    public void showSelectedFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
    }
}
