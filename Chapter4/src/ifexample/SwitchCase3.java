package ifexample;

public class SwitchCase3 {
    public static void main(String[] args) {
        String medal = "Gold";

        switch(medal) {

            case "Gold" -> System.out.println("금메달 입니다.");

            case "Silver" -> System.out.println("은메달 입니다");

            case "Bronze" -> System.out.println("동메달 입니다");

            default -> System.out.println("메달이 없습니다");

        }
    }
}
