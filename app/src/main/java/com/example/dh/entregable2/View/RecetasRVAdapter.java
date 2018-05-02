package com.example.dh.entregable2.View;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;


import android.content.Context;
import android.widget.TextView;

import com.example.dh.entregable2.Model.POJO.Receta;
import com.example.dh.entregable2.R;

import java.util.List;

public class RecetasRVAdapter extends RecyclerView.Adapter{

    private Context context;
    private List<Receta> listaDeRecetas;
    private List<Receta> listaDeRecetasFiltradas;
    private NotificableDelClickRecycler notificable;

    public RecetasRVAdapter(Context context, List<Receta> listaDeRecetas, NotificableDelClickRecycler notificable) {
        this.context = context;
        this.listaDeRecetas = listaDeRecetas;
        this.notificable = notificable;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View viewDeLaCelda = layoutInflater.inflate(R.layout.celda_receta,parent,false);
        RecetaViewHolder recetaViewHolder = new RecetaViewHolder(viewDeLaCelda);
        return recetaViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Receta unaReceta = listaDeRecetas.get(position);
        RecetaViewHolder recetaViewHolder = (RecetaViewHolder) holder;
        recetaViewHolder.cargarReceta(unaReceta);
    }

    @Override
    public int getItemCount() {
        return listaDeRecetas.size();
    }

    private class RecetaViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewTitulo;
        private FrameLayout fondoLayoutRV;

        public RecetaViewHolder(View itemView) {
            super(itemView);

            textViewTitulo = (TextView) itemView.findViewById(R.id.textViewTitulo);
            fondoLayoutRV = (FrameLayout) itemView.findViewById(R.id.fondoLayoutRV);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Receta unaReceta = listaDeRecetas.get(getAdapterPosition());
                    notificable.notificarClick(unaReceta);
                }
            });
        }

        public void cargarReceta(Receta unaReceta){

            textViewTitulo.setText(unaReceta.getTitulo());
            fondoLayoutRV.setBackgroundResource(unaReceta.getFoto());
        }
    }

    public interface  NotificableDelClickRecycler{
        void notificarClick(Receta unaReceta);
    }

    public void setSearchResult(List<Receta> result) {
        listaDeRecetas = result;
        notifyDataSetChanged();
    }

}
