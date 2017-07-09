package com.j4ev3.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Sensor {
	
	/*
	 * source: https://github.com/mindboards/ev3sources/blob/78ebaf5b6f8fe31cc17aa5dce0f8e4916a4fc072/lms2012/lms2012/Linux_AM1808/sys/settings/typedata.rcf
	 *
       Type   Mode  Name      DataSets Format   Figures  Decimals  Views  Conn. Pins  RawMin   RawMax   PctMin  PctMax  SiMin    SiMax    Time  IdValue  Symbol
       ----   ----  --------  -------- ------   -------  --------  -----  ----- ----  -------  -------  ------  ------  -------  -------  ----  -------  --------
	7     0     L-MOTOR-DEG   1       2     4        0         2      125   0x46   -180.0    180.0       0     100   -180.0    180.0     0        0  deg
    	7     1     L-MOTOR-ROT   1       2     4        0         2      125   0x46 -36000.0  36000.0       0     100   -100.0    100.0     0        0  rot
	7     2     L-MOTOR-SPD   1 	  0	3	 0 	   2 	  125 	0x46   -100.0 	 100.0 	  -100 	   100	 -100.0    100.0     0 	      0  pct
		
	8     0     M-MOTOR-DEG   1       2     4        0         2      125   0x46   -180.0    180.0       0     100   -180.0    180.0     0        0  deg
        8     1     M-MOTOR-ROT   1       2     4        0         2      125   0x46 -36000.0  36000.0       0     100   -100.0    100.0     0        0  rot
        8     2     M-MOTOR-SPD   1       0     3        0         2      125   0x46   -100.0    100.0    -100     100   -100.0    100.0     0        0  pct
        
       16     0     TOUCH         1       1     1        0         1      121   0x46   1000.0   2000.0       0     100      0.0      1.0     0      417  _
       16     1     BUMPS         1       2     5        0         1      121   0x46      0.0      1.0       0     100      0.0      1.0     0      417  cnt
        
       29     0     COL-REFLECT   1       0     3        0         3      122   0x2D      0.0    100.0       0     100      0.0    100.0    10        0  pct
       29     1     COL-AMBIENT   1       0     3        0         3      122   0x2D      0.0    100.0       0     100      0.0    100.0    10        0  pct
       29     2     COL-COLOR     1       0     2        0         3      122   0x2D      0.0      8.0       0     100      0.0      8.0    10        0  col
       29     3     REF-RAW       2       1     4        0         3      122   0x2D      0.0   1020.2       0     100      0.0   1020.2    10        0  _
       29     4     RGB-RAW       3       1     4        0         3      122   0x2D      0.0   1020.2       0     100      0.0   1020.2    10        0  _
       29     5     COL-CAL       4       1     5        0         3      122   0x2D      0.0  65535.0       0     100      0.0  65535.0    10        0  _
       
       30     0     US-DIST-CM    1       1     5        1         3      122   0x2D      0.0   2550.0       0     100      0.0    255.0    10        0  cm
       30     1     US-DIST-IN    1       1     5        1         3      122   0x2D      0.0   1000.0       0     100      0.0    100.0    10        0  inch
       30     2     US-LISTEN     1       0     1        0         3      122   0x2D      0.0      1.0       0     100      0.0      1.0    10        0  _
       30     3     US-SI-CM      1       1     5        1         3      122   0x2D      0.0   2550.0       0     100      0.0    255.0    10        0  cm
       30     4     US-SI-IN      1       1     5        1         3      122   0x2D      0.0   1000.0       0     100      0.0    100.0    10        0  inch
       30     5     US-DC-CM      1       1     5        1         3      122   0x2D      0.0   2550.0       0     100      0.0    255.0    10        0  cm
       30     6     US-DC-IN      1       1     5        1         3      122   0x2D      0.0   1000.0       0     100      0.0    100.0    10        0 inch
              
       32     0     GYRO-ANG      1       1     4        0         2      122   0x2D   -180.0    180.0       0     100   -180.0    180.0    10        0  deg
       32     1     GYRO-RATE     1       1     3        0         2      122   0x2D   -440.0    440.0       0     100   -440.0    440.0    10        0  d/s
       32     2     GYRO-FAS      1       1     4        0         2      122   0x2D  -2000.0   2000.0       0     100  -2000.0   2000.0    10        0  _
       32     3     GYRO-G&A      2       1     5        0         2      122   0x2D   -180.0    180.0       0     100   -180.0    180.0    10        0  _
       32     4     GYRO-CAL      4       1     5        0         2      122   0x2D      0.0  65535.0       0     100      0.0  65535.0    10        0  _
       
       33     0     IR-PROX       1       0     3        0         3      122   0x2D      0.0    100.0       0     100      0.0    100.0  1100        0  pct
       33     1     IR-SEEK       8       0     3        0         3      122   0x2D   -100.0    100.0       0     100   -100.0    100.0  1100        0  pct
       33     2     IR-REMOTE     4       0     3        0         3      122   0x2D      0.0     10.0       0     100      0.0     10.0  1100        0  btn
       33     3     IR-REM-A      1       1     6        0         3      122   0x2D      0.0  65535.0       0     100      0.0  65535.0  1100        0  _
       33     4     IR-S-ALT      4       0     3        0         3      122   0x2D      0.0    100.0       0     100      0.0    100.0  1100        0  pct
       33     5     IR-CAL        2       1     5        0         3      122   0x2D      0.0  65535.0       0     100      0.0  65535.0  1100        0  _       
	 */
	
	// sensor ports
	public static byte PORT_1 		         = (byte) 0x00;
	public static byte PORT_2 	        	 = (byte) 0x01;
	public static byte PORT_3         		 = (byte) 0x02;
	public static byte PORT_4 		         = (byte) 0x03;
	public static byte PORT_A 		         = (byte) 0x10;
	public static byte PORT_B 		         = (byte) 0x11;
	public static byte PORT_C 		         = (byte) 0x12;
	public static byte PORT_D 		         = (byte) 0x13;
	
	// sensor types/modes
	public static int TYPE_DONT_CHANGE      = 0;
	public static int MODE_DONT_CHANGE      = -1;
	
	public static int TYPE_LARGE_MOTOR 	    = 7;
	public static int LARGE_MOTOR_DEGREE    = 0;
	public static int LARGE_MOTOR_ROTATION  = 1;
	public static int LARGE_MOTOR_POWER     = 2;
	
	public static int TYPE_MEDIUM_MOTOR 	= 8;
	public static int MEDIUM_MOTOR_DEGREE   = 0;
	public static int MEDIUM_MOTOR_ROTATION = 1;
	public static int MEDIUM_MOTOR_POWER    = 2;
	
	public static int TYPE_TOUCH 	        = 8;
	public static int TOUCH_TOUCH           = 0;
	public static int TOUCH_BUMPS           = 1;
	
	public static int TYPE_COLOR 			= 29;
	public static int COLOR_REFLECTED       = 0;
	public static int COLOR_AMBIENT         = 1;
	public static int COLOR_COLOR           = 2;
	public static int COLOR_REFLECTED_RAW   = 3;
	public static int COLOR_RGB_RAW         = 4;
	public static int COLOR_CALIBRATION     = 5;
	
	public static int TYPE_ULTRASONIC 		= 30;
	public static int ULTRASONIC_CM         = 0;
	public static int ULTRASONIC_INCH       = 1;
	public static int ULTRASONIC_LISTEN     = 2;
	public static int ULTRASONIC_SI_CM      = 3;
	public static int ULTRASONIC_SI_INCH    = 4;
	public static int ULTRASONIC_DC_CM      = 5;
	public static int ULTRASONIC_DC_INCH    = 6;
	
	public static int TYPE_GYRO 			= 32;
	public static int GYRO_ANGLE            = 0;
	public static int GYRO_RATE             = 1;
	public static int GYRO_FAST             = 2;
	public static int GYRO_RATEANGLE        = 3;
	public static int GYRO_CALIBRATION      = 4;
	
	public static int TYPE_IR 				= 33;
	public static int IR_PROXIMITY          = 0;
	public static int IR_SEEKER             = 1;
	public static int IR_REMOTE             = 2;
	public static int IR_REMOTE_ADVANCED    = 3;
//	public static int IR_NOT_UTILIZED       = 4;
	public static int IR_CALIBRATION        = 5;
	

	private Brick brick;

	protected Sensor(Brick brick) {
		this.brick = brick;
	}

	public byte[] getTypeMode(byte port) {

		Command c = new Command(Code._DIRECT_COMMAND_REPLY, 2, 0);
		c.sensorGetTypeMode(port);
		byte[] typeMode = brick.sendCommand(c);

		return new byte[] { typeMode[5], typeMode[6] };

	}

	public int getValuePercent(byte port, int type, int mode) {

		Command c = new Command(Code._DIRECT_COMMAND_REPLY, 1, 0);
		c.sensorReadyPercent(port, type, mode);
		byte[] valuePercent = brick.sendCommand(c);

		return (int) valuePercent[5];

	}

	public int getValueRaw(byte port, int type, int mode) {

		Command c = new Command(Code._DIRECT_COMMAND_REPLY, 4, 0);
		c.sensorReadyRaw(port, type, mode);
		byte[] valueRaw = brick.sendCommand(c);

		ByteBuffer bb = ByteBuffer.wrap(new byte[] { valueRaw[5], valueRaw[6], valueRaw[7], valueRaw[8] });
		bb.order(ByteOrder.LITTLE_ENDIAN);

		return bb.getInt();

	}

	public float getValueSI(byte port, int type, int mode) {

		Command c = new Command(Code._DIRECT_COMMAND_REPLY, 4, 0);
		c.sensorReadySI(port, type, mode);
		byte[] valueSI = brick.sendCommand(c);

		ByteBuffer bb = ByteBuffer.wrap(new byte[] { valueSI[5], valueSI[6], valueSI[7], valueSI[8] });
		bb.order(ByteOrder.LITTLE_ENDIAN);

		return bb.getFloat();

	}

	public String getDeviceName(byte port, int responseLength) {

		Command c = new Command(Code._DIRECT_COMMAND_REPLY, responseLength, 0);
		c.sensorGetName(port, responseLength);
		byte[] sensorName = brick.sendCommand(c);

		ByteBuffer bb = ByteBuffer.wrap(sensorName);
		bb.order(ByteOrder.LITTLE_ENDIAN);
		String name = new String(bb.array()).substring(5);

		return name;

	}

	public String getDeviceModeName(byte port, int mode, int responseLength) {

		Command c = new Command(Code._DIRECT_COMMAND_REPLY, responseLength, 0);
		c.sensorGetModeName(port, mode, responseLength);
		byte[] sensorModeName = brick.sendCommand(c);

		ByteBuffer bb = ByteBuffer.wrap(sensorModeName);
		bb.order(ByteOrder.LITTLE_ENDIAN);
		String name = new String(bb.array()).substring(5);

		return name;

	}

	public byte[] getConnectionType(byte port) {

		Command c = new Command(Code._DIRECT_COMMAND_REPLY, 1, 0);
		c.sensorGetConnectionType(port);
		byte[] connectionType = brick.sendCommand(c);

		return new byte[] { connectionType[5] };

	}

	public void clearAll() {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY, 0, 0);
		c.sensorClearAll();
		brick.sendCommand(c);

	}

	public void clearChanges(byte port) {

		Command c = new Command(Code._DIRECT_COMMAND_NO_REPLY, 0, 0);
		c.sensorClearChanges(port);
		brick.sendCommand(c);

	}

}
