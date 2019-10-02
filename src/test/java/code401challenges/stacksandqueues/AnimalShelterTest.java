package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    AnimalShelter seattleShelter;
    @Before
    public void setup(){
        seattleShelter = new AnimalShelter();

    }

    @Test
    public void enQ() {
        seattleShelter.enQ("dog");
        seattleShelter.enQ("cAt");
        seattleShelter.enQ("dog");
        seattleShelter.enQ("Cat");
        seattleShelter.enQ("dOg");
        assertEquals(3,seattleShelter.dogQ.size());
    }

    @Test
    public void dQ() {
    }
}