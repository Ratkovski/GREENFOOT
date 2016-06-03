import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rob1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rob1 extends Actor
{
     private int contador=0;
      private int contador2=0;
     
     
   
public void act(){


        
Actor alvo;
alvo =getOneObjectAtOffset(0,0,Alvo2.class);
if(alvo!=null){
    getWorld().removeObject(alvo);

   Greenfoot.playSound("coin.wav");
    contador++;
    getWorld().showText("Vida:"+contador,60,10);

     
        if(contador==5){
  getWorld().addObject(new YouWin(),  getWorld().getWidth()/2,  getWorld().getHeight()/2);
     Greenfoot.stop();

}

/*Actor atack;

atack=getOneObjectAtOffset(0,0,Atak1.class);
if(atack!=null){
    getWorld().removeObject(this);



}*/
}
    




}
     public void apontar(int x, int y)
     {
        turnTowards(x,y);        
      }
      
      public void tiro(int x, int y)
      {
        Tiro missel = new Tiro(x,y);
          getWorld().addObject(missel, getX(), getY());
          Greenfoot.playSound("tiro.wav");
      
              }
           }  


        
    