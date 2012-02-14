package org.wintrisstech;

import java.awt.Color;

class PlainAlien extends Alien {
    
    private int t = 0;

    public PlainAlien() {
        color = Color.white;
        x = r.nextInt(SpaceDodger.windowWidth);
        y = r.nextInt(SpaceDodger.windowHeight);
    }

    @Override
    public void update(Ship ship) {
        t++;
        if (t > 300) {
            visible = false;
        }
        
         x = x -5;
       y = y -5;
       
       if (x<0)
           x = 1280;
       
       if (y<0)
           y = 720;
       
       
       
       
         if (t%15 == 0)
         {
            color= new Color(r.nextInt(255), r.nextInt(150), r.nextInt(50));
         
         }
                 
       
       
       
    }
    
}
