package chapter9;

// 추상 클래스 Beverage 정의
abstract class Beverage {
    // 템플릿 메서드
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew(); // 재료 넣기

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments(); // 첨가물 추가
}

// Coffee 클래스, Beverage 상속
class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}

// Tea 클래스, Beverage 상속
class Tea extends Beverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("******* Coffee ********");
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("******* Tea ********");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
