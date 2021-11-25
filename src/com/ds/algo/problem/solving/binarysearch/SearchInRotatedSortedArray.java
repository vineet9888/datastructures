package com.ds.algo.problem.solving.binarysearch;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int arr[] = new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3};
        int l = 0;
        int h = arr.length - 1;
        int mid;
        int pivot=-1;
        while(l <= h) {
            mid = (l+h)/2;
            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                pivot = mid;
                break;
            }
            if(arr[mid] < arr[h] && arr[mid] < arr[l]){
                // search in left part...
                h = mid -1;
            }
            else if(arr[mid] > arr[l] && arr[mid]>arr[h]) {
                // search in right part
                l = mid + 1;
            }
        }
        System.out.println(pivot);
    }


    public static int binarySearch(int pivotIndex , int target , int arr[]) {
        if(pivotIndex == -1) {
            return -1;
        }
        if(arr[pivotIndex] == target) {
            return pivotIndex;
        }
        if(arr[0] < target && arr[pivotIndex] > target) {

        } else if(arr[pivotIndex+1] < target && arr[arr.length-1] > target) {
            // search in right side of pivot
        }
        return -1;
    }
}
// 7,8,9,10,1,2,3,4,5,6,6
// 1 2 3 4 5 6 7
// 5, 6, 7, 8, 9, 10, 1, 2, 3
