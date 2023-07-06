package ch09;

public class s01 {
    public static void main(String[] args) {
        String str = " Show me the money ";

        System.out.println("str.length() : " + str.length());
        System.out.println("str.charAt(1) : " + str.charAt(1));
        System.out.println("str.substring(6) : " + str.substring(6));
        // 주민번호 등을 잘라낼 떄
        // 12345678 -> "1" + "********"
        System.out.println("str.substring(6, 11) : " + str.substring(6, 11));
        // 아이디 happy를 캡스록 실수록 눌러서 HAPPY
        // 비교시 toLowerCase등을 이용해서 처리할 수 있다
        System.out.println("str.toLowerCase() : " + str.toLowerCase());
        System.out.println("str.toUpperCase() : " + str.toUpperCase());
        System.out.println("str.indexOf((\"e\") : " + str.indexOf("e"));
        System.out.println("str.lastIndexOf(\"e\") : " + str.lastIndexOf("e"));
        System.out.println("str.contains(\"the\") : " + str.contains("the"));
        System.out.println("str.startsWith(\"Show\") : " + str.startsWith("Show"));
        System.out.println("str.endsWith(\"money\") : " + str.endsWith("money"));
        System.out.println("str.trim() " + str.trim());
        System.out.println("str.replace(\"e\", \"x\") : " + str.replace("e", "x"));
        // System.out.println("str.repeat(2) : " + str.repeat(2));
        System.out.println("str.split(\" \") : " + str.split(" ").length);
        System.out.println("str.split(\" \") : " + str.split(" ")[1]);
        System.out.println("str.split(\" \") : " + str.split(" ")[4]);

        String name1 = "홍 길 동";
        System.out.println("name1.split(\" \") : " + name1.split(" "));

        String name2 = "cocacola";
        System.out.println("name2.split(\"\") : " + name2.split(""));

        // 값이 없는 빈 문자열 ""만 true
        System.out.println("\"\".isEmpty() : " + "".isEmpty());
        System.out.println("\" \".isEmpty() : " + " ".isEmpty());

        // System.out.println("\"\".isBlank() : " + "".isBlank());
        // System.out.println("\" \".isBlank() : " + " ".isBlank());
        // System.out.println("\" \".isBlank() : " + " ".isBlank());

        String bird1 = "오리";
        String bird2 = "오리";

        System.out.println("bird1 == bird2 : " + (bird1 == bird2));

        String bird3 = "독수리";

        System.out.println("bird3 == \"독수리\"" + bird3 == "독수리");

        String bird4 = new String("갈매기");
        String bird5 = new String("갈매기");

        System.out.println("bird4 == bird5 : " + (bird4 == bird5));
        System.out.println("bird4 == \"갈매기\" : " + (bird4 == "갈매기"));

        // 객체끼리 == 을 사용하면 주소를 비교하게 된다
        // 객체 끼리 equals를 사용하면 주소를 비교해보고 false면
        // 내부의 값을 한번 더 확인해서 비교한 뒤 true false를 리턴한다


        System.out.println("bird4.equals(bird2) : " + bird1.equals(bird2));
        System.out.println("bird4.equals(bird5) : " + bird1.equals(bird5));

        String korean = "가나다라";
        String[] split = korean.split("");

        for (int i = 0; i < korean.length(); i++) {
            System.out.println(korean.charAt(i));
        }

        // 문자열을 문자배열로 바꿔서 반복할 떄
        // 각 문자에 문자열메소드를 사용하고 싶을 떄
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i].repeat(2));
        }

        System.out.println("String.join(\"\", split)  :" + String.join("", split));
        System.out.println("String.join(\"a\", split)  :" + String.join("a", split));
        


    }

}
