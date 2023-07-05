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
public abstract class Animal {
       protected boolean mammmals;
       protected boolean carnivorous;
       public static final int MOOD_HAPPY=1;
       public static final int MOOD_SCARE=0;
       protected int mood;

    public Animal(boolean mammmals, boolean carnivorous, int mood) {
        if(this instanceof Dog||this instanceof Cat){
            mammmals=true;
            carnivorous=true;
        }
        else if(this instanceof Frog){
            mammmals=false;
            carnivorous=false;
        }
        this.mammmals = mammmals;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }
    public void sayHello(){
    }
    public abstract void sayHello(int mood);
    public boolean isMammals(){
        return this.mammmals;
    }
    public void setMammmals(boolean mammmals) {
        this.mammmals = mammmals;
    }
    public boolean isCarnivious(){
        return this.carnivorous;
    }
    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }
    public void setMood(int mood){
        this.mood=mood;
    }
    
    
    
}
