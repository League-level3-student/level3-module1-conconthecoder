package _03_RemovingStuffFromArrayLists;

import java.util.ArrayList;

public class ArrayListRemove {

    class Stuff {
        public String type;
    }
    
    class Worm extends Stuff {
        public Worm() {
            type = "worm";
        }
    }
    
    class Dirt extends Stuff {
        public Dirt() {
            type = "dirt";
        }
    }
    
   

    // 1. Write a method that removes the dirt in the yard and returns the
    //    ArrayList
 
    public static ArrayList<Stuff> cleanOutTheYard( ArrayList<Stuff> yard ) {
    	int g = 0;
    	ArrayList<Stuff> dog = new ArrayList<Stuff>();
    	for (int i = 0; i < yard.size(); ++i) {
        	if (yard.get(i).type != "dirt") dog.add(yard.get(i));
        	g++;
        }
        return dog;
    }
    
    // 2. Write a method that removes the hash tag ('#') characters from the
    //    ArrayList and returns it
    public static ArrayList<Character> removeHashTags(ArrayList<Character> list) {
    	ArrayList<Character> dogs = new ArrayList<Character>();
    	for (Character i: list) {
    		if (i == '#') continue;
    		dogs.add(i);
    	}
        return dogs;
    }
}
