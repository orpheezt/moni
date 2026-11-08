package edu.triagesim;

import java.util.UUID;
import java.util.Random;

public class PatientGenerator {
    private static final String[] NP1 = {
            "John", "Jane", "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ian", "Jack",
            "Kathy", "Liam", "Mia", "Noah", "Olivia", "Paul", "Quinn", "Rachel", "Sam", "Tina", "Uma", "Victor",
            "Wendy", "Xander", "Yara", "Zane", "Oliver", "Sophia", "Lily", "James", "Emily", "Michael", "Ava",
            "William", "Isabella", "Benjamin",
    };

    private static final String[] NP2 = {
            "Doe", "Smith", "Johnson", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas",
            "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez",
            "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "King", "Wright", "Scott", "Torres", "Nguyen", "Hill",
            "Flores", "Green", "Adams", "Nelson", "Baker", "Hall", "Rivera",
    };

    private static final Random rng = new Random();

    public static Patient generate() {
        var n1 = rng.nextInt(NP1.length);
        var n2 = rng.nextInt(NP2.length);
        var age = rng.nextInt(100);
        return new Patient(UUID.randomUUID(), NP1[n1] + " " + NP2[n2], age);
    }
}
