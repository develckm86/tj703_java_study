package com.tj703.homewok;

import java.util.Scanner;

public class H01RandomNumMatch {
    public static void main(String[] args) {
        System.out.println("랜덤한게 생성한 (1~50)수를 맞추세요! ");
        //맞출때 까지 반복 실행
        double random=Math.random(); //java.lang 패키지는 자동으로 Import (String,Integer..)
        System.out.println(random);
        int num=(int)(random*50)+1; //더큰수->작은수 (강제형변환) casting

        System.out.println(num);
        Scanner scanner=new Scanner(System.in);
        String inputNumStr=scanner.nextLine();
        //enter(line 개행)를 입력할때까지의 문자열을 받는다.
        //콘솔에서 문자열을 입력하고 엔터를 누를때까지 jvm 대기
        System.out.println("당신이 입력한 수는 :"+inputNumStr);
        //랜덤하게 뽑은 수가 입력한 수와 같을때까지 반복실행하는 코드를 작성하세요!
    }
}
