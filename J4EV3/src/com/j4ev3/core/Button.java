package com.j4ev3.core;

public class Button {

	// BUTTONTYPES
	public static byte NO_BUTTON = (byte) 0x00;
	public static byte UP_BUTTON = (byte) 0x01;
	public static byte ENTER_BUTTON = (byte) 0x02;
	public static byte DOWN_BUTTON = (byte) 0x03;
	public static byte RIGHT_BUTTON = (byte) 0x04;
	public static byte LEFT_BUTTON = (byte) 0x05;
	public static byte BACK_BUTTON = (byte) 0x06;
	public static byte ANY_BUTTON = (byte) 0x07;
	public static byte BUTTONTYPES = (byte) 0x08;

	private Brick brick;

	protected Button(Brick brick) {
		this.brick = brick;
	}

	public int buttonPressed(byte button) {

		Command c = new Command(Code._DIRECT_COMMAND_REPLY, 1, 0);
		c.buttonButtonPressed(button);
		byte[] buttonPressed = brick.sendCommand(c);

		return buttonPressed[5];

	}

}