package com.j4ev3.core;

public class LCD {

	// BUTTONTYPES
	public static byte COLOR_WHITE = (byte) 0x00;
	public static byte COLOR_BLACK = (byte) 0x01;

	private Brick brick;

	protected LCD(Brick brick) {
		this.brick = brick;
	}

	public void update() {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdUpdate();
		brick.sendCommand(c);

	}

	public void drawPixel(byte color, int x, int y) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdDrawPixel(color, x, y);
		brick.sendCommand(c);

	}

	public void drawLine(byte color, int x0, int y0, int x1, int y1) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdDrawLine(color, x0, y0, x1, y1);
		brick.sendCommand(c);

	}

	public void drawDottedLine(byte color, int x0, int y0, int x1, int y1, int onPixels, int offPixels) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdDrawDottedLine(color, x0, y0, x1, y1, onPixels, offPixels);
		brick.sendCommand(c);

	}

	public void drawRect(byte color, int x, int y, int xSize, int ySize) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdDrawRect(color, x, y, xSize, ySize);
		brick.sendCommand(c);

	}

	public void fillRect(byte color, int x, int y, int xSize, int ySize) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdFillRect(color, x, y, xSize, ySize);
		brick.sendCommand(c);

	}

	public void drawCircle(byte color, int x, int y, int radius) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdDrawCircle(color, x, y, radius);
		brick.sendCommand(c);

	}

	public void fillCircle(byte color, int x, int y, int radius) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdFillCircle(color, x, y, radius);
		brick.sendCommand(c);

	}

	public void drawText(byte color, int x, int y, String text) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdDrawText(color, x, y, text);
		brick.sendCommand(c);

	}

	public void drawPicture(byte color, int x, int y, String filePath) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdDrawPicture(color, x, y, filePath);
		brick.sendCommand(c);

	}

	public void fillWindow(byte color, int y0, int ySize) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdFillWindow(color, y0, ySize);
		brick.sendCommand(c);

	}

	public void enableTopLine(int zeroOne) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdEnableTopLine(zeroOne);
		brick.sendCommand(c);

	}

	public void selectFont(int font) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.lcdSelectFont(font);
		brick.sendCommand(c);

	}

}