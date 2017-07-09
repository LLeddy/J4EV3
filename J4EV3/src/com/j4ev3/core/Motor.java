package com.j4ev3.core;

public class Motor {

	// motor ports
	public static byte PORT_A   = (byte) 0x01;
	public static byte PORT_B   = (byte) 0x02;
	public static byte PORT_C   = (byte) 0x04;
	public static byte PORT_D   = (byte) 0x08;
	public static byte PORT_ALL = (byte) 0x0F;

	private Brick brick;

	protected Motor(Brick brick) {
		this.brick = brick;
	}

	public void stopMotor(byte ports, boolean brake) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.motorStopMotor(ports, brake);
		brick.sendCommand(c);

	}

	public void setPolarity(byte ports, int polarity) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.motorSetPolarity(ports, polarity);
		brick.sendCommand(c);

	}

	public void turnAtPower(byte ports, int power) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.motorTurnAtPower(ports, power);
		c.motorStartMotor(ports);
		brick.sendCommand(c);

	}

	public void turnAtSpeed(byte ports, int speed) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.motorTurnAtSpeed(ports, speed);
		c.motorStartMotor(ports);
		brick.sendCommand(c);

	}

	public void stepAtPower(byte ports, int power, int rampUp, int continueRun, int rampDown, boolean brake) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.motorStepAtPower(ports, power, rampUp, continueRun, rampDown, brake);
		c.motorStartMotor(ports);
		brick.sendCommand(c);

	}

	public void timeAtPower(byte ports, int power, int msRampUp, int msContinueRun, int msRampDown, boolean brake) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.motorTimeAtPower(ports, power, msRampUp, msContinueRun, msRampDown, brake);
		c.motorStartMotor(ports);
		brick.sendCommand(c);

	}

	public void stepAtSpeed(byte ports, int speed, int rampUp, int continueRun, int rampDown, boolean brake) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.motorStepAtSpeed(ports, speed, rampUp, continueRun, rampDown, brake);
		c.motorStartMotor(ports);
		brick.sendCommand(c);

	}

	public void timeAtSpeed(byte ports, int speed, int msRampUp, int msContinueRun, int msRampDown, boolean brake) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.motorTimeAtSpeed(ports, speed, msRampUp, msContinueRun, msRampDown, brake);
		c.motorStartMotor(ports);
		brick.sendCommand(c);

	}

	public void stepSync(byte ports, int speed, int turn, int step, boolean brake) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.motorStepSync(ports, speed, turn, step, brake);
		c.motorStartMotor(ports);
		brick.sendCommand(c);

	}

	public void timeSync(byte ports, int speed, int turn, int msTime, boolean brake) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY);
		c.motorTimeSync(ports, speed, turn, msTime, brake);
		c.motorStartMotor(ports);
		brick.sendCommand(c);

	}

}