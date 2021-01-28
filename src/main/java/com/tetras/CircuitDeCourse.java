package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class CircuitDeCourse {

    private List<VoitureDuChampionnatDeFormuleUn> voitures = new ArrayList<>();

    private SafetyCar safetyCar = SafetyCar.getInstance();

    public CircuitDeCourse() {
        voitures.add(VoitureFactory.getVoitureDuChampionnatDeFormuleUn(Constructeur.ferrari));
        voitures.add(VoitureFactory.getVoitureDuChampionnatDeFormuleUn(Constructeur.renault));
        voitures.add(VoitureFactory.getVoitureDuChampionnatDeFormuleUn(Constructeur.mercedes));
    }

    public List<VoitureDuChampionnatDeFormuleUn> getVoitures() {
        return voitures;
    }

    public SafetyCar getSafetyCar() {
        return safetyCar;
    }
}