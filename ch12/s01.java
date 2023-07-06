package ch12;

import lombok.AllArgsConstructor;

// 제네릭
// <> 안에 들어가는 T는 type의 약자이다

class Num <T extends Number>{
    // 필드가 정수 일수도 있고 실수 일수도 있는 경우
    T value;

    public Num(T value){
        this.value = value;
    }

}

public class s01 {
    public static void main(String[] args) {
    //    Num num = new Num<Integer>(1);

       Num<Long> num = new Num<Long>(1L);

       
    }
    
}
