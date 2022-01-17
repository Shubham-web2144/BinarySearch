package com.ShubhamWork;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
	// write your code here
        int arr[] = {1,4,7,9,13,15,19,24};
        int startiing_idx = 0;
        int ending_idx = arr.length - 1;
        int mid = (startiing_idx + ending_idx)/2;
        int srch = 19;


        while (startiing_idx <= ending_idx){
            if(arr[mid] == srch){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] < srch){
                startiing_idx = mid + 1;
            }
            else {
                ending_idx = mid - 1;
            }

            mid = (startiing_idx + ending_idx)/2;
        }

        if(startiing_idx > ending_idx){
            System.out.println("Element is not found");
        }
    }
}
