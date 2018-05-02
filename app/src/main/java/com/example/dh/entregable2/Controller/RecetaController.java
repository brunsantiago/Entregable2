package com.example.dh.entregable2.Controller;

import com.example.dh.entregable2.Model.DAO.DAORecetaArchivo;
import com.example.dh.entregable2.Model.DAO.DAORecetaInternet;
import com.example.dh.entregable2.Model.POJO.Receta;
import java.util.List;

public class RecetaController {

    public List<Receta> obtenerRecetas() {

        List<Receta> listaDeRecetas;

        if (hayInternet()) {
            DAORecetaInternet daoRecetaInternet = new DAORecetaInternet();
            listaDeRecetas = daoRecetaInternet.obtenerRecetaDeInternet();
        } else {
            DAORecetaArchivo daoRecetaArchivo = new DAORecetaArchivo();
            listaDeRecetas = daoRecetaArchivo.obtenerRecetaDeArchivo();
        }

        return listaDeRecetas;
    }

    public Boolean hayInternet(){
        return true;
    }



}
