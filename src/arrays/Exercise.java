package arrays;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("exercise1 executed");

        int a = 3;
        int b = 4;
        int aPlusb = a + b;
        System.out.println(aPlusb);

        int [] numbers = {1,2,3,4,5};
        int sum = 0;
        for (int i : numbers
             ) {
            sum += i;
        }
        System.out.println(sum);

        DataObject[] dataObjects = new DataObject[5];

        DataObject dataObject = new DataObject();
        dataObject.count = 5;
        dataObject.code = "friday";
        dataObjects[0] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 7;
        dataObject.code = "friday";
        dataObjects[1] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 9;
        dataObject.code = "saturday";
        dataObjects[2] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 11;
        dataObject.code = "saturday";
        dataObjects[3] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 13;
        dataObject.code = "saturday";
        dataObjects[4] = dataObject;

        int sumObj = 0;
        for (int i =0; i< dataObjects.length; i++){
            sumObj += dataObjects[i].count;
        }
        System.out.println("Total Sum: " + sumObj);

        int sumDay = 0;
        for (int i =0; i< dataObjects.length; i++){
            if (dataObjects[i].code.equalsIgnoreCase("friday"))
            sumDay += dataObjects[i].count;
        }
        System.out.println("Friday Sum: " + sumDay);

        //HashMap Exercise
        HashMap map = new HashMap();

        for (int i = 0; i < dataObjects.length; i++) {
            //read sum for code
            Integer sumForCode = (Integer) map.get(dataObjects[i].code);

            //if no sum is in the map for that code yet start with sum of 0
            if(sumForCode == null){
                sumForCode = 0;
            }

            //add count to sum
            sumForCode = sumForCode.intValue() + dataObjects[i].count;

            //store new sum in map
            map.put(dataObjects[i].code, sumForCode);
        }
        //iterate all keys (codes) in map
        for(Object code : map.keySet()){
            //print out the sum for that key (code).
            System.out.println(code + " " + map.get(code));
        }

    }
}
