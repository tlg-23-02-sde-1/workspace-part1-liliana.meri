package gov.research;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {

    public static void main(String[] args) {
        Map<String,Double> gpaMap = new HashMap<>();

        gpaMap.put("chance", 3.7);
        gpaMap.put("stephen", 3.2);
        gpaMap.put("jorge", 3.99);
        gpaMap.put("lui", 2.3);
        gpaMap.put("chris", 3.2);
        gpaMap.put("jay", 3.4);

        double luiGpa = gpaMap.get("lui");
        System.out.println("Lui's GPA is: " + luiGpa);
        System.out.println();

        dump(gpaMap);
        System.out.println(); // toString() automatically called

        // print all gpas that are 3.5 or greater
        Collection<Double> allGpas = gpaMap.values();
        for (double gpa : allGpas) {
            if (gpa >= 3.5){
                System.out.println(gpa);
            }
        }

        // print all names for those w/ gpa of 3.5 or greater
        for (var entry : gpaMap.entrySet()) {
            if(entry.getValue() >= 3.5) {
                System.out.println(entry.getKey());
            }
        }
    } // end of main()


    private static void dump(Map<String,Double> map) {
        for(var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}