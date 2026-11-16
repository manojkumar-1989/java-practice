import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class StringDemo {

    public static void main(String[] args) {

        //Rotate an array by K positions.

    //     int[] nums = {10, 20, 30, 40, 50};
    //     int k = 2;

    //     int n = nums.length;
    //     k = k % n;

    //     int[] temp = new int[n];

    //     for (int i = 0; i < n; i++) {
    //         temp[(i + k) % n] = nums[i];
    //     }

    //     System.out.println(Arrays.toString(temp));
    // }


        //Remove duplicates from an array.
        // int[] nums = {10, 20, 30, 20, 40, 10, 50};
        // HashSet<Integer> dup =  new HashSet<>();

        // LinkedHashSet<Integer> dup = new LinkedHashSet<>();
        
        // for(int i=0; i<nums.length; i++){
        //     dup.add(nums[i]);
            
        // }System.out.println(dup);


        // for(int i=0; i<nums.length; i++){
        //     dup.add(nums[i]);
        //     System.out.println(dup);
        // }
        // for(int num : nums){

        //      dup.add(num);
        
           
        // }System.out.println(dup);

        // int[] nums = {10, 20, 30, 20, 40, 10, 50};

        // int[] result = new int[nums.length];

        // int index = 0;

        // for (int i = 0; i < nums.length; i++) {

        //     boolean duplicate = false;

        //     for (int j = 0; j < index; j++) {

        //         if (nums[i] == result[j]) {
        //             duplicate = true;
        //             break;
        //         }
        //     }

        //     if (!duplicate) {
        //         result[index] = nums[i];
        //         index++;
        //     }
        // }

        // for (int i = 0; i < index; i++) {
        //     System.out.print(result[i] + " ");
        // }

        //Find pairs whose sum equals a target value.
        // int[] nums = {2, 4, 3, 5, 7, 8, 1};
        // int target = 9;
        //  for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j]==target){
        //              System.out.println(
        //                 nums[i] + " + " + nums[j] + " = " + target
        //             );
        //         }
        //     }
        //  }

        //Separate even and odd numbers.
    //     int[] nums = {10, 15, 20, 25, 30, 35, 40, 45};

    //    for(int i=0; i<nums.length; i++){

    //     if(nums[i]%2==0){

    //         System.out.println("even no"+ nums[i]);
    //     }

    //    }

    //    System.out.println("*************************");


    //    for(int j=0; j<nums.length; j++){

    //     if(nums[j]%2!=0){

    //         System.out.println("add no"+ nums[j]);
    //     }
        
    //    }

        //Find the maximum and minimum numbers without sorting.

        // int[] nums1 = {100, 500, 200, 900, 700, 50, 300};
        // Arrays.sort(nums1);
        // int min = nums1[0];
        // int max = nums1[nums1.length-1];
        //  System.out.println("Minimum number: " + min);
        // System.out.println("Maximum number: " + max);


    //     int[] nums = {100, 500, 200, 900, 700, 50, 300};

    //     int max = nums[0];
    //     int min = nums[0];

    //     for (int i = 1; i < nums.length; i++) {

    //         if (nums[i] > max) {
    //             max = nums[i];
    //         }

    //         if (nums[i] < min) {
    //             min = nums[i];
    //         }
    //     }

    //     System.out.println("Maximum number: " + max);
    //     System.out.println("Minimum number: " + min);
    // }


        //Find common elements between two arrays.
        // int[] arr1 = {10, 20, 30, 40, 50};

        // int[] arr2 = {30, 40, 50, 60, 70};

        // for(int i=0; i<arr1.length; i++){

        //     for(int j=0; j<arr2.length; j++){

        //         if(arr1[i]==arr2[j]){
        //             System.out.println(" common no" + arr1[i]);
        //             break;
        //         }
        //     }
        // }

        //Find missing numbers from an array.
//         int[] nums = {1, 2, 4, 6, 7, 9};

//         for (int i = 1; i < 10; i++) {

//             boolean found = false;

//             for (int j = 0; j < nums.length; j++) {

//         if (i == nums[j]) {
//             found = true;
//             break;
//         }
//     }

//     if (!found) {
//         System.out.println("Missing number: " + i);
//     }
// }

        //Find the second-highest transaction amount without sorting the array

        // int[] nums = {100, 500, 200, 900, 700};

        // int highest = Integer.MIN_VALUE;
        // int secondHighest = Integer.MIN_VALUE;

        // for (int i = 0; i < nums.length; i++) {

        //     if (nums[i] > highest) {

        //         secondHighest = highest;
        //         highest = nums[i];

        //     } else if (nums[i] > secondHighest && nums[i] != highest) {

        //         secondHighest = nums[i];
        //     }
        // }

        // System.out.println("Highest number: " + highest);
        // System.out.println("Second highest number: " + secondHighest);
    


        // Move all zeros to the right
        // int[] nums = {4, 0, 8, 0, 5, 0, 2};

        // int index=0;

        // for(int i=0; i<nums.length; i++){

        //     if(nums[i] != 0){
        //         nums[index] = nums[i];
        //         index++;
        //         //System.out.println(nums[i]);
        //     }
        // }
        // while(index<nums.length){
        //         nums[index]=0;
        //         index++;
        // }

        // for(int i=0; i<nums.length; i++){
        //     System.out.print(" "+nums[i]);
        // }
         
        //finding duplicate
        // int[] nums = {10, 20, 30, 20, 40, 10, 50};

        // for(int i=0; i<nums.length; i++){

        //     for(int j=i+1; j<nums.length; j++){

        //         if(nums[i] == nums[j])

        //         System.out.println(nums[i]);
        //         break;
        //     }
        // }

        // finding duplicate
        // int[] nums = {10, 20, 30, 20, 40, 10, 50};

        //  HashSet<Integer> dupSet = new HashSet<>();

        // for ( int x:nums){

        //    if(!dupSet.add(x)){

        //         System.out.println("Duplicate number: " + x);
        //     }
            
        // }
    
    }
}

