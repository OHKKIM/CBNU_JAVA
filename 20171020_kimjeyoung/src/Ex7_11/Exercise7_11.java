package Ex7_11;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int prevCh;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	
	boolean getPowerOn() {
		return isPowerOn;
	}
	
	void setChannel(int channel) {
		if(!(channel > MAX_CHANNEL || channel < MIN_CHANNEL)) {
			prevCh = this.channel;
			this.channel = channel;
		}
	}
	
	int getChannel() {
		return channel;
	}
	
	void setVolume(int volume) {
		if(!(volume > MAX_VOLUME || volume < MIN_VOLUME))
			this.volume=volume;
	}
	
	int getVolume(){
		return volume;
	}
	
	void gotoPrevChannel() {
		setChannel(prevCh);
	}
}
class Exercise7_11 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}
