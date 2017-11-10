package com.androidapp.yemyokyaw.dcheroes.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidapp.yemyokyaw.dcheroes.R;
import com.androidapp.yemyokyaw.dcheroes.data.HeroData;
import com.androidapp.yemyokyaw.dcheroes.data.HeroList;
import com.androidapp.yemyokyaw.dcheroes.view.holder.HeroViewHolder;

import java.util.List;

/**
 * Created by yemyokyaw on 11/10/17.
 */

public class HeroAdapter extends RecyclerView.Adapter<HeroViewHolder>  {

    private LayoutInflater mInflater;
    private List<HeroData> mHeroList;

    public HeroAdapter(List<HeroData> dataList) {
        mHeroList = dataList;
    }

    @Override
    public HeroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context c = parent.getContext();
        mInflater = LayoutInflater.from(c);
        View itemView = mInflater.inflate(R.layout.view_hero, parent, false);
        return new HeroViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HeroViewHolder holder, int position) {
        holder.bindData(mHeroList.get(position));
    }

    @Override
    public int getItemCount() {
        return mHeroList.size();
    }
}
