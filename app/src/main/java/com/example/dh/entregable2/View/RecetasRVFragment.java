package com.example.dh.entregable2.View;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.dh.entregable2.Controller.RecetaController;
import com.example.dh.entregable2.Model.POJO.Receta;
import com.example.dh.entregable2.R;

import java.util.ArrayList;
import java.util.List;


public class RecetasRVFragment extends Fragment implements SearchView.OnQueryTextListener{

    private RecetasRVAdapter unAdapterDeRecetas;
    private List<Receta> listaDeRecetas;
    private Notificable notificable;

    public RecetasRVFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }


    //CON EL METODO ON ATTACH ME GUARDO EL CONTEXTO EN DONDE ESTA INCRUSTADO EL FRAGMENT
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.notificable = (Notificable) context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        cargarRecetas();

        //Busco el RecyclerView para luego poder setearle el adaptador
        RecyclerView recyclerViewRecetas = (RecyclerView) view.findViewById(R.id.recyclerViewRecetas);
        //Le decimos que no va a variar el tamanio de la lista
        recyclerViewRecetas.setHasFixedSize(true);
        //Le pedimos que muestre las cosas en forma de lista
        recyclerViewRecetas.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        //Creamos el adaptador del recycler
        unAdapterDeRecetas = new RecetasRVAdapter(getContext(),listaDeRecetas, new RecetasRVAdapter.NotificableDelClickRecycler() {
            @Override
            public void notificarClick(Receta unaReceta) {
                notificable.recibirRecetaClickeada(unaReceta.getRecetaId());
            }
        });

        //Le damos el adapter al Recycler
        recyclerViewRecetas.setAdapter(unAdapterDeRecetas);
        return view;

    }

    public void cargarRecetas(){
        RecetaController recetaController = new RecetaController();
        this.listaDeRecetas = recetaController.obtenerRecetas();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, menu);

        final MenuItem item = menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(this);

        item.setOnActionExpandListener( new MenuItem.OnActionExpandListener() {

            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {

                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                // Do something when collapsed
                unAdapterDeRecetas.setSearchResult(listaDeRecetas);
                return true; // Return true to collapse action view

            }
        });
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        final List<Receta> filteredModelList = filter(listaDeRecetas, newText);
        unAdapterDeRecetas.setSearchResult(filteredModelList);
        return true;
    }

    private List<Receta> filter(List<Receta> listaDeRecetas, String query) {
        query = query.toLowerCase();
        final List<Receta> listaDeRecetasFiltradas = new ArrayList<>();
        for (Receta unaReceta : listaDeRecetas) {
            final String titulo = unaReceta.getTitulo().toLowerCase();
            if (titulo.contains(query)) {
                listaDeRecetasFiltradas.add(unaReceta);
            }
        }
        return listaDeRecetasFiltradas;
    }


    public interface Notificable{
        void recibirRecetaClickeada(int posicion);
    }


}
