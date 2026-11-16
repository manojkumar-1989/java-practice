public class Demo1 {
public static void main(String[] args) {

    ArrayDemo s1 = new ArrayDemo();
                s1.name= "manoj";
                s1.id = 100;
                s1.sal = 50000.00f;

    ArrayDemo s2 = new ArrayDemo();
                s2.name= "devika";
                s2.id = 101;
                s2.sal = 70000.00f;

        ArrayDemo arr [] = {s1 , s2};

        for(ArrayDemo x: arr)

        System.out.println(x.name + ":" + x.id + ":" + x.sal + ":");
 
            // for(ArrayDemo ar: arr){

            // }   

    // int nums [][] = new int [3][4];

    // for( int i=0; i<3; i++){

    //     for(int j=0; j<4; j++){

    //        nums [i] [j] = (int) (Math.random()*10) ;
    //         System.out.print(nums[i][j] + " ");
    //     }
    //     System.out.println();
    // }

    // for( int i=0; i<3; i++){

    //     for(int j=0; j<4; j++){
            
    //         System.out.print(nums[i][j] + " ");
    //     }
    //     System.out.println();
    // }

    // int nums[] = new int[4];
    //     //System.out.println(nums[2]);
    // nums[0] = 4;
    // nums[1] = 5;
    // nums[2] = 6;
    // nums[3] = 7;

    // int nums [] = {3,7,2,4};
    //     nums[1] = 9;
    // //System.out.println(nums[0]);

    // for(int i=0; i<4; i++){
    //     System.out.println(nums[i]);
    // }
    
//     Calculator cal = new Calculator();

//         int val = cal.add(5 , 7);
//         System.out.println(val);

//          Calculator1 cal1 = new Calculator1();
//        int val2 = cal1.multiples(10 , 10);
//        System.out.println(val2);

//        Computer comp = new Computer ();
//        comp.playMusic();
//        String x = comp.getPen(11);
//        System.out.println(x);

  }
}

class ArrayDemo{

    String name;
    int id;
    float sal;
}
// class Calculator{
//    int x;
//    int y;

//     public int add(int x, int y){
//         return x + y;
//     }
// }

// class Calculator1{

//     int a;
//     int b;

//     private int multiple(int a, int b){
//         return a*b;
//     }

//     public  int multiples(int a, int b){
//         return multiple(a, b);
//     }
// }

// class Computer{

//     public void playMusic(){
//         System.out.println("Music playing");
//     }

//     public String getPen(int cost){
//         if(cost<10){
//             return "yes i can buy";
//         }else{
//             return "price is high";
//         }
        
//     }
// }

// class Calculator2{

//     public int add(int n1 , int n2) {
//        //int result = n1 + n2 ;
//       // return result;
//        return n1 + n2;
//     }

//     public int add(int n1 , int n2, int n3) {
//        //int result = n1 + n2 ;
//       // return result;
//        return n1 + n2 + n3;
//     }
// }
