package polymorphism;

import java.util.ArrayList;

public class AnimalTest2 {

    ArrayList<Animal> aniList = new ArrayList<Animal>();

    public static void main(String[] args) {
        AnimalTest2 aTest = new AnimalTest2();
        aTest.addAnimal();
        System.out.println("===== 원래 형으로 다운 캐스팅 ===== ");
        aTest.testCasting();

    }

    public void addAnimal()
    {
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());

        for(Animal ani : aniList){
            ani.move();
        }
    }


    public void testCasting()
    {
        for(int i=0; i<aniList.size(); i++){  // 모든 배열 요소를 하나씩 돌면서
            Animal ani = aniList.get(i);      // Animal형으로 가져옴
            if(ani instanceof Human h){       // Human이면
                h.readBook();
            }
            else if(ani instanceof Tiger t){
                t.hunting();
            }
            else if(ani instanceof Eagle e){
                e.flying();
            }
            else{
                System.out.println("지원되지 않는 자료형입니다.");
            }
        }
    }
}