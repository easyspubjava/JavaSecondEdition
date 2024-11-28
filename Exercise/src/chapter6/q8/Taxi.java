package chapter6.q8;

public class Taxi {
	   String companyName;             // 회사 이름
	   int money;                 // 택시의 수입
		    
		 public Taxi(String companyName)   // 회사 이름을 매개변수로 받은 생성자
		 {   
			  this.companyName = companyName;
		 }
		
		 public void take(int money)   // 승객이 낸 돈을 받음
		 {  
			  this.money += money;    // 택시의 수입 증가
			  
		 }
		    
		 public void showInfo() {      // ���� ������ ����ϴ� �Լ�
			 System.out.println(companyName + " 택시 수입은 " + money + "입니다.");
		 }


}
