package com.androidapp.yemyokyaw.dcheroes.data;

/**
 * Created by yemyokyaw on 11/10/17.
 */

public class HeroData {

    private int id;
    private String name;
    private String bio;
    private int imgId;
    private int gender;

    public HeroData(){
        super();
        clearAllData();
    }

    public HeroData(int id, String name, String bio, int imgId, int gender) {
        this.id = id;
        this.name = name;
        this.bio = bio;
        this.imgId = imgId;
        this.gender = gender;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    private void clearAllData() {
        this.id = 0;
        this.name = "";
        this.bio = "";
        this.imgId = 0;
        this.gender = 0;
    }
}
