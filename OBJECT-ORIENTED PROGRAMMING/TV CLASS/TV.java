public class TV
{
	int channel = 1;
	int volumeLevel = 1;
	boolean switch_status = false;
	
	public void turnOn()
	{
		switch_status = true;
	}
	
	public void turnOff()
	{
		switch_status = false;
	}
	
	public void setChannel(int newChannel)
	{
		if (switch_status && channel >= 1 && channel <=120)
		{
			channel = newChannel;
		}
	}
	
	public void setVolume(int newVolume)
	{
		if (switch_status && volumeLevel >= 1 && volumeLevel <= 7)
		{
			volumeLevel =newVolume;
		}
	}
	
	public void channelUp()
	{
		if (switch_status && channel < 120)
		{
			channel++;
		}
	}
	
	public void channelDown()
	{
		if (switch_status && channel > 1)
		{
			channel--;
		}
	}
	
	public void volumeUp()
	{
		if (switch_status && volumeLevel < 7)
		{
			volumeLevel++;
		}
	}
	
	public void volumeDown()
	{
		if (switch_status && volumeLevel > 1)
		{
			volumeLevel--;
		}
	}
}
	