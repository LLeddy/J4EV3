package com.j4ev3.core;

public class Brick {

	private CommInterface commInterface;

	private Motor motor;
	private LCD lcd;
	private Speaker speaker;
	private LED led;
	private Button button;
	private Sensor sensor;

	public static int sequence = 1;

	public Brick(CommInterface commInterface) {
		this.commInterface = commInterface;

		motor = new Motor(this);
		lcd = new LCD(this);
		speaker = new Speaker(this);
		led = new LED(this);
		button = new Button(this);
		sensor = new Sensor(this);

	}

	public Motor getMotor() {
		return motor;
	}

	public LCD getLCD() {
		return lcd;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public LED getLED() {
		return led;
	}

	public Button getButton() {
		return button;
	}

	public Sensor getSensor() {
		return sensor;
	}
	
	public void disconnect() {
		commInterface.disconnect();
	}

	/*
	 * The following program ID definition can be referenced: 
	 * 0 Program slot reserved for executing the user interface
	 * 1 Program slot used for executing user programs
	 * 2 Program slot used for direct commands received from external 
	 * 3 Program slot used for direct commands coming from the user interface 
	 * 4 Program slot used for debug user interface
	 * -1 Current slot
	 */
	
	public static int PRG_UI                =  0;
	public static int PRG_USER_PROGRAMS     =  1;
	public static int PRG_DIRECT_COMMAND    =  2;
	public static int PRG_DIRECT_COMMAND_UI =  3;
	public static int PRG_UI_DEBUG          =  4;
	public static int PRG_CURRENT           = -1;
	
	
	// PROGRAM OPERATIONS
	public void stopProgram(int prgId) {
		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.genStopProgram(prgId);
		sendCommand(c);
	}

	public byte[] sendCommand(Command c) {
		synchronized (commInterface) {
			commInterface.write(c.byteCode());
			if (c.getCommandType() == Code._DIRECT_COMMAND_REPLY || c.getCommandType() == Code._SYSTEM_COMMAND_REPLY) {
				byte[] reply = waitForReply(c.getCommandType());
				return reply;
			} else {
				return new byte[] { (byte) sequence };
			}
		}
	}

	private byte[] waitForReply(byte commandType) {
		while (true) {
			byte[] reply = commInterface.readReply();
			if (commandType == Code._DIRECT_COMMAND_REPLY && reply[4] != Code._DIRECT_REPLY) {
				try {
					printMessage(reply);
					throw new Exception(String.format("Direct commmand: %02X:%02X returned error", reply[2], reply[3]));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (commandType == Code._SYSTEM_COMMAND_REPLY && reply[4] != Code._SYSTEM_REPLY) {
				try {
					throw new Exception(String.format("System commmand: %02X:%02X returned error", reply[2], reply[3]));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return reply;
		}
	}
	
	private void printMessage(byte[] cmd) {
		System.out.println();
		System.out.print("send" + " 0x|");
		for (int i = 0; i < cmd.length - 1; i++) {
			System.out.printf("%02X:", cmd[i]);
		}
		System.out.printf("%02X|", cmd[cmd.length - 1]);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
	}

}