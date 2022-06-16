import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends World
{
    Label title = new Label("How to Play/2 Player", 50);
    Label line1 = new Label("* use WASD keys and arrow", 30);
    Label line2 = new Label("keys to control your yeti", 30);
    Label line3 = new Label("* eat as many penguins as possible", 30);
    Label line4 = new Label("while avoiding the santas", 30);
    Label line5 = new Label("* first to 25 points wins!", 30);
    Label Continue = new Label("<click space to play>", 50);
    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(title, 300, 60);
        addObject(line1, 300, 110);
        addObject(line2, 300, 160);
        addObject(line3, 300, 210);
        addObject(line4, 300, 260);
        addObject(line5, 300, 310);
        addObject(Continue, 300, 360);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
           MyWorld gameWorld = new MyWorld();
           Greenfoot.setWorld(gameWorld);
        }
    }
}
