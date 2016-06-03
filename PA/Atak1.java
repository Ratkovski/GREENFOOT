import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Atak1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Atak1 extends Actor
{
   private int  contador2=0;
  
    /**
     * Act - do whatever the Atak1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int contador=0;
    public void act() 
    {
     this.setLocation(getX(),getY()+1);
     //  if(getY() == getWorld().getHeight()-1){
     // getWorld().removeObject(this);
     
      
     
     
     
     
     
      Actor alvo;
alvo =getOneObjectAtOffset(0,0,Rob1.class);
if(alvo!=null){
   // getWorld().removeObject(alvo);
  getWorld().addObject(new GameOver(),  getWorld().getWidth()/2,  getWorld().getHeight()/2);
     Greenfoot.stop();
   Greenfoot.playSound("Fatality.mp3");
    contador2++;
    //getWorld().showText("Vida:"+contador2,60,10);

     
        if(contador2==5){
  getWorld().addObject(new GameOver(),  getWorld().getWidth()/2,  getWorld().getHeight()/2);
     Greenfoot.stop();

}
}
if(getY() == getWorld().getHeight()+10)
       {
      getWorld().removeObject(this); 
      
    } 



}
}

      
    
    
 



