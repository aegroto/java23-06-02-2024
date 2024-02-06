import java.util.Arrays;

public class esercizio06_02_24 {
    public static void main(String[]args) {
        System.out.println ("Hello World!");

        String[] cose = {"Ciao","Serpente","gatto","cane"};

        String[] result = returnString (cose);

        System.out.println(Arrays.toString(result));
    }

    public static String[] returnString (String[] arr) {
        String[] makeArr = new String[arr.length];

        for (int i=0; i< arr.length; i++){
            String element = arr[i];
            if (element.length()%2 == 0) {
                makeArr[i]=arr[i];
            } else {
                makeArr[i]=null;}
        }
        return makeArr;
    }
}
