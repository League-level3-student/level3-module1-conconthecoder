package _00_Intro_To_ArrayLists;
import java.util.ArrayList;
public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	ArrayList<String> dog = new ArrayList<String>();
    	System.out.println("-------------------------------------");
        // 2. Add five Strings to your list
    	dog.add("hi");
    	dog.add("boogers");
    	dog.add("hi");
    	dog.add("blade");
    	dog.add("hi");
    	System.out.println("-------------------------------------");
        // 3. Print all the Strings using a standard for-loop
    	for (int i = 0; i<dog.size(); i++) {
    		System.out.println(dog.get(i));
    	}
    	System.out.println("-------------------------------------");
        // 4. Print all the Strings using a for-each loop
    	for (String i: dog) {
    		System.out.println(i);
    	}
    	System.out.println("-------------------------------------");
        // 5. Print only the even numbered elements in the list.
    	for (int i =0; i<dog.size(); i +=2) {
    		System.out.println(dog.get(i));
    	}
    	System.out.println("-------------------------------------");
        // 6. Print all the Strings in reverse order.
    	for (int i = dog.size()-1; i >=0 ; i--) {
    		System.out.println(dog.get(i));
    	}
    	System.out.println("-------------------------------------");
        // 7. Print only the Strings that have the letter 'e' in them.
        for (String i:dog) {
        	if (i.indexOf("e") != -1) System.out.println(i);
     
        }
    }
}
