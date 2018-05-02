package com.example.dh.entregable2.View;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.dh.entregable2.Model.POJO.Receta;

import java.util.ArrayList;
import java.util.List;

public class RecetasVPAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> listaFragments;

    public RecetasVPAdapter(FragmentManager fm, List<Receta> listaDeRecetas) {
        super(fm);
        listaFragments = new ArrayList<>();

        for (Receta unaReceta : listaDeRecetas) {
            RecetasVPFragment recetasVPFragment = RecetasVPFragment.fabricaFragmentsRecetas(unaReceta);
            listaFragments.add(recetasVPFragment);
        }
    }

    @Override
    public Fragment getItem(int position) {
        return listaFragments.get(position);
    }

    @Override
    public int getCount() {
        return listaFragments.size();
    }
}
