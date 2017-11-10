package com.androidapp.yemyokyaw.dcheroes.data;

import com.androidapp.yemyokyaw.dcheroes.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yemyokyaw on 11/10/17.
 */

public class HeroList {

    private ArrayList<HeroData> dataList;

    public HeroList() {
        dataList = new ArrayList<>();
        HeroData hero = new HeroData(1, "Superman", "Superman is the purest distillation of everything we love about heroes. He has the tragic, almost Biblical origin - a baby is sent hurtling from a doomed planet, is adopted by a human couple, and grows up to become the world's premiere defender of Truth, Justice, and the American Way.", R.drawable.img_001, 1);
        dataList.add(hero);
        hero = new HeroData(2,"Batman", "Batman has no superhuman abilities. He merely has the training, the resources, and most importantly, the will to wage a one-man war on crime. And it's a testament to that will that no one ever questions whether Batman has what it takes to stand alongside the rest of the Justice League. ", R.drawable.img_002, 1);
        dataList.add(hero);
        hero = new HeroData(3,"Wonder Woman", "Wonder Woman has been a DC icon ever since her 1940 debut. She was created by the same psychologist who invented the polygraph test, which explains the magical \"Lasso of Truth\" she wields alongside her unbreakable gauntlets and her Amazonian strength. ", R.drawable.img_003, 2);
        dataList.add(hero);
        hero = new HeroData(4, "The Flash", "Barry assumed the mantle of the Flash from Golden Age hero Jay Garrick. He quickly proved to be one of the most popular of DC's new wave of heroes thanks to his almost limitless speed powers.", R.drawable.img_004, 1);
        dataList.add(hero);
        hero = new HeroData(5, "Green Lantern", "Hal became the first human ever to wield a ring, and his adventures have taken him from one end of the universe to the other, and places beyond.", R.drawable.img_005, 1);
        dataList.add(hero);
        hero = new HeroData(6, "Aquaman", "Aquaman is not only as strong and capable in battle as anyone who swims miles under the surface of the ocean would need to be, he's the leader of the vast underwater kingdom of Atlantis.", R.drawable.img_006, 1);
        dataList.add(hero);
        hero = new HeroData(7, "Shazam", "The hero once known as Captain Marvel, an ordinary boy who could transform into the World's Mightiest Mortal simply by uttering the word \"Shazam!\".", R.drawable.img_007, 1);
        dataList.add(hero);
        hero = new HeroData(8, "Cybrog", "Vic Stone is more machine than man, but don't call him twisted or evil. He emerged from a near-fatal accident to become one of the greatest of a new generation of heroes among the Teen Titans.", R.drawable.img_008, 1);
        dataList.add(hero);
        hero = new HeroData(9, "Catwoman", "Selina Kyle may be a thief (possibly the best in the world), but she also fights fiercely for those she cares about. She's also one of the few people who can lead Batman on a merry chase.", R.drawable.img_009, 2);
        dataList.add(hero);
        hero = new HeroData(10, "Supergirl", "Supergirl has been a mainstay of the Superman franchise since her debut in 1959. Like Mary Marvel and Batgirl, she was an early example of a female sidekick developing a large fanbase in her own right.", R.drawable.img_010, 2);
        dataList.add(hero);
    }

    public List<HeroData> getHeroList(int gender) {
        if(gender == 0)
            return dataList;
        else {
            ArrayList<HeroData> heroes = new ArrayList<>();
            if(gender == 1){
                for(HeroData d: dataList) {
                    if(d.getGender() == 1)
                        heroes.add(d);
                }
                return heroes;
            } else if(gender == 2){
                for(HeroData d: dataList) {
                    if(d.getGender() == 2)
                        heroes.add(d);
                }
                return heroes;
            } else
                return null;
        }
    }
}
