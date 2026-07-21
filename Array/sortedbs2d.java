package Array;

public class sortedbs2d {
    public static void main(String[] args) {
        
    }

    // search in the row provided between column provided
    static int[] binarySearch(int[][] arr, int target, int row, int cStart, int cEnd){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(arr[row][mid] == target){
                return new int[]{row,mid};
            }
            if(arr[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr, int target){
        int rows =  arr.length;
        int cols = arr[0].length;

        if(rows == 1){
            return binarySearch(arr, target, 0, 0, cols-1);
        }
        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols / 2;
        
        // Run the loop till 2  rows are remaining
        while(rStart <= rEnd){
            //while this is true , it will have more than two rows
            int mid = rStart + (rEnd - rStart)/2;
            if(arr[mid][cMid]==target){
                 return new int[]{mid, cMid};
            }
            if(arr[mid][cMid]<target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        // now we have 2 rows
        
    }
}
