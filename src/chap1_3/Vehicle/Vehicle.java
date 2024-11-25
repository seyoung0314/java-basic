package chap1_3.Vehicle;

import chap1_3.Dancer.Owner;

public class Vehicle {
    //속성(필드)정의
    String company; //회사명
    String model; //모델명

    // 상태 속성 - 수시로 변하는 속성
    int currentSpeed; // 현재속도
    boolean isOn ; // 시동여부

    //컴포지션(포함) 속성 - 객체가 객채를 중첩한 형태
    Owner owner;

    //생성자
    Vehicle(String mName){
        model = mName;
    }

    //기능
    //시동켜는 시능
    void powerOn(){
        if(isOn){
            System.out.println( model+" 시동이 이미 걸려있습니다.");
            return;
        }
        isOn = true;
        System.out.println(model+" 시동이 걸렸습니다.");
    //시동을 끄는 기능
    }
    void powerOff(){
        if(!isOn){
            System.out.println("시동이 걸려있지 않습니다.");
            return;
        }
        isOn = false;
        System.out.println("시동이 꺼졌습니다.");
    }
    // 주행기능
    void accelerate(){
        System.out.printf("%s 자동차가 주행을 시작합니다.",model);
        currentSpeed += 20;
        System.out.printf("\n현재 속도 :  %d km/h\n",currentSpeed);
    }
}
