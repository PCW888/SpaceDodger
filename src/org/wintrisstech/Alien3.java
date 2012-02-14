
package org.wintrisstech;

import java.awt.Color;

class Alien3 extends Alien 
{
    
    private int t = 0;

    public Alien3() {
        color = Color.red;
        x = r.nextInt(SpaceDodger.windowWidth);
        y = r.nextInt(SpaceDodger.windowHeight);
    }

    @Override
    public void update(Ship ship) 
    {
        t++;
        if (t > 250) 
        {
            visible = false; 
        }
        
       x = x -10;
       y = y -10;
       
       if (x<0)
           x = 1280;
       
       if (y<0)
           y = 720;
       
       if (t%15 == 0)
         {
            color= new Color(r.nextInt(175), r.nextInt(245), r.nextInt(233));
         
         }
        
        
    }
    
}
