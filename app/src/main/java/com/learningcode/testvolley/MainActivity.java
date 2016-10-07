package com.learningcode.testvolley;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, MainFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        // 1º Crear una instancia de FragmentManager.
        FragmentManager fragmentManager = getFragmentManager();

        //2º Crear una nueva transacción.
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        //3º Crear un nuevo fragment y añadirlo.
        MainFragment fragment = new MainFragment();
        transaction.add(R.id.principal, fragment);

        //4º Confirmar el cambio
        transaction.commit();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
