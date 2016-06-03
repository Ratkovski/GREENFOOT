import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Atak2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Atak2 extends Actor
{
     private int contador=0;


    public void act(){

 {
      if(Greenfoot.isKeyDown("left")){
          move(-5);
           
    }  
         {
      if(Greenfoot.isKeyDown("right")){
          move(5);
            
    } 



Actor d;
d=getOneObjectAtOffset(0,0,Alvo3.class);
if(d!=null){
    getWorld().removeObject(d);

   Greenfoot.playSound("coin.wav");
    contador++;
    getWorld().showText("Dados:"+contador,60,10);
       if(contador==5){
  getWorld().addObject(new YouWin(),  getWorld().getWidth()/2,  getWorld().getHeight()/2);
     Greenfoot.stop();  

    }

Actor mat ;

mat=getOneObjectAtOffset(0,0,Mat.class);
if(mat!=null){
    getWorld().removeObject(this);

}
}
}}


}}

