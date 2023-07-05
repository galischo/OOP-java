/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectoriented;

/**
 *
 * @author Avigail Schory
 */
public class Frog extends Animal implements Land,Water{
    private int numberOfLegs;

    public Frog(boolean mammmals, boolean carnivorous, int mood) {
        super(mammmals, carnivorous, mood);
        this.numberOfLegs=4;
    }

    @Override
    public void sayHello(int mood) {
         if(mood==MOOD_HAPPY)
            System.out.println("quack quack quack");
        if(mood==MOOD_SCARE)
            System.out.println("plop in to the water");
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public boolean hasGills() {
        return true;
    }

    @Override
    public boolean hasLaysEggs() {
        return true;
    }
    
    
}
