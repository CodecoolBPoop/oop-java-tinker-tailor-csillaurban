package com.codecool.tinkertailor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TinkerTailor tinker = new TinkerTailor();
        List outcome = tinker.excludeElements(5, 3);
        System.out.println(outcome);
    }
}
