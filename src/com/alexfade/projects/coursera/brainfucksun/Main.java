package com.alexfade.projects.coursera.brainfucksun;

import processing.core.*;

import java.util.Date;
import java.util.Random;

public class Main extends PApplet {

    private String url = "http://hdwallpaperhub.net/wallpapers/m/9/boat_sea_beach_m8550.jpg";
    private PImage backgroundImg;

    public void settings() {
        size(441, 248);
//        size(200, 200);
    }

    public void setup() {
        backgroundImg = loadImage(url, "jpg");
    }

    public void draw() {
        Random rndR = new Random();
        Random rndG = new Random();
        Random rndB = new Random();
        backgroundImg.resize(0, height);
        image(backgroundImg, 0, 0);

        fill(rndR.nextInt(), rndG.nextInt(), rndB.nextInt());

        ellipse(50, 50, 60, 60);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"--present", "com.alexfade.projects.coursera.brainfucksun.Main"});
    }
}
