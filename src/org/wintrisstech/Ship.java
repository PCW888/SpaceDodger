package org.wintrisstech;

import java.awt.Color;
import java.awt.Graphics2D;

class Ship {
    
    public int x = SpaceDodger.windowWidth/2;
    public int y = SpaceDodger.windowWidth/2;
    private double vx = 0;
    private double vy = 0;
    public int w = 20;
    public int h = 20;
    private double heading = 2*Math.PI * 3/4;
    private double impulse = 30;
    private double maxSpeed = 50;
    private double damping = 0.8;

    void paint(Graphics2D g2) {
        g2.rotate(heading, x, y);
        g2.setColor(Color.yellow);
        g2.fillOval(x-w/2, y-h/2, w, h);
        g2.setColor(Color.black);
        g2.fillOval(x+w/2-6, y-3, 6, 6);
        g2.rotate(-heading, x, y);
    }

    void rotateRight() {
        heading += .2;
    }
    
    void rotateLeft() {
        heading -= .2;
    }
    
    void accelerate() {
        // Add speed in the direction of our current heading
        vx += impulse * Math.cos(heading);
        vy += impulse * Math.sin(heading);
        // Limit our speed to maxSpeed, but don't change the direction
        double speed = Math.sqrt(vx*vx + vy*vy);
        if (speed > maxSpeed) {
            vx *= maxSpeed / speed;
            vy *= maxSpeed / speed;
        }
    }
    
    void update(Ship s) {
        // Move the ship
        x += vx;
        y += vy;
        while (x < 0) {
            x += SpaceDodger.windowWidth;
        }
        while (x > SpaceDodger.windowWidth) {
            x -= SpaceDodger.windowWidth;
        }
        //while (y < 0) {
            //y += SpaceDodger.windowHeight;
        //}
        //while (y > SpaceDodger.windowHeight) {
            //y -= SpaceDodger.windowHeight;
        //}
            
        // Make the ship slow down over time
        vx *= damping;
        vy *= damping;
    }
    
    
}
