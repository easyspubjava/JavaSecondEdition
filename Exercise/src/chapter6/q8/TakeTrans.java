package chapter6.q8;

public class TakeTrans {

	public static void main(String[] args) {

		  Student studentJames = new Student("James", 5000);   
		  Student studentTomas = new Student("Tomas", 10000);
		   
		  Bus bus100 = new Bus(100);
		  studentJames.takeBus(bus100);     // james가 100번 버스를 탐
		  studentJames.showInfo();           // james 정보 출력
		  bus100.showInfo();                // 버스 정보 출력
		
		  Subway subwayGreen = new Subway("2호선");
		  studentTomas.takeSubway(subwayGreen);  // Tomas가 2호선 지하철을 탐
		  studentTomas.showInfo();                 // Tomas 정보 출력
		  subwayGreen.showInfo();
		  
		  Student studentEdward = new Student("Edward", 30000);
		  Taxi taxi = new Taxi("잘나간다 운수");
		  studentEdward.takeTaxi(taxi);  //Edward가 택시를 탐
		  studentEdward.showInfo(); 
		  taxi.showInfo();
	}
}
