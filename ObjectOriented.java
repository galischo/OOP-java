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
       Cat c=new Cat(true,true,Animal.MOOD_HAPPY);
       Dog d=new Dog(true,true,Animal.MOOD_SCARE);
       Frog f=new Frog(false,false,Animal.MOOD_HAPPY);
       c.sayHello();
       d.sayHello(Animal.MOOD_HAPPY);
       System.out.println(f.isCarnivious());
       System.out.println(f.hasGills());
       
    }
    
}
