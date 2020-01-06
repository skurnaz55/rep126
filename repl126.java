package ReplitPractices;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class repl126 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String []strSplitted=str.split(",");
        // System.out.println(Arrays.toString(strSplitted));
        String shortest=strSplitted[0];

        for (int i = 0; i <strSplitted.length ; i++) {
            if(strSplitted[i].length()<shortest.length()){
            shortest=strSplitted[i];
            }

        }
        String allShortest="";
        for(String each11:strSplitted) {
            if (each11.length() == shortest.length()) {
                allShortest += each11 + ", ";

            }
        }

        String allShortestUpdated=allShortest.substring(0,allShortest.length()-2) ;
        System.out.println("allShortestUpdated = " + allShortestUpdated);
        System.out.println(allShortest);
        String[] allShortestArray=allShortestUpdated.split(",");
        Arrays.sort(allShortestArray);
        System.out.println(Arrays.toString(allShortestArray));
    }
}




//    Scanner scan = new Scanner(System.in);
//    String str = scan.nextLine();
//    //
//    //we need to split the string by ", " to create a String array
//    String [] strArray= str.split(", ");
//    //find the shortest word ----> using foreach loop
//    String shorttestWord=strArray[0];
//for( String eachWord   :strArray){
//        if(eachWord.length()<shorttestWord.length()){
//        shorttestWord=eachWord;
//        }
//        }
//        //if there are evenly shortest words we will find out with another foreach loop
//        // and store them in a string
//        String allShortestWord="";
//        for (String each1   :  strArray ){
//        if(each1.length()==shorttestWord.length()){
//        allShortestWord+=each1+" ";
//        }
//        }
//        System.out.println(allShortestWord);
//        //we will create an array with using split method that contains allShortest words
//        //then sort the array  ----> print
//        String[] arrayAllShortestWord= allShortestWord.split(" ");
//        //Arrays.sort(arrayAllShortestWord);
//        System.out.println(Arrays.toString(arrayAllShortestWord));
//        }
//        }