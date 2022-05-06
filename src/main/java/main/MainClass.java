package main;

import backend.random.RandomGraphGenerator;
import frontend.Style;

import java.io.BufferedReader;

public class MainClass {
    public static void main(String[] args) {

        RandomGraphGenerator rgg = new RandomGraphGenerator();
        rgg.BipartiteGraphCreator(100,50);
//        rgg.AddStyle();
        rgg.GraphDisplay();


    }
}
