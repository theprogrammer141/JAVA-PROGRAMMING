public class LuckyRacer
{
	public static void main(String[] args)
	{
		AutomaticCar car1 = new AutomaticCar("BMW i8", 2018, 10);
		AutomaticCar car2 = new AutomaticCar("Ferrari F430",2015, 20);
		AutomaticCar car3 = new AutomaticCar("Jaguar XKR", 2012, 30);
		AutomaticCar car4 = new AutomaticCar("Lamborghini Gallardo", 2012, 40);
		AutomaticCar car5 = new AutomaticCar("Buggati Veyron", 2016, 60);
		
		
		for(int round = 1; round <= 10; round++)
		{
			System.out.println("AFTER " + round + " HOUR/S:");
			
			car1.updateGearForNextRound();
			car2.updateGearForNextRound();
			car3.updateGearForNextRound();
			car4.updateGearForNextRound();
			car5.updateGearForNextRound();
			
			car1.setOdoMeter(car1.getOdoMeter() + car1.getSpeed());
			car2.setOdoMeter(car2.getOdoMeter() + car2.getSpeed());
			car3.setOdoMeter(car3.getOdoMeter() + car3.getSpeed());
			car4.setOdoMeter(car4.getOdoMeter() + car4.getSpeed());
			car5.setOdoMeter(car5.getOdoMeter() + car5.getSpeed());
			
			printRaceStatus(car1, car2, car3, car4, car5);
		}
		
		AutomaticCar winner = car1;
		if(car2.getOdoMeter() > winner.getOdoMeter())
			winner = car2;
		if(car3.getOdoMeter() > winner.getOdoMeter())
			winner = car3;
		if(car4.getOdoMeter() > winner.getOdoMeter())
			winner = car4;
		if(car5.getOdoMeter() > winner.getOdoMeter())
			winner = car5;
		
		System.out.println(winner.getModel() + " WINS THE RACE");
		System.out.println("GEAR MOSTLY USED:" + Math.round(winner.calculateAverageGear()));
	}
	
	private static void printRaceStatus(AutomaticCar... cars)
	{
		for(AutomaticCar car : cars)
		{
			System.out.print(car.getModel() + " ");
			int scaledDistance = (int)(car.getOdoMeter() / 100);
			for(int i = 0; i < scaledDistance; i++)
			{
				System.out.print("-");
			}
			System.out.println(" :" + car.getOdoMeter() + " KM PASSED");
		}
			System.out.println();
	}
}