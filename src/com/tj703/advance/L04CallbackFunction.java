package com.tj703.advance;

import java.util.function.Function;

class CallbackBtn{
    public int a=10;
    class Event{

    }
    public void click(){
        this.onclick(new Event());
    }
    public void onclick(Event e){
    } //js의 button 요소의 타입을 흉내
    public void addEventListener(String event, Function callBackFun){
//        onclick=function(){
//            onclick();
//            callBackFun();
//        }
    }
}

public class L04CallbackFunction {
    public static void main(String[] args) {
        //콜백함수 : 정의해 놓으면 바로 실행되지 않고 호출될때만 실행
        //js btn.onclick=function(e){} //버튼을 클릭하면 실행되는 콜백함수를 재정의
        //함수 필드를 다른함수로 교체가능(함수형 언어의 특징)
        //js btn.addEventListener("click",function(e){})
        //함수의 매개변수로 함수를 작성가능 (함수형 언어의 특징 => 함수가 타입이기 때문)
        //객체지향언어 자바는 메서드 필드의 교차가 불가능하고 매개변수로 함수를 작성하는 것도 불가능 하다.
        CallbackBtn btn=new CallbackBtn();
        //btn.onclick=public void onclick(){}

        btn.a=30;
       // btn.addEventListener("click",public void onclick(){});
    }
}
