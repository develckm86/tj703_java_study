package com.tj703.study;
class SmartThings{
    //모든 종류의 tv를 모바일로 자동조작(모든 종류의 tv 리모콘을 가져와야합니다.)
    public void remotePower(SamsungRemotecon remotecon){
        remotecon.powerBtn();
    }
    public void remotePower(LgRemotecon remotecon){
        remotecon.powerBtn();
    }
    public void remotePower(AppleRemotecon remotecon){
        remotecon.powerBtn();
    }
    //메소드는 한개인데 매개변수가 달라서 다르게 동작하는 Overload => 다형성
    public void remoteArrowBtn(AbstractRemotecon remotecon,String arrow){
        remotecon.arrowBtn(arrow);
    }
    //타입의 다형성을 잘못사용한 예!
    public  void allRemotePower(Object remotecon){
        AbstractRemotecon abstractRemotecon=(AbstractRemotecon) remotecon;
        //부모타입을 참조하던 변수를 자식타입의 변수로 참조하는 것은 강제 형변환(Casting).
        //=>매개변수를 너무 부모로 작성하면 Casting 형변환시 오류가 발생할 수 있다.
        //자바 부득이하지 않는경우 매개변수의 타입으로 Object 작성을 권장하지 않는다.
        abstractRemotecon.powerBtn();
    }
    /* js 를 왜 type script(js 를 정적 타입으로 만든는 언어) 로 사용하나요.
    * 배달에민족(우아한형제들) 타입스크립트를 사용하는 이유
    * let a=10;
    * Object a=10;  => int a=10
    *
    * let date=new Date();
    * date=10;
    * date.toTimeLocaleString();//undefined or 오류
    *
    * const date=new Date();
    * date=10; //상수는 최초에 대압한 값이나 객체를 바꿀 수 없다. => 오류 => 좋은 오류
    *
    * js각 객체를 참조하는 변수를 상수로 바꾸는 이유? :
    * 동적타입 언어라 없는 필드를 참조하면 오류가 발생하기 때문에 바뀌지 않도록 데이터를 고정한다.
    *
    * Date date=new Date();
    * //date=10; ->컴파일 불가능(타입을 명시하는 정적타입언어기 때문)
    * date.getMonth();
    *
    * Object date=new Date();
    * date=10;
    * ((Date)date).getMonth();
    * //Integer(10)은  getMonth 메소드가 없어서 실행중에 오류(나쁜 오류)
    *
    * */
}
public class L27ParamTypePolymorphism {
    //매개변수의 타입을 타입의 다형성을 이용해 생산성 높이기
    public static void main(String[] args) {
        SmartThings smartThings=new SmartThings();
        //SamsungRemotecon remotecon=new SamsungRemotecon();
        String remotecon="삼성 리모콘";
        //가짜리모콘 : String 은 AbstractRemotecon 을 구현하는 자식타입이 아니기 때문에
        // 캐스팅 형변환시 오류발생 (ClassCastException)
        smartThings.allRemotePower(remotecon);
        //smartThings.remotePower(remotecon);
    }
}
