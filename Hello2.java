// public class Hello2 {
//     class A{
//         public void print(){
//             System.out.println("Hello, World!");
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");

//         Hello2 h = new Hello2();
//         A a = h.new A();
//         a.print();

//         A a2 = new Hello2().new A();

//         a2.print();
//     }
// }


import java.util.Scanner;

class Solution {
    public static String reverseWords(String s) {
        String str = s.trim();
        int len = str.length() - 1, flag = 0;
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = len; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == ' ' && flag == 0) {
                res.append(temp.reverse()).append(' ');
                temp.setLength(0);
                flag = 1;
            } else if (ch != ' ') {
                temp.append(ch);
                flag = 0;
            }
        }
        res.append(temp.reverse());  

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        String result = reverseWords(input);
        System.out.println("Reversed words: " + result);
    }
}