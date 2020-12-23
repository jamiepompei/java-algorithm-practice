package OtherSources;

import java.util.HashSet;

public class CommonStringElemsTwoArrays {

    /**
     * Write a java program to find the common elements between two arrays (string values)
     * Array1 : [Python, JAVA, PHP, C#, C++, SQL]                                                                    
     *
     * Array2 : [MySQL, SQL, SQLite, Oracle, PostgreSQL, DB2, JAVA]                                                  
     *
     * Common element is : [JAVA, SQL]
     */
    
    public String[] commonElements(String[] arr1, String[] arr2){
        HashSet<String> set = new HashSet<String>();

        //outer loop will compare each of it's elements to every element in the inner array
        //if they are equal, the element is added to a set
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {
                if(arr1[i].equals(arr2[j])){
                    set.add(arr1[i]);
                }
                
            }
            
        }
        //convert set to a string array and return
        String[] result = (String[]) set.toArray();
        return result;
    }
}
