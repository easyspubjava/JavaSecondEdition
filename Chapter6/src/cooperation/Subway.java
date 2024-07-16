package cooperation;

public class Subway {
	 public String lineNumber;
	 public int passengerCount;
	 public int money;
	    
	 public Subway(String lineNumber) {   // ����ö �뼱 �ʱ�ȭ
		  this.lineNumber = lineNumber;   
	 }
	    
	 public void take(int money) {
		  this.money += money;
		  passengerCount++;
	 } 
	    
	 public void showInfo()
	 {
		  System.out.println(lineNumber + "의 승객은 " + passengerCount +"명이고, 수입은 " + money + "입니다.");
	 }

}
