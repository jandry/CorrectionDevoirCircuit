package com.tetras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircuitDeCourseTest {

    @Test
    public void MercedesTest() {
        VoitureDuChampionnatDeFormuleUn mercedesTest = VoitureFactory.getVoitureDuChampionnatDeFormuleUn(Constructeur.mercedes);
        assertEquals(Couleur.noir, mercedesTest.getColor());
    }

    @Test
    public void FerrariTest() {
        VoitureDuChampionnatDeFormuleUn ferrariTest = VoitureFactory.getVoitureDuChampionnatDeFormuleUn(Constructeur.ferrari);
        assertEquals(Couleur.rouge, ferrariTest.getColor());
    }

    @Test
    public void RenaultTest() {
        VoitureDuChampionnatDeFormuleUn renaultTest = VoitureFactory.getVoitureDuChampionnatDeFormuleUn(Constructeur.renault);
        assertEquals(Couleur.bleu, renaultTest.getColor());
    }

    @Test
    void SingletonTest() {
        SafetyCar safetyCar1 = SafetyCar.getInstance();
        SafetyCar safetyCar2 = SafetyCar.getInstance();
        assertEquals(safetyCar1, safetyCar2);
    }

    @Test
    void CircuitDeCourseTest() {
        CircuitDeCourse circuit = new CircuitDeCourse();
        assertEquals(3, circuit.getVoitures().size());
    }
}