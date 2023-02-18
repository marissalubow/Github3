/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package authloginuser.github3;

/**
 *
 * @author marissalubow
 */

import java.util.Scanner; 
public class GitHub3 
{
    
    //Question 1: 
//    public static int getLargest(int arr[], int sz) //1
//    { 
//        int iterate1 =0; //1
//        int iterate2 =0; //1
//        int largest = 0;  //1
//        while(iterate1 < sz-1) //n
//        {   
//            iterate2++;  //n
//            if(iterate2 ==sz) //n
//            {   
//                iterate1++; 
//                iterate2 = iterate1; 
//                continue; 
//            }
//            int product = arr[iterate1] * arr[iterate2]; //1
//            if(product > largest)
//                largest = product; //1
//        }
//        return largest; //1 
//    }
    
    //O(n)- Linear 
    /*
    The while loop will loop through n times to check if the iterate1 value is less than or equal to sz-1 
    dependent on what the value of sz is it will loop through that many times 
    
    the if statment will also be n times since it is inside of the while loop 
    
    1+1+1+1+n+n+n+n+n+1+1+1+1 = 8+5n --> n 
    this makes the overall time complexity of the aglorithm to be O(n) - Linear
    */
    
    
    //Question 2: 
    /*
    You have 20 M&Ms bags. 19 bags have 1.0 gram pieces, but one has pieces of weight  1.1 grams.
    Given a scale that provides an exact measurement, how would you find the heavy bag? 
    You can only use the scale once.  
    */
    

    
//    public static void main(String[] args)  
//    {
//     
//        Scanner scnr = new Scanner(System.in);
//    
//        int numBags = 20;
//    
//        double candies [] = new double[numBags]; 
//      
//        for(int i=0; i<candies.length; i++)
//        {
//            candies[i] = scnr.nextDouble(); 
//        }
//        
//        double maxWeight = 1.1; 
//        
//        System.out.println("-----------------------------------");
//        System.out.println("Value found: ");
//        
//        binarySearch(maxWeight, candies); 
//        
//        
//        
//   }
//    
//   //binary search to find the largest value //binary search is more efficient than linear becuase its time complexity is O(logn)
//   public static int binarySearch(double x, double arr[])
//   {
//       int start = 0;
//       int end = arr.length-1; 
//       
//       while(start <= end)
//       {
//           int middle = (start + end)/2; 
//           
//           if(x < arr[middle])
//           {
//               end = middle-1; 
//               System.out.println(x);
//           }
//           if(x>arr[middle])
//           {
//               start = middle +1; 
//               System.out.println(x); 
//           }
//           if(x==arr[middle])
//           {
//               System.out.println(x);
//               return middle; 
//           }
//       }
//       return -1;
//   }
//    
    
    
    
    
    
   
   
    
   
}
