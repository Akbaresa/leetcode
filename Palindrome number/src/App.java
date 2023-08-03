class Solution {
    public boolean isPalindrome(int x) {
        // palindrome adalah kata atau bilangan jika dibalik maka akan sama seperti
        // angka atau kata awal
        Boolean isP = false;
        String text_x = Integer.toString(x);
        int length_x = text_x.length();
        int cekLoop = 0;
        if (length_x == 1) {
            isP = true;
        }

        if (length_x % 2 == 1) {
            cekLoop = (length_x - 1) / 2;
            System.out.println("loop : " + cekLoop);
            for (int i = 0; i < cekLoop; i++) {
                char c = text_x.charAt(i);
                if (c == text_x.charAt(length_x - (1 + i))) {
                    System.out.println("ganjil : ");
                    System.out.println(c);
                    System.out.println(text_x.charAt(length_x - (1 + i)));
                    isP = true;
                } else {
                    return isP = false;
                }
            }
        } else if (length_x % 2 == 0) {
            cekLoop = text_x.length() / 2;
            for (int i = 0; i < cekLoop; i++) {
                char c = text_x.charAt(i);
                if (c == text_x.charAt(length_x - (1 + i))) {
                    System.out.println(c);
                    System.out.println(text_x.charAt(length_x - (1 + i)));
                    isP = true;
                } else {
                    return isP = false;
                }
            }
        }

        return isP;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(10000021));
        // System.out.println(solution.isPalindrome(11));
        // System.out.println(solution.isPalindrome(10));
    }
}