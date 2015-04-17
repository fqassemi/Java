/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Farzad
 */
public class Demo {
    public static void main(String[] args) {

//This is a very simple program, a number runs from 1 to 100. For every divisors of 3 it print foo, 
//for every divisors of 5 it prints bar, and for divisible of 15, prints foobar.
//Otherwise, just print the number i itself. 
        
      int i=0;       
      while(++i<100)           
        switch (i%15) {
            case 0:
                System.out.println("foobar");
                break;            
            case 3:
            case 6:
            case 9:
            case 12:
                System.out.println("foo");
                break;
            case 5:
            case 10:
                System.out.println("bar");
                break;

            default:
                System.out.println(i);

        }


    }
}