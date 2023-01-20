package chapter06;

public class TakeTrans {

	public static void main(String[] args) {

//		Bus bus = new Bus();
//		Subway subway = new Subway(null);
//		Subway sub = new Subway(null);
//		bus100.showInfo();		
		StdInfo stdJam = new StdInfo("Jam", 12000);
		StdInfo stdTom = new StdInfo("Tom", 10000);
		
		
		Bus bus100=new Bus(100);
		stdTom.takeBus(bus100);

		
		
		
		Bus bus987=new Bus(987);
		stdJam.takeBus(bus987);
		stdTom.takeBus(bus987);
		
		
		

		bus100.showInfo();
		bus987.showInfo();
		
		Subway subwayGreen=new Subway("2호선");
		Subway sub1=new Subway("1호선");
		stdTom.takeSubway(sub1);
		stdJam.takeSubway(subwayGreen);
				
		sub1.showInfo();
		subwayGreen.showInfo();

		stdTom.showInfo();
		stdJam.showInfo();
		
		
	}
}
