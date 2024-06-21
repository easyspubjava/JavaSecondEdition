package ifexample;

public class SwitchCase5 {

    public static void main(String[] args) {
        int month = 13;
        int day = switch(month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                if (month < 1 || month > 12) {
                    System.out.println("없는 달입니다.");
                }
                else {
                    System.out.println("알 수 없는 오류입니다.");
                }
                yield 0;
            }
        };
        System.out.println(month + "월의 날짜는 " + day + "일까지 있습니다.");
    }
}
