import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class M1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class M1 extends World
{
    public static int life = 3;
    public static int healt = 3;
    public static int score = 0;
    public static int level = 1;
   private GreenfootSound backgroundMusic = new GreenfootSound("djnandomix-dj-nando-mix-remix-internacional-aqua-row.mp3");
      
    
    private Rob1 rob;
    private int novoAsteroid;
    private int novoAtack;
    public M1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
          super(1140, 570,1); 
          rob = new Rob1();
        addObject(rob, 400,560);
        rob.setRotation(270);
        novoAsteroid = 0;
        novoAtack=0;

}

   public void started()
    {
        backgroundMusic.playLoop();
    }
    
    public void stopped()
    {
        backgroundMusic.pause();
    }


    
    
    public void act()
    {
       MouseInfo m = Greenfoot.getMouseInfo();
       
       novoAsteroid++;
       if (novoAsteroid == 30)
       {
         this.addObject(new Alvo2(), 
         Greenfoot.getRandomNumber(800), -10);
         novoAsteroid = 0;
       }
        novoAtack++;
       if (novoAtack == 150)
       {
         this.addObject(new Atak1(), 
         Greenfoot.getRandomNumber(800), -10);
         novoAtack = 0;
       }
       if (m != null)
       {
          rob.apontar(m.getX(), m.getY());
          
          if (Greenfoot.mousePressed(null))
          {
           rob.tiro(m.getX(), m.getY());
          }
       }
     
       
    }
}
