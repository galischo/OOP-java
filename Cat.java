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
public class Cat extends Animal implements Land{
    private int numberOfLegs;

    public Cat(boolean mammmals, boolean carnivorous, int mood) {
        super(mammmals, carnivorous, mood);
        this.numberOfLegs=4;
    }
    @Override
    public void sayHello(){
        System.out.println("meow");
    }

    @Override
    public void sayHello(int mood) {
        if(mood==MOOD_HAPPY)
            System.out.println("purr purr");
        if(mood==MOOD_SCARE)
            System.out.println("hiss");
    }
    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    
    
}
