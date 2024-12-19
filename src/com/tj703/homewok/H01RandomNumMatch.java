package com.tj703.homewok;

import java.util.Scanner;

public class H01RandomNumMatch {
    public static void main(String[] args) {
        boolean game=true;
        gameLoop : while(game) {
            System.out.println("랜덤한게 생성한 (1~50)수를 맞추세요! ");
            double random = Math.random();
            int num = (int) (random * 50) + 1;
            System.out.println(num);
            int count = 0;
            while (true) {
                Scanner scanner = new Scanner(System.in);
                String inputNumStr = scanner.nextLine();
                //game을 무한히 반복시키세요! 2
                try {
                    //1+(--count) : 1을 먼저더하고 count를 1빼라
                    //1+(count--) : count를 1빼고 1을 더하라
                    int inputNum = Integer.parseInt(inputNumStr);
                    ++count;
                    //다음 코드부터는 inputNum은 무조건 존재함
                    if (inputNum == num) {
                        System.out.println(count + " 시도 :정답!"); //break;
                        break;
                    }
                    if (count == 5) {
                        System.out.println("졌습니다.");
                        break;
                    }
                    if (num < inputNum) {
                        System.out.println("down");
                    } else {
                        System.out.println("up");
                    }
                } catch (NumberFormatException e) {
                    if(inputNumStr.equals("exit")){
                        System.out.println("어플이 종료됩니다.");
                        break gameLoop;
                    }
                    System.out.println("숫자만 입력하세요.");
                }
            }
        }
    }
}
