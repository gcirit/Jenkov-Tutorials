package lambdaExpressions;

import java.util.Comparator;
public class LambdaExamples {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        int compare = stringComparator.compare("hello", "world");
        System.out.println(compare);

        //Simplified lambda expression
        Comparator<String> stringComparatorLambda =
                (o1, o2) -> o1.compareTo(o2);

        int lambdaCompare = stringComparatorLambda.compare("hello", "world");
        System.out.println(lambdaCompare);

        // Interface with lambda expression with 0 parameter
       /* MyFunction myFunction = (*//* parameters should set here *//*) -> {
            System.out.println("Hello World");
        };
        myFunction.apply();
        */

        // Interface with parameter
        MyFunction myFunction = (text, text2) -> // No parenthesis if there is only 1 parameter
        {
            System.out.println(text + " + " + text2);
            return text + "  + " + text2;
        };
        String returnValue = myFunction.apply("Hello Function Body", "Test");




        MyFunction myFunction1 = myFunction;
        String returnValue1 = myFunction1.apply("text 1","text 2");
        System.out.println(returnValue1);

    }
}
