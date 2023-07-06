// package ch00;


// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;
// import lombok.ToString;


// // 어노테이션을 읽어서 생성자를 만들어 준다
// @Getter
// @NoArgsConstructor
// // getName 등 필드의 데이터를 읽거나 수정하는 메소드를 자동으로 만들어준다
// @Setter
// @AllArgsConstructor
// // 인스턴스의 정보를 정리해서 보여주도록 toString을 오버라이딩한다
// @ToString
// class Cat {
//     private String name;
//     private boolean male;

//     // lombok 사용 중에도 변경하고 싶은 메소드만 작성하면
//     // 나머지는 기본적으로 작성이 되고
//     // 직접 작성한 것은 덮어씌워진다
//     public String getName(){
//         return this.name + "입니다";
//     }
// }

    
// public class study07 {
//     public static void main(String[] args) {
//         // 고양이 태어남
//         Cat cat = new Cat();

//         //고양이 이름이 뭐야?
//         System.out.println(cat.getName());

//         // 고양이야 수컷이야?
//         System.out.println(cat.isMale());

//         // 이름 냐옹 18세로 바꿔
//         cat.setName("냐옹 18세");


//         // 너에 대해 알려줘
//         // cat 또는 cat.toString()
//         System.out.println(cat);
//     }
    
// }
