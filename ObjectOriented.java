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
public class ObjectOriented {

    
    public static void main(String[] args) {
        //cat object
       Cat c=new Cat(true,true,Animal.MOOD_HAPPY);
       //dog object
       Dog d=new Dog(true,true,Animal.MOOD_SCARE);
       //frog object
       Frog f=new Frog(false,false,Animal.MOOD_HAPPY);
       //try the funtions
       c.sayHello();
       d.sayHello(Animal.MOOD_HAPPY);
       System.out.println(f.isCarnivious());
       System.out.println(f.hasGills());
       //polymorphism 
       Animal a=new Frog(false,true,Animal.MOOD_SCARE);
       System.out.println(a.isMammals());
       a.sayHello(Animal.MOOD_HAPPY);
       System.out.println(((Frog)(a)).hasLaysEggs());
       
    }
    
}
