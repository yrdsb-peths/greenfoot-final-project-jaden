import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class santa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class santa extends Actor
{
    /**
     * Act - do whatever the santa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] slide = new GreenfootImage[10];
    SimpleTimer animation = new SimpleTimer();
    public void act()
    {
        // Add your action code here.
        movement();
        
    }
    public void movement()
    {
        animate();
        if(DifficultyScreen.difficulty == ("easy"))
        {
            move(2);
        }
        if(DifficultyScreen.difficulty == ("medium"))
        {
            move(5);
        }
        if(DifficultyScreen.difficulty == ("hard"))
        {
            move(10);
        }
        if (Greenfoot.getRandomNumber(100) < 15) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(179);
        }
    }
    public santa()
    {

        for(int i = 0; i < 10; i++)
        {
            slide[i] = new GreenfootImage("images/Slide (" + i + ").png");
             
            slide[i].scale(130, 130);
        }
        
        setImage(slide[0]);
        animation.mark();
        GreenfootImage image = getImage();  
        image.scale(130, 130);
        setImage(image);
    }
    int imageIndex = 0;
    public void animate()
    {
        if(animation.millisElapsed() < 500)
        {
            return;
        }
        animation.mark();
        
        
        setImage(slide[imageIndex]);
        imageIndex = (imageIndex + 1) % slide.length;
        
        
    }
}
