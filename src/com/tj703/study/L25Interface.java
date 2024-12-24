package com.tj703.study;
interface Remotecon{
    //interface 는 간단한 설계도로 구현({body})이 불가능
    //interface 는 외부(public)에서 사용가능한 기능만 명세가능
    //바디가 구현되지 않은 메소드를 추상 메소드라 부른다.
    void powerBtn(); //public이 자동완성
    /**
    * 방향키*/
    int arrowBtn(String arrow);
}
class SmartRemotecon implements Remotecon{
    /**
     * 전원버튼
     */
    @Override
    public void powerBtn() {
        System.out.println("tv 전원아 켜져라! 빨간불 깜박!!");
    }

    /**
     * 방향키 버튼입니다. (주의 "up","down","left","right" 만 사용 가능)
     * @param arrow "up","down","left","right"
     * @return int 전기적 신호
     */
    @Override//인터페이스의 메소드를 재정의 하는 것도 Override
    public int arrowBtn(String arrow) {
        int arrowBtn=0;
        switch (arrow){
            case "up":
                System.out.println("위로 이동!");
                arrowBtn=1;
                break;
            case "down": System.out.println("아래로 이동!"); arrowBtn=2;break;
            case "left": System.out.println("왼쪽 이동!");arrowBtn=3; break;
            case "right": System.out.println("오른쪽 이동!");arrowBtn=4; break;

        }
        return arrowBtn;
    }
    //class 는 완성된 타입으로 미완성된 함수가 존재할 수 없기 때문에 꼭 바디를 구현해야한다.
    //implements 해당 class가 interface를 구현하겠다고 명시하는 것
}

public class L25Interface {
    public static void main(String[] args) { //class의 실제 사용자 main
         //개발 디자인 => 추상화!
        Remotecon remotecon=new SmartRemotecon();//interface 는 타입이 될수 있다.
        remotecon.powerBtn();
        remotecon.arrowBtn("up");
        String s=new String("안녕");
    }
}
