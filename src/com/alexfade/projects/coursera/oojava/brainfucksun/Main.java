package com.alexfade.projects.coursera.oojava.brainfucksun;

/**
 *  For Processing look at https://www.processing.org/
 */

import processing.core.*;
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

        int[] color = sunColorSec(second());
        fill(color[0], color[1], color[2]);
        ellipse(150, 50, 60, 60);
    }

    private int[] sunColorSec(float sec) {
        int[] rgb = new int[3];

        float diffFrom30 = Math.abs(30-sec);
        float ratio = diffFrom30/30;

        rgb[0] = (int)(255*ratio);
        rgb[1] = (int)(255*ratio);
        rgb[2] = 0;

        return rgb;
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"--present", "com.alexfade.projects.coursera.oojava.brainfucksun.Main"});
    }
}
