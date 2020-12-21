package ch07;

public class Television {
	int channel;
	int volume;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println(this.channel + "번으로 채널을 변경합니다.");
	}
	void channelUp() {
		if (channel >= 15) {
			this.channel = 1;
		}
		else {
			channel++;
		}
		System.out.println(this.channel + "번 채널로 변경합니다.");
	}
	void channelDown() {
		if (channel <= 1) {
			this.channel = 15;
		}
		else {
			channel--;
		}
		System.out.println(this.channel + "번 채널로 변경합니다.");
	}
	
	void volumeUp() {
		if (volume >= 25) {
			this.volume = 25;
			System.out.println("현재 볼륨 최대치입니다.");
		}
		else {
			volume++;
		}
		System.out.println("볼륨을 1올립니다.\n현재 볼륨 " + volume);
	}
	
	void volumeDown() {
		if (volume <= 0) {
			this.volume = 0;
			System.out.println("현재 볼륨 최소치입니다.");
		}
		else {
			volume--;
			System.out.println("볼륨을 1 내립니다. \n 현재 볼륨" + volume);
		}		
	}
	
}
