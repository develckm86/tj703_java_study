package com.tj703.homewok;

import java.util.Scanner;

public class H01RandomNumMatch {
    public static void main(String[] args) {
        System.out.println("랜덤한게 생성한 (1~50)수를 맞추세요! ");
        double random=Math.random();
        int num=(int) (random*50)+1;
        System.out.println(num);
        boolean game=true;
        int count=0;
        while(game){
            Scanner scanner=new Scanner(System.in);
            String inputNumStr=scanner.nextLine();
            //정답을 5번 안에 맞추도록 하세요!
            //입력이 5번을 넘기면 졌습니다. 종료! **1
            //game을 무한히 반복시키세요! 2
            try {
                //1+(--count) : 1을 먼저더하고 count를 1빼라
                //1+(count--) : count를 1빼고 1을 더하라
                int inputNum=Integer.parseInt(inputNumStr);
                ++count;
                //다음 코드부터는 inputNum은 무조건 존재함
                if(inputNum==num){
                    System.out.println(count+" 시도 :정답!"); //break;
                    game=false;
                }else{
                    if(count==5){
                        System.out.println("졌습니다.");
                        game=false;
                    }else{
                        if(num<inputNum){
                            System.out.println("down");
                        }else{
                            System.out.println("up");
                        }
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("숫자만 입력하세요.");
            }
        }
    }
}
