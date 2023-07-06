package ch00;

import lombok.Getter;

import lombok.ToString;

// 데이터를 제한적으로 고정한다
enum Gender {
    MALE, FEMALE
}

@ToString
@Getter
class Person {
    private String name;
    private String gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender.name();
    }
}

public class study11 {
    public static void main(String[] args) {

        Person person = new Person("홍길동", Gender.MALE);

        System.out.println(person);

    }
}
