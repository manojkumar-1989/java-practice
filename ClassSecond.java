import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ClassSecond {
    public static void main(String[] args) {

        Demos dm = new Demos();

        dm.method1();
        dm.method2();
        dm.method3();

    }
}

 class Demos {

    public String method1(){
        try{
             int a= 4/0;
        //int b= 0;
        System.out.println(a);
        return "Hello";
        }catch(ArithmeticException e){
            return e.getClass() + ":" + e.getMessage();
        }
    }

     public String method2(){
        String a= null;
        //int b= 0;
          a.length();
          System.out.println("Hi");
        return "hi";
    }

    public String method3(){
        System.out.println("Hey");
        return "hey";
    }
}

        //A transaction system needs to identify missing numbers from an array.
        // int[] arr = {1, 2, 4, 6, 7, 9};

        // for(int i=1; i<9; i++){
            
        // boolean value = false;

        //     for(int j=0; j<arr.length; j++){

        //         if(arr[j]==i){
        //             value = true;
        //             break;
        //         }
        //     }

        //     if(!value){
        //          System.out.println("missing value "+i);
        //     }
        // }

        //A customer service receives duplicate customer IDs. Find duplicate elements.
       // int[] customerIds = {101, 102, 103, 104, 102, 105, 101, 103};
        //Arrays.sort(customerIds);

        // for(int i=0; i<customerIds.length; i++){

        //     for(int j=i+1; j<customerIds.length; j++){
        //         if(customerIds[i]==customerIds[j]){
        //             System.out.println(customerIds[i]);
        //             break;
        //         }
        //     }

        // }

        // HashSet<Integer> dup = new HashSet<>();

        // for(int i=0; i<customerIds.length; i++){
        //     if(!dup.add(customerIds[i])){
        //         System.out.println(" dupllicate id's " + customerIds[i]);
        //     }
            
        // }

        //An employee management system needs to find the second-highest salary from an array.
        // int[] salary = {25000, 45000, 30000, 60000, 50000};
        // int hst = Integer.MIN_VALUE;
        // int scndhst = Integer.MIN_VALUE;

        // for(int i=0; i<salary.length; i++){

        //     if(salary[i]>hst){
        //          scndhst = hst;
        //          hst =  salary[i];
        //     }
        //     else if(salary[i]>scndhst && salary[i]!=hst){
        //         scndhst= salary[i];
        //     }

        //  }if (scndhst == Integer.MIN_VALUE) {
        //     System.out.println("Second highest salary not found");
        // } else {
        //     System.out.println("Second highest salary: " + scndhst);
        // }

            // int[] salary = {25000, 45000, 30000, 60000, 50000};
        // Arrays.sort(salary);

        // int secondhstslry = salary[salary.length-2];
        // System.out.println(secondhstslry);

        // A transaction system receives an array. Move all zeros to the right without changing the order of other numbers.
        // int[] arr = {4, 0, 8, 0, 5, 0, 2};
        // int index =0;
        // for(int i=0; i<arr.length;  i++){

        //     if(arr[i]!=0){
        //         arr[index] = arr[i];
        //         index++;
        //     }
        // }

        //  while(index<arr.length){
        //         arr[index]=0;
        //         index++;
        //     }
        //     for( int i=0; i<arr.length; i++){
        //         System.out.println(arr[i]);
        //     }


        //Two banking systems provide customer ID arrays. Find common customer IDs.

    //      int[] bankA = {101, 102, 103, 104, 105};
    //     int[] bankB = {103, 105, 106, 107, 108};
        
    //     ArrayList<Integer> cmn = new ArrayList<>();
        
    //     for(int i=0; i<bankA.length; i++){

    //         for(int j=0; j<bankB.length;  j++){

    //             if( bankA[i]== bankB[j]){
    //                 cmn.add(bankA[i]);
    //                 break;
                        
    //         }
    //     } 
    //  } 
     
    //  System.out.println(cmn);
     
   

        // int[] bankA = {101, 102, 103, 104, 105};
        // int[] bankB = {103, 105, 106, 107, 108};
        // int[] cmnvalue = new int[bankA.length];
        // int bankC =0;
        
        // for(int i=0; i<bankA.length; i++){

        //     for(int j=0; j<bankB.length;  j++){

        //         if( bankA[i]== bankB[j]){
        //             cmnvalue[bankC] = bankA[i];
        //             bankC++;
        //             break;
        //         }
        //     }
        // }

        // for(int i=0; i<bankC; i++){
        //     System.out.println(cmnvalue[i]);
        // }

        //A transaction system needs to identify missing transaction numbers from a sequence.
        // int[] transactionIds = {101, 102, 104, 106, 107, 109};

        // for(int i=101; i<110; i++){

        //     boolean  value=false;

        //     for(int j=0; j<transactionIds.length; j++){

        //         if(i==transactionIds[j]){
        //             value = true;
        //             break;
        //         }
        //     }
        //     if(!value){
        //         System.out.println("missing number"+ i);
        //     }
        // }

        // A customer service receives duplicate customer IDs. Find all duplicate IDs
        // int[] customerIds = {101, 102, 103, 101, 104, 102, 105, 103};

        // HashSet<Integer> dup = new HashSet<>();
        // for(int i=0; i<customerIds.length; i++){
        //     if(!dup.add(customerIds[i])){
        //         System.out.println(customerIds[i]);
        //     }
        // }



        //An employee system needs to find the second-highest salary from an array.

        // int[] salaries = {30000, 50000, 25000, 80000, 60000};


        // Arrays.sort(salaries);

        // int highest = salaries[salaries.length-1];
        // int secondhighest = Integer.MIN_VALUE;

        // for (int i = salaries.length - 2; i >= 0; i--) {

        //     if (salaries[i] != highest) {
        //         secondhighest = salaries[i];
        //         break;
        //     }
        // }

    //     int highest = Integer.MIN_VALUE;
    //     int secondHighest = Integer.MIN_VALUE;

    //     for (int i = 0; i < salaries.length; i++) {

    //         if (salaries[i] > highest) {

    //             secondHighest = highest;
    //             highest = salaries[i];

    //         } else if (salaries[i] > secondHighest
    //                 && salaries[i] != highest) {

    //             secondHighest = salaries[i];
    //         }
    //     }

    //     if (secondHighest == Integer.MIN_VALUE) {
    //         System.out.println("Second highest salary not found");
    //     } else {
    //         System.out.println("Second highest salary: " + secondHighest);
    //     }
    // }




        //Count occurrences of each character
        // String str = "programming";

        // HashMap<Character,Integer> occ = new HashMap<>();

        // for(int i=0; i<str.length(); i++){

        //     Character ch = str.charAt(i);
        //     occ.put(ch, occ.getOrDefault(ch,0)+1);
        // }System.out.println(occ);

        //Check whether a string is a palindrome
        // String str = "madam";
        // String pstr="";
        // for(int i=str.length()-1; i>=0; i--){
        //     pstr= pstr + str.charAt(i);
        // }if(str.equals(pstr)){
        //     System.out.println("palidrome");
        // }else{
        //     System.out.println("Not Palidrome");
        // }


        // Find the first non-repeated character
        // String str = "progrpamming";
        // for(int i=0; i<str.length(); i++){
        //     boolean result = false;
        //     for(int j=i+1; j<str.length(); j++){
        //         if( i!=j && str.charAt(i)==str.charAt(j)){
        //             result = true;
        //             break;
        //         }
        //     }
        //     if(!result){
        //         System.out.println(str.charAt(i));
        //         break;
        //     }
        // }

        //Find duplicate characters in a string.
            // String str = "programming";
            // for(int i=0; i<str.length(); i++){
            //     for(int j=i+1; j<str.length(); j++){
            //         if(str.charAt(i)==str.charAt(j)){
            //             System.out.println(str.charAt(i));
            //             break;
            //         }
            //     }
            // }
        //Reverse a string without using reverse().

        // String course= "java class started ";

        //   String  repcourse = course.replace(" ","");
        // for(int i=repcourse.length()-1; i>=0; i--){

        //      System.out.println(repcourse.charAt(i));
        //  }
        //  for(int i=course.length()-1; i>=0; i--){

        //     System.out.println(course.charAt(i));
        //  }
        // StringBuilder str = new StringBuilder(course);

        // System.out.println(str.reverse().toString());

        // for(int i=course.length()-1; i>=0; i--){

        //     System.out.println(course.charAt(i));
        // }

   
 


