package com.example.dh.entregable2.View;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.dh.entregable2.Controller.RecetaController;
import com.example.dh.entregable2.Model.POJO.Receta;
import com.example.dh.entregable2.R;

import java.util.ArrayList;
import java.util.List;

public class RecetasVPActivity extends AppCompatActivity {

    List<Receta> listaDeRecetas;
    int posicionElegida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas_vp);

        Bundle bundle = getIntent().getExtras();
        ViewPager recetasViewPager = findViewById(R.id.recetasViewPager);
        cargarRecetas();
        RecetasVPAdapter recetasVPAdapter = new RecetasVPAdapter(getSupportFragmentManager(), listaDeRecetas);
        recetasViewPager.setAdapter(recetasVPAdapter);
        posicionElegida = obtenerPosicion(bundle.getInt("RECETA_ID"));
        recetasViewPager.setCurrentItem(posicionElegida);
    }

    private int obtenerPosicion(int recetaId){
        int posicion = 0;
        for(Receta unaReceta : listaDeRecetas){
            if (unaReceta.getRecetaId() == recetaId){
                return posicion;
            } else posicion ++;
        }
        return 0;
    }

    public void cargarRecetas(){
        RecetaController recetaController = new RecetaController();
        this.listaDeRecetas =recetaController.obtenerRecetas();
    }




}
