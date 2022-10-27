package Notes;

public class CheckCharOccurrenceWithCharArray {

        static int countA(String s) {
            int counter = 0;
            char[] charArray=s.toCharArray();
            for(char c:charArray)
                if (c=='A'||c=='a'){
                    counter ++;

                }
            return counter;

        }

    }

