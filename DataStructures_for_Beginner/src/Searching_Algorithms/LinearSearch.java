package Searching_Algorithms;

import java.util.Scanner;

/* 1) it has timecomplexity of O(n)
    *  2) used for unsorted and unordered small list of elements
    *
    * */
public class LinearSearch {
    /* IMPLEMENTATION
    *  we search an element from start to end untill the element is matched.
    *  it compares the element to be searched with the elements of array and returns element if found or -1
    * */
    public static void main(String [] args){
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
        System.out.println(LinearSearch(n, target));
    }
    public static int LinearSearch(int n[], int target){
        for (int i=0; i<n.length; i++){
            if(n[i]==target){                                       // search by matching values with Target.
                return i;
            }

        }

            return -1;

    }
}
