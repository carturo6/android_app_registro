package com.example.app_registry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.app_registry.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    private View btn;
    private final String GREET = "Wellcom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        //Haciendo referencia al boton
        btn = (Button)findViewById(R.id.btnRedondo);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Accion para el boton. Cuando se clickea sale un mensaje.
                Toast.makeText(MainActivity.this, "Buton click", Toast.LENGTH_LONG).show();

                //Accediando al segundo activity - pantall del activity_list
                Intent intent = new Intent(MainActivity.this, Activity_List.class);
                intent.putExtra("greeter", GREET);
                startActivity(intent);


            }
        });

        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }*/
    }


    public void next(View v){

    }
}
