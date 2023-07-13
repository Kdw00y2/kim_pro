package study;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception{
        System.out.println("오늘 머 먹지?");
        Menu menu = new Menuimpl();
        menu.printMenu();
        String[] items = menu.printMenu();
        int age = menu.inputNum();
        menu.enterMenu(age, items);
        menu.aiPrintMenu(items);
        // 메뉴 작성

        // String[] items = {"돈까스", "국밥", "칼국수", "치킨", "김밥"};
    
        // 메뉴를 출력
        // System.out.println("1. " + items[0]);
        // System.out.println("2. " + items[1]);
        // System.out.println("3. " + items[2]);
        // System.out.println("4. " + items[3]);
        // System.out.println("5. " + items[4]);
        // System.out.println("6. 아무꺼나 ");
        // for (int i = 0; i < items.length; i++) {
        //     System.out.println(i+1 + ". " + items[i]);
        // }
        
        // 사용자에게 입력받고
        // System.out.print("입력하세요 : ");
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        if ( age == 1) {
            System.out.println("1번 돈까스를 선택했습니다");
            System.out.println("맛있게 드세요");
        } if ( age == 2) {
            System.out.println("2번 국밥를 선택했습니다");
            System.out.println("맛있게 드세요");
        } if ( age == 3) {
            System.out.println("3번 칼국수를 선택했습니다");
            System.out.println("맛있게 드세요");
        } if ( age == 4) {
            System.out.println("4번 치킨를 선택했습니다");
            System.out.println("맛있게 드세요");
        } if ( age == 5) {
            System.out.println("5번 김밥를 선택했습니다");
            System.out.println("맛있게 드세요");
        } 
        // 만약에 1번을 누르면 선택된 메뉴가 출력
        // 만약에 2번을 누르면 선택된 메뉴가 출력
        // 아무꺼나 선택 기능(AI)
        if ( age == 6) {
            Random random = new Random();
            // int rNum 은 랜덤 숫자
            int rNum = random.nextInt(items.length);
            System.out.println("엄청난 빅데이터로 분석하고 머신러닝으로 학습된 데이터의 결과로");
            System.out.println("추천된 메뉴" + items[rNum] + " 입니다");
            
        }
        // 선택된 메뉴 출력
    }

}
