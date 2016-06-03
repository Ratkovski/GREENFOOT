import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JogoPaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
 private GreenfootSound backgroundMusic = new GreenfootSound("djnandomix-dj-nando-mix-remix-internacional-aqua-row.mp3");
    /**
     * Constructor for objects of class JogoPaddle.
     * 
     */
    public  MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       // super(1100, 600,1); 
        super(1100, 600,1);

        
        addObject(new Alvo(),getWidth()/2,getHeight()/2);
        addObject(new J1(),getWidth()/2,getHeight()-15);
        addObject(new J2(),getWidth()/2,15);
    }
    
    
   public void started()
    {
        backgroundMusic.playLoop();
    }
    
    public void stopped()
    {
        backgroundMusic.pause();
    }

}
