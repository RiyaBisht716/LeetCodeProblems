class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
                    return "0";
        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];


        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');


                int p1 = i + j;
                int p2 = i + j + 1;

                int sum = mul + res[p2];

                res[p2] = sum % 10;
                res[p1] += sum / 10;
        }
    }

    StringBuilder ans = new StringBuilder();
    for (int x : res) {
        if (!(ans.length() == 0 && x == 0))
        ans.append(x);
    
     }

 
    return ans.length() == 0 ? "0" : ans.toString();
    }
 }