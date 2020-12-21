package ch07;

public class IPTV extends Television {
	int VODChannel;
	
	void changeVODChannel(int VODChannel) {
		this.VODChannel = VODChannel;
		System.out.println("VOD채널을" + VODChannel +"으로 변경합니다.");
	}
}
