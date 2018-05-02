package com.example.dh.entregable2.Model.POJO;

import java.util.List;

public class ContenedorRecetas {

    List<Receta> listaDeRecetas;

    public ContenedorRecetas(List<Receta> listaDeReceta) {
        this.listaDeRecetas = listaDeReceta;
    }

    public List<Receta> getListaDeReceta() {
        return listaDeRecetas;
    }

    public void setListaDeReceta(List<Receta> listaDeReceta) {
        this.listaDeRecetas = listaDeReceta;
    }
}
