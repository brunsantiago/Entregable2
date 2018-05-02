package com.example.dh.entregable2.Model.DAO;

import com.example.dh.entregable2.Model.POJO.Receta;
import com.example.dh.entregable2.R;

import java.util.ArrayList;
import java.util.List;

public class DAORecetaArchivo {

    public List<Receta> obtenerRecetaDeArchivo(){

        List<Receta> listaDeRecetas = new ArrayList<>();


        listaDeRecetas.add(new Receta(2,"Vacio","","Vacio","Prender la Parrilla y meter el vacio",R.drawable.vacio,""));
        listaDeRecetas.add(new Receta(3,"Ensalada","","Lechuga y Tomate","Lavar la lechuga, cortar los tomates y mezclar todo junto con aceite y vinagre.",R.drawable.ensalada,""));


        return listaDeRecetas;
    }

}
