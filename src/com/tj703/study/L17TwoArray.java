package com.tj703.study;

public class L17TwoArray {
    public static void main(String[] args) {
        //2차원 배열에 대해 알아보자
        int [] arr={12,13,14};
        int [][] twoArr={{1,2,3},{4,5,6},{7,8,9}};
        String [] strArr={"1234","567","891011"};
        String str ="안녕하세요~"; //{'안','녕','하','세','요'}
        System.out.println(str.charAt(2)); //str[2]
        System.out.println("\n{\"123\",\"456\",\"789\"} 반복실행");
        int sum=0;

        for(int i=0; i<strArr.length; i++){
            String s=strArr[i];
            for(int j=0; j<s.length(); j++){
                System.out.print(s.charAt(j)+",");//s[j]
                //sum+=Integer.parseInt(String.valueOf(s.charAt(j)).toString());
                sum+=Integer.parseInt(s.charAt(j)+"");
            }
            System.out.println();
        }
        System.out.println("strArr의 모든 데이터의 합 :"+sum);
        sum=0;
        //twoArr 의 모든 데이터를 더해서 출력하세요!
        for (int[] nums : twoArr){
            for(int num : nums){
                sum+=num;
            }
        }
        System.out.println("towArr의 모든 데이터의 합 :"+sum);
    }
}
