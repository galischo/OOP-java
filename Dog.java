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
public class Dog extends Animal implements Land{
       private int numberOfLegs;

    public Dog(boolean mammmals, boolean carnivorous, int mood) {
        super(mammmals, carnivorous, mood);
        this.numberOfLegs=4;
    }
    @Override
    public void sayHello(){
        System.out.println("wagging their tails");
    }

    @Override
    public void sayHello(int mood) {
        this.setMood(mood);
        if(mood==MOOD_HAPPY)
            System.out.println("woof");
        if(mood==MOOD_SCARE)
            System.out.println("whooping");
    }
    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }
    
}
