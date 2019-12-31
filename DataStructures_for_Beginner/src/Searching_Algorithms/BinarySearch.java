package Searching_Algorithms;

import java.util.Scanner;

/* time complexity is O(log n)
    *  great to search through large sorted arrays
    * */
public class BinarySearch {
    /* IMPLEMENTATION
    *  1. we start by comparing the element to be searched with the element in the middle of array/list.
    *  2. if we get a match, we return the index of middle element.
    *  3. if we do not get a match, we check whether the element to be searched is less or greater than in value than the middle element.
    *  4. if the element is greater than middle element, then we pick elements from right side of middle element and start again from step 1.
    *  5. if the element is less than middle element, then we pick the elements on left side of middle element and start again from step 1.
    * */
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length of Array");
        int x=sc.nextInt();                                         // length of Array
        int n[] = new int[x];
        System.out.println("Enter "+x+" integers");
        for(int i=0;i<n.length;i++){                                // input of Array
            n[i]=sc.nextInt();
        }
        System.out.println("Enter Number to be searched");
        int target=sc.nextInt();                                    // Target Number
        int result=BinarySearch(n, target, x-1, 0);         // send array, target, length of array-1, min value(0).
        if (result==-1){
            System.out.println("Element is not Present");
        }
        else {
            System.out.println("Element is Present at index"+result);
        }

    }

    private static int BinarySearch(int[] n, int target, int x, int min) {

        if (x>=min){
            int mid=min+(x-1)/2;
            if (n[mid]==target){
                return mid;
            }
            if (n[mid]>target){
                return BinarySearch(n,target,x,mid-1);
            }
            return BinarySearch(n, target, x, min+1);
        }
        return -1;
    }
}
