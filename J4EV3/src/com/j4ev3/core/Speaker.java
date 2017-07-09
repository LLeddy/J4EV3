package com.j4ev3.core;

public class Speaker {

	private Brick brick;

	protected Speaker(Brick brick) {
		this.brick = brick;
	}

	public void playTone(int volume, int frequency, int msDuration) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY, 0, 0);
		c.speakerPlayTone(volume, frequency, msDuration);
		brick.sendCommand(c);

	}

	public void playSound(int volume, String fileName) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.speakerPlaySound(volume, fileName);
		brick.sendCommand(c);

	}

	public void breakPlay() {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.speakerBreakPlay();
		brick.sendCommand(c);

	}

}