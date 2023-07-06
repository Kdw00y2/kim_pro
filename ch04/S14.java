package ch04;

// import java.text.MessageFormat;

// public class S14 {
//     public static void main(String[] args) {
//         // 이중 for문
//         // repeat 없이
//         // "*"

//         // 2
//         // *
//         // **
//         // ***
//         // ****
//         // *****
//         // for (int i = 0; i < 5; i++) {
//         //     for (int j = 0; j <= i; j++) {
//         //         System.out.print("*");
//         //     }
//         //     System.out.println();
//         // }

//         // 4
//         // *****
//         //  ***
//         //   *
//         // 행이 3개
//         // 열에 있는 공백이 0개 1개 2개
//         // 열에 있는 별이 5개 3개 1개 
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 5; j > i * 2; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         // 구구단
//         // 2 X 1 = 2
//         // ...
//         // 9 X 9 = 81
//         // for (int i = 2; i < 10; i++) {
//         //     for (int j = 1; j < 10; j++) {
//         //         String str = MessageFormat.format("{0} X {1} = {2}", i, j, i * j);
//         //         System.out.println(str);
//         //     }
//         // }
//     }
// }
