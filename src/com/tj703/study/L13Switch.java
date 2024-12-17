package com.tj703.study;

import java.util.Date; //현재 패키지에 클래스가 없다면 import
import java.util.Scanner; //입력을 받는 class

public class L13Switch {
    public static void main(String[] args) {
        int month=3;
        String monthStr=null;
        if(month==1){
            monthStr="Jan";
        }else if(month==2){
            monthStr="Feb";
        }else if(month==3){
            monthStr="Mar";
        }//....
        System.out.println(monthStr);
        //switch : 동등비교연산*으로 else if 의 조건을 작성할 때 더 빠르게 동작하고 가독성이 좋다.
        //**switch 무조건 입력이 1개 존재해야한다.
        month=1;
        switch (month){
            case 1 :
                monthStr="Jan";
                break; //해당 조건이 맞으면 switch를 벗어나겠다.
            case 2 :
                monthStr="Feb";
                break;
            case 3 :
                monthStr="Mar";
                break;
        }
        System.out.println(monthStr);

        //자료형을 입력으로 사용

        //monthStr="Sep";
        monthStr=new String("Sep"); //month가 9가 되면 equals 로 비교연사한다는 뜻
        month=0;
        //입력한 데이터가 자료형이면 동등비교연산(==) 대신 equals 를 사용합니다.(**)
        switch (monthStr){
            case "Jan" : month=1; break;
            case "Feb" : month=2; break;
            case "Mar" : month=3; break;
            case "Apr" : month=4; break;
            case "May" : month=5; break;
            case "Jun" : month=6; break;
            case "Jul" : month=7; break;
            case "Aug" : month=8; break;
            case "Sep" : month=9; break;
            case "Oct" : month=10; break;
            case "Nov" : month=11; break;
            case "Dec" : month=12; break;
            default: month=-1; break;
        }
        System.out.println("입력한 달은 "+month+"월 입니다.");
        //** switch 가 인기가 없는 이유
        //1. 크기비교를 할 수 없다.
        //2. && || 을 이용해 복작한 비교연산을 작성 할수 없다.(오직 ==,equals 로 비교연산)
        //3. 순서가 있는 데이터는 배열이 대신할 수 있고 자바스크립트에서 Object의 key 를 switch의 case 대신 사용
        month=3;
        String [] monthStrArr={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dev"};

        String str=monthStrArr[month];
        System.out.println(str);


        Date now=new Date(); //현재 날짜 객체
        System.out.println(now.getMonth()); //java 1월이 0부터 시작
        int nowMonth=now.getMonth();
        System.out.println(monthStrArr[nowMonth]);
        Scanner scanner=new Scanner(System.in);
        //Scanner 입력을 받는 객체, System.in
        System.out.print("알고 싶은 달의 이름은 (숫자입력)? :");
        String inMonthStr=scanner.nextLine();//콘솔에서 입력하고 엔터를 누르면 엔터를 누르기 전까지 입력받는다.
        int inMonth=Integer.parseInt(inMonthStr);
        System.out.println(monthStrArr[inMonth-1]);
    }
}
