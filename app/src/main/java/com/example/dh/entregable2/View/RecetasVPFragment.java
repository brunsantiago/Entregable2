package com.example.dh.entregable2.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dh.entregable2.Model.POJO.Receta;
import com.example.dh.entregable2.R;


public class RecetasVPFragment extends Fragment {

    public static final String RECETA = "Receta";

    public RecetasVPFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recetas_vp, container, false);

        LinearLayout layoutFoto = (LinearLayout) view.findViewById(R.id.layoutFoto);
        TextView textViewTitulo = (TextView) view.findViewById(R.id.textViewTitulo);
        TextView textViewDescripcion = (TextView) view.findViewById(R.id.textViewDescripcion);
        TextView textViewIngredientes = (TextView) view.findViewById(R.id.textViewIngredientes);
        TextView textViewPreparacion = (TextView) view.findViewById(R.id.textViewPreparacion);


        Bundle bundle = getArguments();
        Receta unaReceta = (Receta) bundle.getSerializable(RECETA);
        layoutFoto.setBackgroundResource(unaReceta.getFoto());
        textViewTitulo.setText(unaReceta.getTitulo());
        textViewDescripcion.setText(unaReceta.getDescripcion());
        textViewIngredientes.setText(unaReceta.getIngredientes());
        textViewPreparacion.setText(unaReceta.getPreparacion());

        return view;
    }

    public static RecetasVPFragment fabricaFragmentsRecetas(Receta unaReceta){

        RecetasVPFragment recetaVPFragment = new RecetasVPFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(RECETA,unaReceta);
        recetaVPFragment.setArguments(bundle);
        return recetaVPFragment;
    }

}
