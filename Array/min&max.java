class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min = arr[i];
            }
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);
        return result;
    }
}
