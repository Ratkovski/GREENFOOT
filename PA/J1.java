import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class J1 extends Actor
{
    /**
     * Act - do whatever the Paddle2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          if(Greenfoot.isKeyDown("A")){
            move(-9);
  
        }
            if(Greenfoot.isKeyDown("D")){
            move(9);
  
        }
    }    
}
