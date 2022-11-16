package com.ute.jspservlettutorial.beans;

public class Category {
    private int CatID;
    private String CateName;

    public Category() {
    }

    public Category(int catID, String cateName) {
        CatID = catID;
        CateName = cateName;
    }

    public int getCatID() {
        return CatID;
    }

    public void setCatID(int catID) {
        CatID = catID;
    }

    public String getCateName() {
        return CateName;
    }

    public void setCateName(String cateName) {
        CateName = cateName;
    }
}
