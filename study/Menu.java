package study;

public interface Menu {
    // 작성된 메뉴 출력
    public String[] printMenu();
    // 사용자 입력 기능
    public void inputNum();
    // 입력된 값에 따라 메뉴 출력
    public void enterMenu(String [] items);
    // 아무꺼나 AI 추천 메뉴 출력
    public void aiPrintMenu(String [] items);
    
}
