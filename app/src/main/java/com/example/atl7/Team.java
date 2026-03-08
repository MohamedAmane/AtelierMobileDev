package com.example.atl7;

public class Team {
    private String nom;
    private int imageResId;

    public Team(String nom, int imageResId) {
        this.nom = nom;
        this.imageResId = imageResId;
    }
    public String getNom() {
        return nom;
    }

    public int getImageResId() {
        return imageResId;
    }
}
