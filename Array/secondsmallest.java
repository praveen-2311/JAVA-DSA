class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
      int min1 = Integer.MAX_VALUE;
       int min2 = Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++)
       {
           if(min1>arr[i])
           {
               min2 = min1;
               min1 = arr[i];
           }
           else if(min2>arr[i] && arr[i]!=min1)
           {
               min2 = arr[i];
           }
       }
       ArrayList<Integer> result = new ArrayList<>();
       if(min2 == Integer.MAX_VALUE)
       {
           result.add(-1);
       }
       else
       {
           result.add(min1);
           result.add(min2);
       }
       return result;
    }
}
