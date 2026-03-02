/**
 * Problem Name: Count Inversions in Array
 * Difficulty: Hard
 *
 * Problem Statement:
 * Count pairs (i,j) where i<j and arr[i]>arr[j]
 *
 * Pseudocode:
 * 1. Use Merge Sort
 * 2. Count during merge
 *
 * Approach:
 * Modify merge sort to count inversions.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: [2,4,1,3,5]
 * Output: 3
 */

public class CountInversions {

    public static int mergeSort(int[] arr,int l,int r) {

        int count=0;

        if(l<r) {
            int m=(l+r)/2;
            count+=mergeSort(arr,l,m);
            count+=mergeSort(arr,m+1,r);
            count+=merge(arr,l,m,r);
        }
        return count;
    }

    private static int merge(int[] arr,int l,int m,int r) {

        int[] temp=new int[r-l+1];
        int i=l,j=m+1,k=0,count=0;

        while(i<=m && j<=r) {
            if(arr[i]<=arr[j])
                temp[k++]=arr[i++];
            else {
                temp[k++]=arr[j++];
                count+=m-i+1;
            }
        }

        while(i<=m) temp[k++]=arr[i++];
        while(j<=r) temp[k++]=arr[j++];

        System.arraycopy(temp,0,arr,l,temp.length);

        return count;
    }
}
