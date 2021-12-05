package strings;

public class StringFeatures {
    public static void main(String[] args) {
        // String concatenation
        String one = "Hello";
        String two = "World";
        String three = new StringBuilder(one).append(two).toString();
        System.out.println(three);

        // For each loop concatenation
        String[] strings = new String[]{"one", "two", "three", "four", "five"};
        String result = null;
        for (String string: strings
             ) {
            result = result + string;
        }
        System.out.println(result);

        // For each append with StringBuilder
        String[] string2 = new String[]{"one", "two", "three", "four", "five"};
        StringBuilder temp  = new StringBuilder();
        for(String string : string2) {
            temp.append(string);
        }
        String result2 = temp.toString();
        System.out.println(result2);

        //Substring
        String string1 = "Hello World";
        String substring = string1.substring(0,5);
        System.out.println(substring);

        //Search String with indexOf()
        String theString = "is this good or is this bad?";
        String substr = "is";

        int index = theString.indexOf(substr);
        while(index != -1) {
            System.out.println(index);
            index = theString.indexOf(substr, index + 1);
        }

        //
    }
}
