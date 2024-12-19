package com.tj703.homewok;

import java.util.Scanner;

public class H01RandomNumMatch {
    public static void main(String[] args) {
        System.out.println("랜덤한게 생성한 (1~50)수를 맞추세요! ");
        double random=Math.random();
        long num=(long) (random*50)+1;
        System.out.println(num);
        while(true){
            Scanner scanner=new Scanner(System.in);
            String inputNumStr=scanner.nextLine();
            try{
                int inputNum=Integer.parseInt(inputNumStr);
                //Integer.parseInt : "13"=>13 (Number() or Number.parsInt())
                //"아13" => 오류
            }catch (NumberFormatException e){
                System.out.println("수만입력하세요!");
                continue;//아래코드는 무시하고 다시 반복문 실행
            }
            System.out.println("당신이 입력한 수는 :"+inputNumStr);
            //break; //반복문을 종료
        }
    }
}
