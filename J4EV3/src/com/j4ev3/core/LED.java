package com.j4ev3.core;

public class LED {

	// LEDPATTERN
	public static byte LED_OFF = (byte) 0x00;
	public static byte LED_GREEN = (byte) 0x01;
	public static byte LED_RED = (byte) 0x02;
	public static byte LED_ORANGE = (byte) 0x03;
	public static byte LED_GREEN_FLASH = (byte) 0x04;
	public static byte LED_RED_FLASH = (byte) 0x05;
	public static byte LED_ORANGE_FLASH = (byte) 0x06;
	public static byte LED_GREEN_PULSE = (byte) 0x07;
	public static byte LED_RED_PULSE = (byte) 0x08;
	public static byte LED_ORANGE_PULSE = (byte) 0x09;

	private Brick brick;

	protected LED(Brick brick) {
		this.brick = brick;
	}

	public void setPattern(byte pattern) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.ledSetPattern(pattern);
		brick.sendCommand(c);

	}

}