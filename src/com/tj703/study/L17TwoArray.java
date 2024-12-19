package com.tj703.study;

public class L17TwoArray {
    public static void main(String[] args) {
        //2차원 배열에 대해 알아보자
        int [] arr={12,13,14};
        int [][] twoArr={{1,2,3},{4,5,6},{7,8,9}};
        String [] strArr={"123","456","789"};
        String str ="안녕하세요~"; //{'안','녕','하','세','요'}
        System.out.println(str.charAt(2)); //str[2]
        //for(char c : str){}
        char [] cArr=str.toCharArray();
        for(char c: cArr){
            System.out.print(c+",");
        }
        System.out.println("\n{\"123\",\"456\",\"789\"} 반복실행");
        for(String s: strArr){
           char [] cs=s.toCharArray();
           for(char c : cs ){
               System.out.print(c+",");
           }
            System.out.println();
        }
        //twoArr 의 모든 데이터를 더해서 출력하세요!
        int sum=0;
        for (int[] nums:twoArr){
            for(int num : nums){
                sum+=num;
            }
        }
        System.out.println(sum);
    }
}
