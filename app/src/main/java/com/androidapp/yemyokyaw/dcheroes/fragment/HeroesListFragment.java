package com.androidapp.yemyokyaw.dcheroes.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidapp.yemyokyaw.dcheroes.R;
import com.androidapp.yemyokyaw.dcheroes.adapter.HeroAdapter;
import com.androidapp.yemyokyaw.dcheroes.data.HeroData;
import com.androidapp.yemyokyaw.dcheroes.data.HeroList;

import java.util.List;

/**
 * Created by yemyokyaw on 11/10/17.
 */

public class HeroesListFragment extends Fragment {

    RecyclerView rvHeroes;
    HeroAdapter mHeroAdaper;

    public static HeroesListFragment newInstance() {
        HeroesListFragment fragment = new HeroesListFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list_heroes, container, false);
        rvHeroes = (RecyclerView) rootView.findViewById(R.id.rv_heroes);
        List<HeroData> heroList = new HeroList().getHeroList(0);
        mHeroAdaper = new HeroAdapter(heroList);
        rvHeroes.setAdapter(mHeroAdaper);
        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext());
        rvHeroes.setLayoutManager(layoutManager);
        return rootView;
    }

}
