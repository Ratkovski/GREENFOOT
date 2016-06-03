import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mat extends Actor
{
   private int  contador2=0;
    /**
     * Act - do whatever the Mat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    this.setLocation(getX(),getY()+5);
          
      
    
    /*
     Actor at2;
   at2 = getOneObjectAtOffset(0,0,Atak2.class);
    if(at2!=null)//achou carangueijo
    {
     World mundo;
     mundo=getWorld();
     mundo.removeObject(at2);
     Greenfoot.playSound("laser.wav");
     //Greenfoot.stop();
     mundo.addObject(new GameOver(),mundo.getWidth()/2,mundo.getHeight()/2);
     
    
    }*/
    Actor alvo;
alvo =getOneObjectAtOffset(0,0,Atak2.class);
if(alvo!=null){
   // getWorld().removeObject(alvo);
  getWorld().addObject(new GameOver(),  getWorld().getWidth()/2,  getWorld().getHeight()/2);
     Greenfoot.stop();
   Greenfoot.playSound("Fatality.mp3");
    contador2++;
    //getWorld().showText("Vida:"+contador2,60,10);

     
        if(contador2==1){
  getWorld().addObject(new GameOver(),  getWorld().getWidth()/2,  getWorld().getHeight()/2);
     Greenfoot.stop();

}
}
if(getY() == getWorld().getHeight()-1)
       {
      getWorld().removeObject(this); 
      
    } 
    


}
}
