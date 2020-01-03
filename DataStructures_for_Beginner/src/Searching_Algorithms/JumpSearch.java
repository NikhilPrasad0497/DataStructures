package Searching_Algorithms;

import java.util.Scanner;

public class JumpSearch {
    /* IMPLEMENTATION
        for a sorted array A[] of length n and an element to be searched x. A block size of length m is required such that:
    *  1. Iteration 1: if (x==A[0]) then success else, if (x>A[0]) then jump to the next block.
       2. Iteration 2: if (x==A[m]) then success else, if (x>A[m]) then jump to the next block.
       3. Iteration 3: if (x==A[2m]) then success else. if (x>A[2m]) then jump to the next block.
        at any point if (x<A[km]) then a linear search is performed from index A[(k-1)m] to A[km].

        optimal block size is m=sqrt(n).
    * */
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length of Array");
        int x=sc.nextInt();                                         // length of Array
        int[] n = new int[x];
        System.out.println("Enter "+x+" integers");
        for(int i=0;i<n.length;i++){                                // input of Array
            n[i]=sc.nextInt();
        }
        System.out.println("Enter Number to be searched");
        int target=sc.nextInt();                                    // Target Number
        int result=JumpSearch(n, target);         // send array, target, length of array-1, min value(0).
        if (result==-1){
            System.out.println("Element is not Present");
        }
        else {
            System.out.println("Element is Present at index"+result);
        }
    }
    public static int JumpSearch(int n[], int target){
        int m=(int)Math.floor(Math.sqrt(n.length));                 // step size
        int prev=0;                                                 // initialising step
        while (n[Math.min(m,n.length)]-1 < target){
            prev=m;
            m+=(int)Math.floor(Math.sqrt(n.length));
            if (prev>=n.length){
                return -1;
            }
        }
        while (n[prev]<target){
            prev++;
            if (prev==Math.min(m,n.length)){
                return -1;
            }
        }
        if (n[prev]==target){
            return prev;
        }
        return -1;
    }
}
