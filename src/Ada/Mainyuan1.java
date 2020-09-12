package Ada;

import java.util.Scanner;
import java.util.Stack;

public class Mainyuan1 {
    public static int calculate(String s) {
    //去空格
    s = s.replaceAll(" ", "");
    if (s.length() == 0) return 0;
    Stack<Integer> stack = new Stack<>();//数据栈
    char sign = '+'; //符号
    int res = 0, pre = 0, i = 0;
    while (i < s.length()) {
        char ch = s.charAt(i);
        //处理两位数的问题
        if (Character.isDigit(ch)) {
            pre = pre * 10 + (ch - '0');
        }
        //碰到左括号 就把括号里面当成一个新的被加数
        if (ch == '(') {
            int j = findClosing(s.substring(i));
            pre = calculate(s.substring(i + 1, i + j));
            i += j;
        }
        if (i == s.length() - 1 || !Character.isDigit(ch)) {
            //将所有的结果压栈 最后统一加起来
            switch (sign) {
                case '+':
                    stack.push(pre);
                    break;
                case '-':
                    stack.push(-pre);
                    break;
                case '*':
                    stack.push(stack.pop() * pre);
                    break;
                case '/':
                    stack.push(stack.pop() / pre);
                    break;
            }
            pre = 0;
            //记录当前的符号
            sign = ch;
        }
        i++;
    }
    // 本质上说全都是加法
    while (!stack.isEmpty()) {
        res += stack.pop();
    }
    return (res % 10000000 + 10000000)%10000000;
}
    //删除所有的括号对，并返回右括号的位置
    private int findClosing(String s) {
        int level = 0, i = 0;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                level++;
            } else if (s.charAt(i) == ')') {
                level--;
                if (level == 0) {
                    break;
                }
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t - 1; i++){
            String str = scanner.nextLine();
            System.out.println(calculate(str));
        }
    }
}










