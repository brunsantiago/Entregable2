package com.example.dh.entregable2.Model.DAO;

import com.example.dh.entregable2.Model.POJO.Receta;
import com.example.dh.entregable2.R;

import java.util.ArrayList;
import java.util.List;

public class DAORecetaArchivo {

    public List<Receta> obtenerRecetaDeArchivo(){

        List<Receta> listaDeRecetas = new ArrayList<>();


        listaDeRecetas.add(new Receta(2,"Vacio","","Vacio","Prender la Parrilla y meter el vacio",R.drawable.vacio,""));
        listaDeRecetas.add(new Receta(3,"Ensalada","","Chorizo y Pan","Prender la Parrilla y meter el chorizo",R.drawable.ensalada,""));


        return listaDeRecetas;
    }

}
