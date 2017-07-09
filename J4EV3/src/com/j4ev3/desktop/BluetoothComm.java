package com.j4ev3.desktop;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;

import com.j4ev3.core.CommInterface;

public class BluetoothComm implements CommInterface {

	private String mac_address;

	private InputStream in;
	private OutputStream out;

	public BluetoothComm(String mac_address) {
		this.mac_address = mac_address;
		connect();
	}

	@Override
	public void connect() {
		String s = "btspp://" + mac_address + ":1";
		try {
			StreamConnection c = (StreamConnection) Connector.open(s);
			in = c.openInputStream();
			out = c.openOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void disconnect() {
		try {
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void write(byte[] cmd) {
		try {
			out.write(cmd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public byte[] readReply() {

		byte[] reply = new byte[1024];

		try {
			in.read(reply);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.printf("recv 0x|%02X|", reply[4]);

		return reply;
	}

}