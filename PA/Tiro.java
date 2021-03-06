import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiro extends Actor
{
   
    
    private int PosX, PosY;
    private int velocidade;
    private boolean precisagirar;
    
    public Tiro(int x, int y)
    {
       PosX = x;
       PosY = y;
       velocidade = 10;
       precisagirar = true;
    }
    
    public void act() 
    {
        
        if (Math.abs(getX() - PosX) < 10 
        && Math.abs(getY() - PosY) < 10)
       precisagirar = false;
       
       
       if (precisagirar)
       turnTowards(PosX,PosY);
       
       move(velocidade);
       
       int maxX = getWorld().getWidth();
       int maxY = getWorld().getHeight();
            
        Actor asteroid;
        
        asteroid = getOneObjectAtOffset(0, 0,Atak1.class);
        
        if (asteroid != null)
        {
           getWorld().removeObject(asteroid);
           Greenfoot.playSound("explosao.wav");
        }
        
        if ((getX() <= 0) || (getX() >= maxX-1)
           || (getY() <= 0) || (getY() >= maxY-1))
           getWorld().removeObject(this);
           
    }    
}