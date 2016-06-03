import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alvo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alvo2 extends Actor
{   

    public void act() 
    {
        this.setLocation(getX(),getY()+1);
       if(getY() == getWorld().getHeight()-1){
      getWorld().removeObject(this);     
    }    
}
}