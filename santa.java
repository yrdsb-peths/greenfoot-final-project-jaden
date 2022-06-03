import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class santa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class santa extends Actor
{
    GreenfootImage[] santaWalkRight = new GreenfootImage[11];
    GreenfootImage[] santaWalkLeft = new GreenfootImage[11];
    
    
    
    SimpleTimer animationTimer = new SimpleTimer();
    String facing = "right";
    public santa()
    {
        for(int i = 1; i < santaWalkRight.length; i++)
        {
            GreenfootImage image = new GreenfootImage("images/santa/Run (" + i + ").png");
            image.scale(50, 50);
            santaWalkRight[i] = image;
        }
        
        for(int i = 1; i < santaWalkLeft.length; i++)
        {
            GreenfootImage image = new GreenfootImage("images/santa/Run (" + i + ").png");
            image.scale(50, 50);
            santaWalkLeft[i] = image;
            santaWalkLeft[i].mirrorHorizontally();
        }
        animationTimer.mark();
        
        setImage(santaWalkRight[0]);
    }
    int imageIndex = 0;
    /**
     * Act - do whatever the santa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void animateSantaWalk()
    {
        if(animationTimer.millisElapsed() < 300)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(santaWalkRight[imageIndex]);
            imageIndex = (imageIndex + 1) % santaWalkRight.length;
        }
        else
        {
            setImage(santaWalkLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % santaWalkLeft.length;
        }
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("a")){
            facing = "left";
            move(-5);
        }
        if(Greenfoot.isKeyDown("d")){
            facing = "right";
            move(5);
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+5);
        }
        if(Greenfoot.isKeyDown("space")){
            turn(2);
        }
        
        
        //animate santa
        animateSantaWalk();
            
    }

}
