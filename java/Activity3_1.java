package automationFramework;
import java.util.*;

public class Activity3_1 {

	public static void main(String[] args) {
		//Declaring ArrayList
		ArrayList<String> myList = new ArrayList<String>();
		 //Adding objects to Array List at default index
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");
        //Adding object at specific index
        myList.add(3, "Grapes");
        myList.add(1, "Papaya");
        //Printing Names
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
           System.out.println("3rd element in the list is: " + myList.get(2));
            System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
            System.out.println("Size of ArrayList: " + myList.size());
            
            myList.remove("Papaya");
            //myList.remove(0);
            System.out.println("New Size of ArrayList: " + myList.size());
            
           // for(String s:myList){
             //   System.out.println(s);
         //   }
                  }
}
