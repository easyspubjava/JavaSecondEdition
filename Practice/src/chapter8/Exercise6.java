package chapter8;

import java.util.ArrayList;
import java.util.List;

abstract class Monster {
    abstract void attack();
}

class Dragon extends Monster {
    @Override
    void attack() {
        System.out.println("Breathes fire!");
    }
}

class Goblin extends Monster {
    @Override
    void attack() {
        System.out.println("Throws a rock!");
    }
}

class Troll extends Monster {
    @Override
    void attack() {
        System.out.println("Swings a huge club!");
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Dragon());
        monsters.add(new Goblin());
        monsters.add(new Troll());

        for (Monster monster : monsters) {
            monster.attack();  // 다형성을 통한 각 몬스터의 공격
        }
    }
}
