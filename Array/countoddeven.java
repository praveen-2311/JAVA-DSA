class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int countodd = 0;
        int counteven = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2 != 0)
            {
                countodd++;
            }
            else 
            {
            counteven++;
            }
        }
        return new int[]{countodd,counteven};
    }
}
