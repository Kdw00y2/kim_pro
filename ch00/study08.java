// package ch00;

// import lombok.Setter;
// import lombok.ToString;


// abstract class Animal {
//     protected String name;
// }

// @ToString
// @Setter
// class Cat extends Animal {
//     public Cat(String name){
//         this.name = name;
//     }

//     public void cry(){
//         System.out.println("집사 밥");
//     }
// }


// public class study08 {
//     public static void main(String[] args) {
//         Cat cat = new Cat("dd");

//         cat.cry();

//         // 조상 클래스로 캐스팅 하는 것을 업 캐스팅이라고 한다
//         Animal animal = (Animal) cat;

//         // 자손이 cry를 가지고 있더라도
//         // 업캐스팅시 사용할수 없다.
//         // animal.cry();
        
//         Cat cat1 = (Cat) animal;  
        
//         cat1.cry();
        
//         System.out.println(cat1);

//         Animal animal2 = new Animal();

//         Cat cat2 = (Cat) animal2;

//         cat2.cry();

//     }
    
// }
