package com.alexfade.projects.coursera.oojava.happyface;

/**
 * Created by Alexander Kovalevsky on 29.09.15.
 * Project name: coursera-oojava
 */

import processing.core.*;

public class HappyFace extends PApplet{
    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(200, 200, 200);
    }

    public void draw() {
        fill(255, 255, 0);
        ellipse(200, 200, 390, 390);
        fill(0, 0, 0);
        ellipse(120, 130, 50, 70);
        ellipse(280, 130, 50, 70);

        noFill();
        arc(150, 280, 100, 100, 0, PI);
        arc(250, 280, 100, 100, 0, PI);

    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"--present", "com.alexfade.projects.coursera.oojava.happyface.HappyFace"});
    }
}
