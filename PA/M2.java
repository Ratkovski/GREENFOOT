import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class M2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class M2 extends World
{
  
  
   private int NovoDado;
   private int NovaAlvo;
   private Atak2 Atk;
    public M2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        NovoDado=0;
        NovaAlvo=0;
       Atk = new Atak2();
        addObject(Atk, 400,565);
        
    }
    public void act(){
    NovoDado++;
    if(NovoDado ==30){
        this.addObject(new Alvo3(),Greenfoot.getRandomNumber(800) , -10);
        NovoDado=0;
    }
    NovaAlvo++;
    if(NovaAlvo==900){
     this.addObject(new Mat(),Greenfoot.getRandomNumber(800) , -10);
        NovaAlvo=0;
    }
    }
    
        
}