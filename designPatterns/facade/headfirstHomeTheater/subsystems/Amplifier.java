package designPatterns.facade.headfirstHomeTheater.subsystems;

public class Amplifier {

	public void on() {
		System.out.println("Amplifier on");
	}

	public void setDvd(DvdPlayer dvd) {
		System.out.println("Amplifier setting DVD player");
	}

	public void setSurroundSound() {
		System.out.println("Amplifier surround sound on (5 speakers, 1 subwoofer)");
	}

	public void setVolume(int i) {
		System.out.println("Amplifier setting volume to: " + i);
	}

	public void off() {
		System.out.println("Amplifier off");
	}

}
