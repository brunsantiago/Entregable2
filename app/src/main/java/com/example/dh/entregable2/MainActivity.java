package com.example.dh.entregable2;

import android.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.NavigationView;
import android.os.Bundle;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CREO UN LISTENER DEL TIPO LISTENER NAVIGATION VIEW
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        //ASIGNO AL NAVIGATION VIEW EL LISTENER
        NavigationViewListener navigationViewListener = new NavigationViewListener();
        navigationView.setNavigationItemSelectedListener(navigationViewListener);

    }

    private class NavigationViewListener implements NavigationView.OnNavigationItemSelectedListener{

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

            FragmentManager fragmentManager = getFragmentManager();

            if(item.getItemId() == R.id.primerFragment){

                cargadorDeFragments(new PrimerFragment());
            }
            else if(item.getItemId() == R.id.segundoFragment){

                cargadorDeFragments(new SegundoFragment());
            }
            else if(item.getItemId() == R.id.tercerFragment){

                cargadorDeFragments(new TercerFragment());
            }
            drawerLayout.closeDrawers();

            return true;
        }
    }


}

