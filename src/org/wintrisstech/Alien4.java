
package org.wintrisstech;

import java.awt.Color;

class Alien4 extends Alien 
{
    
    private int t = 0;

    public Alien4() {
        color = Color.red;
        x = r.nextInt(SpaceDodger.windowWidth);
        y = r.nextInt(SpaceDodger.windowHeight);
    }

    @Override
    public void update(Ship s) 
    {
        t++;
        if (t > 300) 
        {
            visible = false; 
        }
        
      x= s.x +100;
       
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
