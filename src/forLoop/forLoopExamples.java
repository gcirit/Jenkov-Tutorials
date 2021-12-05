package forLoop;

public class forLoopExamples {
    public static void main(String[] args) {
        // Basic for loop
        for(int i=0; i < 10; i++) {

            System.out.println("i is: " + i);

        }

        System.out.println();

        // for each loop
        String[] strings = {"one", "two", "three" };

        for(String aString : strings) {
            System.out.println(aString);
        }

        System.out.println();

        // continue command
        String[] str = {
                "John", "Jack", "Abraham", "Jennifer", "Ann" };

        int wordsStartingWithJ = 0;
        for(int i=0; i < str.length; i++) {
            if(! str[i].toLowerCase().startsWith("j")) {
                continue;
            }

            wordsStartingWithJ++;
        }
        System.out.println(wordsStartingWithJ);

        System.out.println();

        // break command
        String[] strs = {
                "John", "Jack", "Abraham", "Jennifer", "Ann" };

        int wordStartingWithJ = 0;
        for(int i=0; i < strs.length; i++) {
            if(strs[i].toLowerCase().startsWith("j")) {
                wordStartingWithJ++;
            }

            if(wordStartingWithJ >= 3) {
                break;
            }
        }
        System.out.println(wordStartingWithJ);
    }
}
