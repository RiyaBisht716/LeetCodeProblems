class Solution {

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();// character array
        int i =0;
        int j = arr.length -1;
        while(i<j){
            //find vowel in left 

            while(i<j && !isVowel(arr[i])){
                i++;

            }
            //find vowel in right
            while(i<j && !isVowel(arr[j])){
                j--;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);//conver char array to string
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c== 'o' || c == 'u' || c== 'i' || c == 'A' || c== 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}