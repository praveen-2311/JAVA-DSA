  class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
       boolean ispalindrome = true;
       for(int i=0;i<arr.length/2;i++)
       {
           if(arr[i] != arr[arr.length -1 -i])
           {
               ispalindrome = false;
               break;
           }
       }
       if(ispalindrome == true)
       {
           return true;
       }
       else
       {
           return false;
       }
        
    }
}
