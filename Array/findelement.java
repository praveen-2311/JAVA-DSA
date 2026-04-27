class Solution {
    public int findElementAtIndex(int i, int[] arr) {
        // code here
        for(int j=0;j<arr.length;j++)
        {
            if(j==i)
            {
                return arr[j];
            }
        }
        return 0;
    }
}
