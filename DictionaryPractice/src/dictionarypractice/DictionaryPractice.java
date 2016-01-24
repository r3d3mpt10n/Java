
package dictionarypractice;

import java.util.HashMap;
import java.util.Map;


public class DictionaryPractice {

   
    public static void main(String[] args) {
        // English to Spanish
        Map<String,String> englSpanDictionary = new HashMap<String,String>();
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miércoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        
        //Retrieve things from Dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        // Print all keys
        System.out.println(englSpanDictionary.keySet());
        System.out.println(englSpanDictionary.values());
        // Print size of Dictionary
        System.out.println("The size of the Dictionary is: " + englSpanDictionary.size());
        
        
       System.out.println();
       System.out.println();
       
       // Shopping List
       Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
       // Put some stuff in dictionary
       shoppingList.put("Ham", true);
       shoppingList.put("Bread", Boolean.TRUE);
       shoppingList.put("Oreos", Boolean.TRUE);
       shoppingList.put("Eggs", Boolean.FALSE);
       shoppingList.put("Sugar", false);
       // Retrieve Items
       
       System.out.println(shoppingList.get("Ham"));
       System.out.println(shoppingList.get("Oreos"));
       // Key-Value Pairs Print Out
       System.out.println(shoppingList.toString());
       // Is empty?
       System.out.println(shoppingList.isEmpty());
       // Clear our dictionary
       shoppingList.clear();
       System.out.println(shoppingList.toString());
       //Remove things
       shoppingList.remove("Eggs");
       // Replace value for a certain key
       shoppingList.replace("Bread", Boolean.FALSE);
       // Is empty?
       System.out.println(shoppingList.isEmpty());
       
       
       // Clear our Dictionary
       
    }
    
}
