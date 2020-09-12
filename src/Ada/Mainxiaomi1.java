package Ada;


import java.util.ArrayList;
import java.util.Scanner;

public class Mainxiaomi1 {
    /**
     * 注册网站时，需要使用包含不同类型（数字、符号、大写字母、小写字母）的字符，和特定长度。
     * 检查一个密码内容同时包含以上 4 种类型的字符，并且长度在8-120 个字符之间。
     * 符合要求，返回 0；长度不符合返回 1；类型不符合要求返还 2。
     * 可以一次输入多组密码，以空格符间隔，空格符不作为密码。
     * */
    public static int validate(String str){
        if(str.length() < 8 || str.length() > 120){
            return 1;
        }
        boolean hasNumber = false;
        boolean hasSymbol = false;
        boolean hasUpperCharacter = false;
        boolean hasLowerCharacter = false;
        char c;

        for(int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            if((c < '0' || c > '9') && (c < 'A' || c > 'Z')&&(c < 'a' || c > 'z')){
                hasSymbol = true;
            }
            if(c <= '9' && c >= '0'){
                hasNumber = true;
            }
            if(c >= 'A' && c <= 'Z'){
                hasUpperCharacter = true;
            }
            if(c >= 'a' && c <= 'z'){
                hasLowerCharacter = true;
            }
            if(hasNumber && hasLowerCharacter && hasUpperCharacter && hasSymbol){
                return 0;
            }
        }
        return 2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keywords = sc.nextLine().trim();
        String[] pwds = keywords.split(" ");
        for(int i = 0; i < pwds.length; i++){
//            if(pwds[i].charAt(0) != ' '){
                System.out.println(validate(pwds[i].trim()));

        }
    }
}
