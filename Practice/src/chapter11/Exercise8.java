package chapter11;

// TrafficSignal enum 정의
enum TrafficSignal {
    RED(30),
    YELLOW(10),
    GREEN(60);

    private final int duration;

    TrafficSignal(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class Exercise8 {
    public static void main(String[] args) {

        for (TrafficSignal signal : TrafficSignal.values()) {
            System.out.printf(" %s색 신호의 대기 시간은 %d초 입니다.%n", signal, signal.getDuration());
        }
    }
}