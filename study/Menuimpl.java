package study;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menuimpl  {
    
    
    public void printMenu(){
        String[] items = {"돈까스", "국밥", "칼국수", "치킨", "김밥"};
        ArrayList<String> items = new ArrayList<>();
        items.add("돈까스");
        items.add("국밥");
        items.add("칼국수");
        items.add("치킨");
        items.add("김밥");
    
        // 메뉴를 출력
        // System.out.println("1. " + items[0]);
        // System.out.println("2. " + items[1]);
        // System.out.println("3. " + items[2]);
        // System.out.println("4. " + items[3]);
        // System.out.println("5. " + items[4]);
        // System.out.println("6. 아무꺼나 ");
        for (int i = 0; i < items.size; i++) {
            System.out.println(i+1 + ". " + items.get[i]);
        }
        System.out.println("6. 아무꺼나");
    }
   @Override
    public int inputNum() {
        System.out.print("입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        return age;
    }
   
    public void enterMenu(int age, String [] items) {
        if( age == 1 ) {
            System.out.println("1. " + items[0] + "를 먹겠습니다");
            System.out.println("맛있게 드세요");
        }
    }
    
    public void aiPrintMenu(String [] items  ) {
        Random random = new Random();
            // int rNum 은 랜덤 숫자
            int rNum = random.nextInt(items.length);
            System.out.println("엄청난 빅데이터로 분석하고 머신러닝으로 학습된 데이터의 결과로");
            System.out.println("추천된 메뉴" + items[rNum] + " 입니다");
    }
}
