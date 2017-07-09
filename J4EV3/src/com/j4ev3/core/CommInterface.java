package com.j4ev3.core;

public interface CommInterface {
	
	void connect();
	void disconnect();
	void write(byte[] cmd);
	byte[] readReply();
	
}