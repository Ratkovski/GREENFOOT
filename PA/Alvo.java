import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alvo extends Actor
{
  
    private int deltaX;
    private int deltaY;
    private int cont1;
    private int cont2;
    
    public Alvo(){
        deltaX= Greenfoot.getRandomNumber(11)-5;
        deltaY= Greenfoot.getRandomNumber(11)-5;
        cont1=0;
        cont2=0;
        
    }
    
    public void mover(){
        setLocation(getX()+deltaX,getY()+deltaY);
    }
   
    
    
    
    
    public void VerParede(){
        
        if(getY() ==0 ){
            cont1++;
            getWorld().showText("Placar:"+cont1,60,getWorld().getHeight()-10);
        Greenfoot.playSound("coin.wav");
        }
        
         if(getY() ==getWorld().getHeight()-1 ){
            cont2++;
            getWorld().showText("Placar:"+cont2,60,10);
        Greenfoot.playSound("coin.wav");
        }
        
        if(getX()==0 ||getX()==getWorld().getWidth()-1){
            deltaX = -deltaX;
            Greenfoot.playSound("coin.wav");
        }
        
         if(getY()==0 ||getY()==getWorld().getHeight()-1){
            deltaY = -deltaY;
            Greenfoot.playSound("coin.wav");
        }
       
    }
    
    public void VerJ(){
    Actor j1 = getOneIntersectingObject(J1.class);
    if(j1 !=null){
        deltaY = - deltaY;
    }
    
     Actor j2 = getOneIntersectingObject(J2.class);
    if(j2 !=null){
        deltaY = - deltaY;
    }
    
    }
    
    public void Ganha(){
        if (cont1 >= 10)
        {
            Greenfoot.setWorld(new M1());
           
              
    } 
     if (cont2 >= 3)
        {
            Greenfoot.setWorld(new M2());
           
              
    } 
    
    }
  
    
    public void act() 
    {
       mover();
       VerParede();
       VerJ();
       Ganha();
       
      
      
    }    
}
