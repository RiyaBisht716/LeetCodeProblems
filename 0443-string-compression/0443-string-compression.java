class Solution {
    public int compress(char[] chars) {
        int write = 0; // yeh character array mai he compresed value ko likhega(inplace array)
        int i = 0; // yeh input ko read karega character array main

        while(i<chars.length){
            char current = chars[i];//first char le liya
            int cnt = 0;//yeh consecutive char ko cnt kr rha hai

            while(i<chars.length && chars[i] == current){
                cnt++;
                i++;
            }
            chars[write] = current;// yeh char ko likh rha hai
            write++;

            if(cnt > 1){
                String s = String.valueOf(cnt);// convert int to char
                // yeh loop char kitni baar arahha hai uss cnt ko likhega char ke baad

                for(char c :s.toCharArray()){
                    chars[write] = c;
                    write++;
                }
            }

        }
        return write;// yeh mujhe total char[] ki length kya hai woh batayega
        
    }
}