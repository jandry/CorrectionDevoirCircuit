package com.tetras;

public class Voiture implements VoitureDuChampionnatDeFormuleUn {

    Couleur couleur; 

    Constructeur constructeur; 

    public Voiture(Constructeur constructeur) {
        this.constructeur = constructeur;
        switch(constructeur) {
            case ferrari:
              this.couleur=Couleur.rouge;
              break;
            case renault:
              this.couleur=Couleur.bleu;
              break;            
            case mercedes:
              this.couleur=Couleur.noir;
              break;
            default:
              throw new IllegalArgumentException();
        }
    }

    @Override
    public void tourner() {
        System.out.println("tourner");
    }

    @Override
    public void freiner() {
        System.out.println("freiner");
    }

    @Override
    public void accelerer() {
        System.out.println("accelerer");
    }

    @Override
    public Couleur getColor() {
        return couleur;
    }

    @Override
    public Constructeur getConstructeur() {
        return constructeur;
    }
    
}