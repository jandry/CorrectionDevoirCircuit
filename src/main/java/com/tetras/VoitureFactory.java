package com.tetras;

public class VoitureFactory {
    public static VoitureDuChampionnatDeFormuleUn getVoitureDuChampionnatDeFormuleUn (Constructeur constructeur) {
        return new Voiture(constructeur);
    }
}