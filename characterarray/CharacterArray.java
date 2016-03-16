/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterarray;

/**
 *Unit 3 Problem 6. The purpose of this program is to take an String provided
 * and convert it into an array. Then turn lower case letters to upper case
 * and vice versa and turn digits into asterisks.
 * @author Xuaco
 */
public class CharacterArray {
    
    public static void main(String[] args) {
        char[] chars = "6901 Sudley Road Manassas VA".toCharArray();
        char[] chars2 = new char[chars.length];
        System.out.println("The original array is " + String.valueOf(chars));
        
        for (int i = 0; i < chars.length; i++){

            System.out.print((Character)chars[i] + " ");
            if(Character.isUpperCase(chars[i])){
                System.out.print("is a letter " + Character.toLowerCase(chars[i]) + "\n");
                chars2[i] = (Character.toLowerCase(chars[i]));
            } else if(Character.isDigit(chars[i])){
                System.out.print("is a Digit  *" +"\n");
                chars2[i] = '*';
            } else {
                System.out.print("is a letter " + Character.toUpperCase(chars[i]) + "\n");
                chars2[i] = (Character.toUpperCase(chars[i]));
            }

            
        }
        System.out.println("The new array is " + String.valueOf(chars2));
    }
    
}
