public class TestTV
{
	public static void main(String[] args)
	{
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("TV1's channel is : " + tv1.channel + " and it's volume is : " + tv1.volumeLevel);
		System.out.println("TV2's channel is : " + tv2.channel + " and it's volume is : " + tv2.volumeLevel);		
	}
}