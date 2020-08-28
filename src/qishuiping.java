import java.util.Scanner;

public class qishuiping {
    /**
     * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”
     * 答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
     * 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
     * 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
     */
    public static int  solution(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 0;
        }
        if(num == 2){
            return 1;
        }
//        if(num == 3){
//            return 1;
//        }
//        //有了4个空瓶，换1瓶喝掉，剩2个空瓶，借1瓶酒喝掉，三个空瓶还
//        if(num == 4){
//            return 2;
//        }
//        //5空瓶，换1瓶喝掉，3个空瓶，换1瓶喝掉
//        if(num == 5){
//            return 2;
//        }
//        // 6空瓶，换2瓶喝掉，2空瓶，借1瓶酒喝掉，还
//        if(num == 6){
//            return 3;
//        }
//        // 7空瓶，换2瓶喝掉，3空瓶，换1瓶酒喝掉
//        if(num == 7){
//            return 3;
//        }
//        // 8空瓶，换2瓶喝掉，4空瓶，换1瓶酒喝掉，剩2个空瓶，借1喝，还
//        if(num == 8){
//            return 4;
//        }
//        // 9空瓶，换3瓶喝掉，3空瓶，换1瓶酒喝掉，剩1个空瓶
//        if(num == 9){
//            return 4;
//        }
//        // 10空瓶，换3瓶喝掉，4空瓶，换1瓶酒喝掉，剩2个空瓶，借1喝，还
//        if(num == 10){
//            return 5;
//        }
//        // 11空瓶，换3瓶喝掉，5空瓶，换1瓶酒喝掉，剩3个空瓶，换1喝
//        if(num == 11){
//            return 5;
//        }
        int count = 0;
        while(num > 2){
            count += num / 3;
            num = num / 3 + num % 3;
            if(num == 2){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNextLine()){
            n = sc.nextInt();
            if(n == 0){
                break;
            }
            System.out.println(solution(n));
        }
        return;
    }
}
