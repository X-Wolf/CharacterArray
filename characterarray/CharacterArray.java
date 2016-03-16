/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterarray;

/**
 *
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
                System.out.print(Character.toLowerCase(chars[i]) + " Letter \n");
                chars2[i] = (Character.toLowerCase(chars[i]));
            } else if(Character.isDigit(chars[i])){
                System.out.print("* Digit" +"\n");
                chars2[i] = '*';
            } else {
                System.out.print(Character.toUpperCase(chars[i]) + " Letter \n");
                chars2[i] = (Character.toUpperCase(chars[i]));
            }

            
        }
        System.out.println("The new array is " + String.valueOf(chars2));
    }
    
}
