package com.androidapp.yemyokyaw.dcheroes.view.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidapp.yemyokyaw.dcheroes.R;
import com.androidapp.yemyokyaw.dcheroes.data.HeroData;

/**
 * Created by yemyokyaw on 11/10/17.
 */

public class HeroViewHolder extends RecyclerView.ViewHolder {

    TextView tvHreoName;
    TextView tvHeroBio;
    TextView tvHeroGender;
    ImageView ivHeroImg;

    public HeroViewHolder(View itemView) {
        super(itemView);
        tvHreoName = (TextView) itemView.findViewById(R.id.tv_hero_name);
        tvHeroBio = (TextView) itemView.findViewById(R.id.tv_hero_bio);
        tvHeroGender = (TextView) itemView.findViewById(R.id.tv_hero_gender);
        ivHeroImg = (ImageView) itemView.findViewById(R.id.rv_img_hero);
    }

    public void bindData(HeroData hero) {
        tvHreoName.setText(hero.getName());
        tvHeroBio.setText(hero.getBio());
        tvHeroGender.setText(hero.getGender()==1?"Male":"Female");
        ivHeroImg.setImageResource(hero.getImgId());
    }

}



