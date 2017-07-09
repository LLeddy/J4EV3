package com.j4ev3.core;

public class Code {
	
	public static int WIFI      = 1;
	public static int BLUETOOTH = 2;
	public static int USB       = 3;

	public static int STD       = 1;                    // reply if global_mem, wait for reply
	public static int ASYNC     = 2;                    // reply if global_mem, never wait for reply
	public static int SYNC      = 3;                    // always with reply, always wait for reply

	//used for master/slave operation with other bricks. not necessary.
	public static byte LAYER						 = (byte) 0x00;
	
	public static byte _ID_VENDOR_LEGO				 = (byte) 0x0694; // Usb-Identification of the device
	public static byte _ID_PRODUCT_EV3				 = (byte) 0x0005;

	public static byte _EP_IN 						 = (byte) 0x81; // Usb-Endpoints
	public static byte _EP_OUT						 = (byte) 0x01;

	public static byte _DIRECT_COMMAND_REPLY    	 = (byte) 0x00;
	public static byte _DIRECT_COMMAND_NO_REPLY  	 = (byte) 0x80;

	public static byte _DIRECT_REPLY          	     = (byte) 0x02;
	public static byte _DIRECT_REPLY_ERROR	         = (byte) 0x04;

	public static byte _SYSTEM_COMMAND_REPLY		 = (byte) 0x01;
	public static byte _SYSTEM_COMMAND_NO_REPLY		 = (byte) 0x81;

	public static byte _SYSTEM_REPLY				 = (byte) 0x03;
	public static byte _SYSTEM_REPLY_ERROR			 = (byte) 0x05;

	// return codes of system commands
	public static byte SYSTEM_REPLY_OK				 = (byte) 0x00;
	public static byte SYSTEM_UNKNOWN_HANDLE		 = (byte) 0x01;
	public static byte SYSTEM_HANDLE_NOT_READY		 = (byte) 0x02;
	public static byte SYSTEM_CORRUPT_FILE			 = (byte) 0x03;
	public static byte SYSTEM_NO_HANDLES_AVAILABLE	 = (byte) 0x04;
	public static byte SYSTEM_NO_PERMISSION			 = (byte) 0x05;
	public static byte SYSTEM_ILLEGAL_PATH			 = (byte) 0x06;
	public static byte SYSTEM_FILE_EXITS			 = (byte) 0x07;
	public static byte SYSTEM_END_OF_FILE			 = (byte) 0x08;
	public static byte SYSTEM_SIZE_ERROR			 = (byte) 0x09;
	public static byte SYSTEM_UNKNOWN_ERROR			 = (byte) 0x0A;
	public static byte SYSTEM_ILLEGAL_FILENAME		 = (byte) 0x0B;
	public static byte SYSTEM_ILLEGAL_CONNECTION	 = (byte) 0x0C;

	// system commands
	public static byte BEGIN_DOWNLOAD 				 = (byte) 0x92;
	public static byte CONTINUE_DOWNLOAD			 = (byte) 0x93;
	public static byte BEGIN_UPLOAD				  	 = (byte) 0x94;
	public static byte CONTINUE_UPLOAD				 = (byte) 0x95;
	public static byte BEGIN_GETFILE 				 = (byte) 0x96;
	public static byte CONTINUE_GETFILE				 = (byte) 0x97;
	public static byte CLOSE_FILEHANDLE 			 = (byte) 0x98;
	public static byte LIST_FILES 					 = (byte) 0x99;
	public static byte CONTINUE_LIST_FILES			 = (byte) 0x9A;
	public static byte CREATE_DIR					 = (byte) 0x9B;
	public static byte DELETE_FILE					 = (byte) 0x9C;
	public static byte LIST_OPEN_HANDLES			 = (byte) 0x9D;
	public static byte WRITEMAILBOX					 = (byte) 0x9E;
	public static byte BLUETOOTHPIN					 = (byte) 0x9F;
	public static byte ENTERFWUPDATE				 = (byte) 0xA0;

	// operations of direct commands
	public static byte opError        		         = (byte) 0x00;   // VM
	public static byte opNop                    	 = (byte) 0x01;
	public static byte opProgram_Stop           	 = (byte) 0x02;
	public static byte opProgram_Start          	 = (byte) 0x03;
	public static byte opObject_Stop            	 = (byte) 0x04;
	public static byte opObject_Start           	 = (byte) 0x05;
	public static byte opObject_Trig            	 = (byte) 0x06;
	public static byte opObject_Wait            	 = (byte) 0x07;
	public static byte opObject_Return          	 = (byte) 0x08;
	public static byte opObject_Call            	 = (byte) 0x09;
	public static byte opObject_End             	 = (byte) 0x0A;
	public static byte opSleep                  	 = (byte) 0x0B;
	public static byte opProgram_Info           	 = (byte) 0x0C;
	// PROGRAM_INFO SUBCODES
	public static byte OBJ_STOP                 	 = (byte) 0x00;
	public static byte OBJ_START                	 = (byte) 0x04;
	public static byte GET_STATUS               	 = (byte) 0x16;
	public static byte GET_SPEED                	 = (byte) 0x17;
	public static byte GET_PRGRESULT            	 = (byte) 0x18;
	public static byte SET_INSTR                	 = (byte) 0x19;

	public static byte opLabel                  	 = (byte) 0x0D;
	public static byte opProbe                  	 = (byte) 0x0E;
	public static byte opDo                     	 = (byte) 0x0F;
	public static byte opAdd8                   	 = (byte) 0x10;   // MATH
	public static byte opAdd16                  	 = (byte) 0x11;
	public static byte opAdd32                  	 = (byte) 0x12;
	public static byte opAddf                   	 = (byte) 0x13;
	public static byte opSub8                   	 = (byte) 0x14;
	public static byte opSub16                  	 = (byte) 0x15;
	public static byte opSub32                  	 = (byte) 0x16;
	public static byte opSubf                   	 = (byte) 0x17;
	public static byte opMul8                   	 = (byte) 0x18;
	public static byte opMul16                  	 = (byte) 0x19;
	public static byte opMul32                  	 = (byte) 0x1A;
	public static byte opMulf                   	 = (byte) 0x1B;
	public static byte opDiv8                   	 = (byte) 0x1C;
	public static byte opDiv16                  	 = (byte) 0x1D;
	public static byte opDiv32                  	 = (byte) 0x1E;
	public static byte opDivf                   	 = (byte) 0x1F;
	public static byte opOr8                    	 = (byte) 0x20;   // LOGIC
	public static byte opOr16                   	 = (byte) 0x21;
	public static byte opOr32                   	 = (byte) 0x22;
	public static byte opAnd8                   	 = (byte) 0x24;
	public static byte opAnd16                  	 = (byte) 0x25;
	public static byte opAnd32                  	 = (byte) 0x26;
	public static byte opXor8                   	 = (byte) 0x28;
	public static byte opXor16                  	 = (byte) 0x29;
	public static byte opXor32                  	 = (byte) 0x2A;
	public static byte opRl8                    	 = (byte) 0x2C;
	public static byte opRl16                   	 = (byte) 0x2D;
	public static byte opRl32                   	 = (byte) 0x2E;
	public static byte opInit_Bytes             	 = (byte) 0x2F;   // MOVE
	public static byte opMove8_8                	 = (byte) 0x30;
	public static byte opMove8_16               	 = (byte) 0x31;
	public static byte opMove8_32               	 = (byte) 0x32;
	public static byte opMove8_F                	 = (byte) 0x33;
	public static byte opMove16_8               	 = (byte) 0x34;
	public static byte opMove16_16              	 = (byte) 0x35;
	public static byte opMove16_32              	 = (byte) 0x36;
	public static byte opMove16_F               	 = (byte) 0x37;
	public static byte opMove32_8               	 = (byte) 0x38;
	public static byte opMove32_16              	 = (byte) 0x39;
	public static byte opMove32_32              	 = (byte) 0x3A;
	public static byte opMove32_F               	 = (byte) 0x3B;
	public static byte opMovef_8                	 = (byte) 0x3C;
	public static byte opMovef_16               	 = (byte) 0x3D;
	public static byte opMovef_32               	 = (byte) 0x3E;
	public static byte opMovef_F                	 = (byte) 0x3F;
	public static byte opJr                     	 = (byte) 0x40;   // BRANCH
	public static byte opJr_False               	 = (byte) 0x41;
	public static byte opJr_True                	 = (byte) 0x42;
	public static byte opJr_Nan                 	 = (byte) 0x43;
	public static byte opCp_Lt8                 	 = (byte) 0x44;   // COMPARE
	public static byte opCp_Lt16                	 = (byte) 0x45;
	public static byte opCp_Lt32                	 = (byte) 0x46;
	public static byte opCp_Ltf                 	 = (byte) 0x47;
	public static byte opCp_Gt8                 	 = (byte) 0x48;
	public static byte opCp_Gt16                	 = (byte) 0x49;
	public static byte opCp_Gt32                	 = (byte) 0x4A;
	public static byte opCp_Gtf                 	 = (byte) 0x4B;
	public static byte opCp_Eq8                 	 = (byte) 0x4C;
	public static byte opCp_Eq16                	 = (byte) 0x4D;
	public static byte opCp_Eq32                	 = (byte) 0x4E;
	public static byte opCp_Eqf                 	 = (byte) 0x4F;
	public static byte opCp_Ne8                 	 = (byte) 0x50;
	public static byte opCp_Ne16                	 = (byte) 0x51;
	public static byte opCp_Ne32                	 = (byte) 0x52;
	public static byte opCp_Nef                 	 = (byte) 0x53;
	public static byte opCp_Lte8                	 = (byte) 0x54;
	public static byte opCp_Lte16               	 = (byte) 0x55;
	public static byte opCp_Lte32               	 = (byte) 0x56;
	public static byte opCp_Ltef                	 = (byte) 0x57;
	public static byte opCp_Gte8                	 = (byte) 0x58;
	public static byte opCp_Gte16               	 = (byte) 0x59;
	public static byte opCp_Gte32               	 = (byte) 0x5A;
	public static byte opCp_Gtef                	 = (byte) 0x5B;
	public static byte opSelect8                	 = (byte) 0x5C;   // SELECT
	public static byte opSelect16               	 = (byte) 0x5D;
	public static byte opSelect32               	 = (byte) 0x5E;
	public static byte opSelectf                	 = (byte) 0x5F;
	public static byte opSystem                 	 = (byte) 0x60;   // VM
	public static byte opPort_Cnv_Output        	 = (byte) 0x61;
	public static byte opPort_Cnv_Input         	 = (byte) 0x62;
	public static byte opNote_To_Freq           	 = (byte) 0x63;
	public static byte opJr_Lt8                 	 = (byte) 0x64;   // BRANCH
	public static byte opJr_Lt16                	 = (byte) 0x65;
	public static byte opJr_Lt32                	 = (byte) 0x66;
	public static byte opJr_Ltf                 	 = (byte) 0x67;
	public static byte opJr_Gt8                 	 = (byte) 0x68;
	public static byte opJr_Gt16                	 = (byte) 0x69;
	public static byte opJr_Gt32                	 = (byte) 0x6A;
	public static byte opJr_Gtf                 	 = (byte) 0x6B;
	public static byte opJr_Eq8                 	 = (byte) 0x6C;
	public static byte opJr_Eq16                	 = (byte) 0x6D;
	public static byte opJr_Eq32                	 = (byte) 0x6E;
	public static byte opJr_Eqf                 	 = (byte) 0x6F;
	public static byte opJr_Neq8                	 = (byte) 0x70;
	public static byte opJr_Neq16               	 = (byte) 0x71;
	public static byte opJr_Neq32               	 = (byte) 0x72;
	public static byte opJr_Neqf                	 = (byte) 0x73;
	public static byte opJr_Lteq8               	 = (byte) 0x74;
	public static byte opJr_Lteq16              	 = (byte) 0x75;
	public static byte opJr_Lteq32              	 = (byte) 0x76;
	public static byte opJr_Lteqf               	 = (byte) 0x77;
	public static byte opJr_Gteq8               	 = (byte) 0x78;
	public static byte opJr_Gteq16              	 = (byte) 0x79;
	public static byte opJr_Gteq32              	 = (byte) 0x7A;
	public static byte opJr_Gteqf               	 = (byte) 0x7B;
	public static byte opInfo                   	 = (byte) 0x7C;   // VM
	// INFO_SUBCODE
	public static byte SET_ERROR                     = (byte) 0x01;
	public static byte GET_ERROR                     = (byte) 0x02;
	public static byte ERRORTEXT                     = (byte) 0x03;
	public static byte GET_VOLUME                    = (byte) 0x04;
	public static byte SET_VOLUME                    = (byte) 0x05;
	public static byte GET_MINUTES                   = (byte) 0x06;
	public static byte SET_MINUTES                   = (byte) 0x07;

	public static byte opStrings                     = (byte) 0x7D;
	// STRINGS_SUBCODE
	public static byte GET_SIZE                      = (byte) 0x01;
	public static byte ADD                           = (byte) 0x02;
	public static byte COMPARE                       = (byte) 0x03;
	public static byte DUPLICATE                     = (byte) 0x05;
	public static byte VALUE_TO_STRING               = (byte) 0x06;
	public static byte STRING_TO_VALUE               = (byte) 0x07;
	public static byte STRIP                         = (byte) 0x08;
	public static byte NUMBER_TO_STRING              = (byte) 0x09;
	public static byte SUB                           = (byte) 0x0A;
	public static byte VALUE_FORMATTED               = (byte) 0x0B;
	public static byte NUMBER_FORMATTED              = (byte) 0x0C;

	public static byte opMemory_Write                = (byte) 0x7E;
	public static byte opMemory_Read                 = (byte) 0x7F;
	public static byte opUI_Flush                    = (byte) 0x80;   // UI
	public static byte opUI_Read                     = (byte) 0x81;
	// UI_READ_SUBCODES
	public static byte GET_VBATT                     = (byte) 0x01;
	public static byte GET_IBATT                     = (byte) 0x02;
	public static byte GET_OS_VERS                   = (byte) 0x03;
	public static byte GET_EVENT                     = (byte) 0x04;
	public static byte GET_TBATT                     = (byte) 0x05;
	public static byte GET_IINT                      = (byte) 0x06;
	public static byte GET_IMOTOR                    = (byte) 0x07;
	public static byte GET_STRING                    = (byte) 0x08;
	public static byte GET_HW_VERS                   = (byte) 0x09;
	public static byte GET_FW_VERS                   = (byte) 0x0A;
	public static byte GET_FW_BUILD                  = (byte) 0x0B;
	public static byte GET_OS_BUILD                  = (byte) 0x0C;
	public static byte GET_ADDRESS                   = (byte) 0x0D;
	public static byte GET_CODE                      = (byte) 0x0E;
	public static byte KEY                           = (byte) 0x0F;
	public static byte GET_SHUTDOWN                  = (byte) 0x10;
	public static byte GET_WARNING                   = (byte) 0x11;
	public static byte GET_LBATT                     = (byte) 0x12;
	public static byte TEXTBOX_READ                  = (byte) 0x15;
	public static byte GET_VERSION                   = (byte) 0x1A;
	public static byte GET_IP                        = (byte) 0x1B;
	public static byte GET_POWER                     = (byte) 0x1D;
	public static byte GET_SDCARD                    = (byte) 0x1E;
	public static byte GET_USBSTICK                  = (byte) 0x1F;

	public static byte opUI_Write                    = (byte) 0x82;
	// UI_WRITE_SUBCODES
	public static byte WRITE_FLUSH                   = (byte) 0x01;
	public static byte FLOATVALUE                    = (byte) 0x02;
	public static byte STAMP                         = (byte) 0x03;
	public static byte PUT_STRING                    = (byte) 0x08;
	public static byte VALUE8                        = (byte) 0x09;
	public static byte VALUE16                       = (byte) 0x0A;
	public static byte VALUE32                       = (byte) 0x0B;
	public static byte VALUEF                        = (byte) 0x0C;
	public static byte ADDRESS                       = (byte) 0x0D;
	public static byte CODE                          = (byte) 0x0E;
	public static byte DOWNLOAD_END                  = (byte) 0x0F;
	public static byte SCREEN_BLOCK                  = (byte) 0x10;
	public static byte TEXTBOX_APPEND                = (byte) 0x15;
	public static byte SET_BUSY                      = (byte) 0x16;
	public static byte SET_TESTPIN                   = (byte) 0x17;
	public static byte INIT_RUN                      = (byte) 0x18;
	public static byte UPDATE_RUN                    = (byte) 0x1A;
	public static byte LED                           = (byte) 0x1B;
	public static byte POWER                         = (byte) 0x1D;
	public static byte GRAPH_SAMPLE                  = (byte) 0x1E;
	public static byte TERMINAL                      = (byte) 0x1F;

	public static byte opUI_Button                   = (byte) 0x83;
	// UI_BUTTON_SUBCODES
	public static byte SHORTPRESS                    = (byte) 0x01;
	public static byte LONGPRESS                     = (byte) 0x02;
	public static byte WAIT_FOR_PRESS                = (byte) 0x03;
	public static byte FLUSH                         = (byte) 0x04;
	public static byte PRESS                         = (byte) 0x05;
	public static byte RELEASE                       = (byte) 0x06;
	public static byte GET_HORZ                      = (byte) 0x07;
	public static byte GET_VERT                      = (byte) 0x08;
	public static byte PRESSED                       = (byte) 0x09;
	public static byte SET_BACK_BLOCK                = (byte) 0x0A;
	public static byte GET_BACK_BLOCK                = (byte) 0x0B;
	public static byte TESTSHORTPRESS                = (byte) 0x0C;
	public static byte TESTLONGPRESS                 = (byte) 0x0D;
	public static byte GET_BUMBED                    = (byte) 0x0E;
	public static byte GET_CLICK                     = (byte) 0x0F;

	public static byte opUI_Draw                     = (byte) 0x84;
	// UI_DRAW_SUBCODES
	public static byte UPDATE                        = (byte) 0x00;
	public static byte CLEAN                         = (byte) 0x01;
	public static byte PIXEL                         = (byte) 0x02;
	public static byte LINE                          = (byte) 0x03;
	public static byte CIRCLE                        = (byte) 0x04;
	public static byte TEXT                          = (byte) 0x05;
	public static byte ICON                          = (byte) 0x06;
	public static byte PICTURE                       = (byte) 0x07;
	public static byte VALUE                         = (byte) 0x08;
	public static byte FILLRECT                      = (byte) 0x09;
	public static byte RECT                          = (byte) 0x0A;
	public static byte NOTIFICATION                  = (byte) 0x0B;
	public static byte QUESTION                      = (byte) 0x0C;
	public static byte KEYBOARD                      = (byte) 0x0D;
	public static byte BROWSE                        = (byte) 0x0E;
	public static byte VERTBAR                       = (byte) 0x0F;
	public static byte INVERSERECT                   = (byte) 0x10;
	public static byte SELECT_FONT                   = (byte) 0x11;
	public static byte TOPLINE                       = (byte) 0x12;
	public static byte FILLWINDOW                    = (byte) 0x13;
	public static byte SCROLL                        = (byte) 0x14;
	public static byte DOTLINE                       = (byte) 0x15;
	public static byte VIEW_VALUE                    = (byte) 0x16;
	public static byte VIEW_UNIT                     = (byte) 0x17;
	public static byte FILLCIRCLE                    = (byte) 0x18;
	public static byte STORE                         = (byte) 0x19;
	public static byte RESTORE                       = (byte) 0x1A;
	public static byte ICON_QUESTION                 = (byte) 0x1B;
	public static byte BMPFILE                       = (byte) 0x1C;
	public static byte POPUP                         = (byte) 0x1D;
	public static byte GRAPH_SETUP                   = (byte) 0x1E;
	public static byte GRAPH_DRAW                    = (byte) 0x1F;
	public static byte TEXTBOX                       = (byte) 0x20;

	public static byte opTimer_Wait                  = (byte) 0x85;   // TIMER
	public static byte opTimer_Ready                 = (byte) 0x86;
	public static byte opTimer_Read                  = (byte) 0x87;
	public static byte opBp0                         = (byte) 0x88;   // VM
	public static byte opBp1                         = (byte) 0x89;
	public static byte opBp2                         = (byte) 0x8A;
	public static byte opBp3                         = (byte) 0x8B;
	public static byte opBp_Set                      = (byte) 0x8C;
	public static byte opMath                        = (byte) 0x8D;
	public static byte opRandom                      = (byte) 0x8E;
	public static byte opTimer_Read_Us               = (byte) 0x8F;   // TIMER
	public static byte opKeep_Alive                  = (byte) 0x90;   // UI
	public static byte opCom_Read                    = (byte) 0x91;   // COM
	// COM_READ_SUBCODES
	public static byte COMMAND                       = (byte) 0x0E;

	public static byte opCom_Write                   = (byte) 0x92;
	// COM_WRITE_SUBCODES
	public static byte REPLY                         = (byte) 0x0E;

	public static byte opSound                       = (byte) 0x94;   // SOUND
	// SOUND_SUBCODES
	public static byte BREAK                         = (byte) 0x00;
	public static byte TONE                          = (byte) 0x01;
	public static byte PLAY                          = (byte) 0x02;
	public static byte REPEAT                        = (byte) 0x03;
	public static byte SERVICE                       = (byte) 0x04;

	public static byte opSound_Test                  = (byte) 0x95;
	public static byte opSound_Ready                 = (byte) 0x96;
	public static byte opInput_Sample                = (byte) 0x97;
	public static byte opInput_Device_List           = (byte) 0x98;
	public static byte opInput_Device                = (byte) 0x99;
	// INPUT_DEVICE_SUBCODES
	public static byte GET_FORMAT                    = (byte) 0x02;
	public static byte CAL_MINMAX                    = (byte) 0x03;
	public static byte CAL_DEFAULT                   = (byte) 0x04;
	public static byte GET_TYPEMODE                  = (byte) 0x05;
	public static byte GET_SYMBOL                    = (byte) 0x06;
	public static byte CAL_MIN                       = (byte) 0x07;
	public static byte CAL_MAX                       = (byte) 0x08;
	public static byte SETUP                         = (byte) 0x09;
	public static byte CLR_ALL                       = (byte) 0x0A;
	public static byte GET_RAW                       = (byte) 0x0B;
	public static byte GET_CONNECTION                = (byte) 0x0C;
	public static byte STOP_ALL                      = (byte) 0x0D;
	public static byte GET_NAME                      = (byte) 0x15;
	public static byte GET_MODENAME                  = (byte) 0x16;
	public static byte SET_RAW                       = (byte) 0x17;
	public static byte GET_FIGURES                   = (byte) 0x18;
	public static byte GET_CHANGES                   = (byte) 0x19;
	public static byte CLR_CHANGES                   = (byte) 0x1A;
	public static byte READY_PCT                     = (byte) 0x1B;
	public static byte READY_RAW                     = (byte) 0x1C;
	public static byte READY_SI                      = (byte) 0x1D;
	public static byte GET_MINMAX                    = (byte) 0x1E;
	public static byte GET_BUMPS                     = (byte) 0x1F;

	public static byte opInput_Read                  = (byte) 0x9A;
	public static byte opInput_Test                  = (byte) 0x9B;
	public static byte opInput_Ready                 = (byte) 0x9C;
	public static byte opInput_ReadSI                = (byte) 0x9D;
	public static byte opInput_ReadExt               = (byte) 0x9E;
	public static byte opInput_Write                 = (byte) 0x9F;
	public static byte opOutput_Get_Type             = (byte) 0xA0;   // OUTPUT
	public static byte opOutput_Set_Type             = (byte) 0xA1;
	public static byte opOutput_Reset                = (byte) 0xA2;
	public static byte opOutput_Stop                 = (byte) 0xA3;
	public static byte opOutput_Power                = (byte) 0xA4;
	public static byte opOutput_Speed                = (byte) 0xA5;
	public static byte opOutput_Start                = (byte) 0xA6;
	public static byte opOutput_Polarity             = (byte) 0xA7;
	public static byte opOutput_Read                 = (byte) 0xA8;
	public static byte opOutput_Test                 = (byte) 0xA9;
	public static byte opOutput_Ready                = (byte) 0xAA;
	public static byte opOutput_Position             = (byte) 0xAB;
	public static byte opOutput_Step_Power           = (byte) 0xAC;
	public static byte opOutput_Time_Power           = (byte) 0xAD;
	public static byte opOutput_Step_Speed           = (byte) 0xAE;
	public static byte opOutput_Time_Speed           = (byte) 0xAF;
	public static byte opOutput_Step_Sync            = (byte) 0xB0;
	public static byte opOutput_Time_Sync            = (byte) 0xB1;
	public static byte opOutput_Clr_Count            = (byte) 0xB2;
	public static byte opOutput_Get_Count            = (byte) 0xB3;
	public static byte opOutput_Prg_Stop             = (byte) 0xB4;

	public static byte opFile                        = (byte) 0xC0;
	// FILE_SUBCODES
	public static byte OPEN_APPEND                   = (byte) 0x00;
	public static byte OPEN_READ                     = (byte) 0x01;
	public static byte OPEN_WRITE                    = (byte) 0x02;
	public static byte READ_VALUE                    = (byte) 0x03;
	public static byte WRITE_VALUE                   = (byte) 0x04;
	public static byte READ_TEXT                     = (byte) 0x05;
	public static byte WRITE_TEXT                    = (byte) 0x06;
	public static byte CLOSE                         = (byte) 0x07;
	public static byte LOAD_IMAGE                    = (byte) 0x08;
	public static byte GET_HANDLE                    = (byte) 0x09;
	public static byte MAKE_FOLDER                   = (byte) 0x0A;
	public static byte GET_POOL                      = (byte) 0x0B;
	public static byte SET_LOG_SYNC_TIME             = (byte) 0x0C;
	public static byte GET_FOLDERS                   = (byte) 0x0D;
	public static byte GET_LOG_SYNC_TIME             = (byte) 0x0E;
	public static byte GET_SUBFOLDER_NAME            = (byte) 0x0F;
	public static byte WRITE_LOG                     = (byte) 0x10;
	public static byte CLOSE_LOG                     = (byte) 0x11;
	public static byte GET_IMAGE                     = (byte) 0x12;
	public static byte GET_ITEM                      = (byte) 0x13;
	public static byte GET_CACHE_FILES               = (byte) 0x14;
	public static byte PUT_CACHE_FILE                = (byte) 0x15;
	public static byte GET_CACHE_FILE                = (byte) 0x16;
	public static byte DEL_CACHE_FILE                = (byte) 0x17;
	public static byte DEL_SUBFOLDER                 = (byte) 0x18;
	public static byte GET_LOG_NAME                  = (byte) 0x19;
	public static byte opEN_LOG                      = (byte) 0x1B;
	public static byte READ_BYTES                    = (byte) 0x1C;
	public static byte WRITE_BYTES                   = (byte) 0x1D;
	public static byte REMOVE                        = (byte) 0x1E;
	public static byte MOVE                          = (byte) 0x1F;

	public static byte opArray                       = (byte) 0xC1;
	// ARRAY_SUBCODES
	public static byte DELETE                        = (byte) 0x00;
	public static byte CREATE8                       = (byte) 0x01;
	public static byte CREATE16                      = (byte) 0x02;
	public static byte CREATE32                      = (byte) 0x03;
	public static byte CREATEF                       = (byte) 0x04;
	public static byte RESIZE                        = (byte) 0x05;
	public static byte FILL                          = (byte) 0x06;
	public static byte COPY                          = (byte) 0x07;
	public static byte INIT8                         = (byte) 0x08;
	public static byte INIT16                        = (byte) 0x09;
	public static byte INIT32                        = (byte) 0x0A;
	public static byte INITF                         = (byte) 0x0B;
	public static byte SIZE                          = (byte) 0x0C;
	public static byte READ_CONTENT                  = (byte) 0x0D;
	public static byte WRITE_CONTENT                 = (byte) 0x0E;
	public static byte READ_SIZE                     = (byte) 0x0F;

	public static byte opArray_Write                 = (byte) 0xC2;
	public static byte opArray_Read                  = (byte) 0xC3;
	public static byte opArray_Append                = (byte) 0xC4;
	public static byte opMemory_Usage                = (byte) 0xC5;
	public static byte opFilename                    = (byte) 0xC6;
	// FILENAME_SUBCODE
	public static byte EXIST                         = (byte) 0x10;
	public static byte TOTALSIZE                     = (byte) 0x11;
	public static byte SPLIT                         = (byte) 0x12;
	public static byte MERGE                         = (byte) 0x13;
	public static byte CHECK                         = (byte) 0x14;
	public static byte PACK                          = (byte) 0x15;
	public static byte UNPACK                        = (byte) 0x16;
	public static byte GET_FOLDERNAME                = (byte) 0x17;

	public static byte opRead8                       = (byte) 0xC8;
	public static byte opRead16                      = (byte) 0xC9;
	public static byte opRead32                      = (byte) 0xCA;
	public static byte opReadf                       = (byte) 0xCB;
	public static byte opWrite8                      = (byte) 0xCC;
	public static byte opWrite16                     = (byte) 0xCD;
	public static byte opWrite32                     = (byte) 0xCE;
	public static byte opWritef                      = (byte) 0xCF;
	public static byte opCom_Ready                   = (byte) 0xD0;
	public static byte opCom_Readdata                = (byte) 0xD1;
	public static byte opCom_Writedata               = (byte) 0xD2;
	public static byte opCom_Get                     = (byte) 0xD3;
	// COM_GET_SUBCODES
	public static byte GET_ON_OFF                    = (byte) 0x01;
	public static byte GET_VISIBLE                   = (byte) 0x02;
	public static byte GET_RESULT                    = (byte) 0x04;
	public static byte GET_PIN                       = (byte) 0x05;
	public static byte SEARCH_ITEMS                  = (byte) 0x08;
	public static byte SEARCH_ITEM                   = (byte) 0x09;
	public static byte FAVOUR_ITEMS                  = (byte) 0x0A;
	public static byte FAVOUR_ITEM                   = (byte) 0x0B;
	public static byte GET_ID                        = (byte) 0x0C;
	public static byte GET_BRICKNAME                 = (byte) 0x0D;
	public static byte GET_NETWORK                   = (byte) 0x0E;
	public static byte GET_PRESENT                   = (byte) 0x0F;
	public static byte GET_ENCRYPT                   = (byte) 0x10;
	public static byte CONNEC_ITEMS                  = (byte) 0x11;
	public static byte CONNEC_ITEM                   = (byte) 0x12;
	public static byte GET_INCOMING                  = (byte) 0x13;
	public static byte GET_MODE2                     = (byte) 0x14;

	public static byte opCom_Set                     = (byte) 0xD4;
	// COM_SET_SUBCODES
	public static byte SET_ON_OFF                    = (byte) 0x01;
	public static byte SET_VISIBLE                   = (byte) 0x02;
	public static byte SET_SEARCH                    = (byte) 0x03;
	public static byte SET_PIN                       = (byte) 0x05;
	public static byte SET_PASSKEY                   = (byte) 0x06;
	public static byte SET_CONNECTION                = (byte) 0x07;
	public static byte SET_BRICKNAME                 = (byte) 0x08;
	public static byte SET_MOVEUP                    = (byte) 0x09;
	public static byte SET_MOVEDOWN                  = (byte) 0x0A;
	public static byte SET_ENCRYPT                   = (byte) 0x0B;
	public static byte SET_SSID                      = (byte) 0x0C;
	public static byte SET_MODE2                     = (byte) 0x0D;

	public static byte opCom_Test                    = (byte) 0xD5;
	public static byte opCom_Remove                  = (byte) 0xD6;
	public static byte opCom_Writefile               = (byte) 0xD7;
	public static byte opMailbox_Open                = (byte) 0xD8;
	public static byte opMailbox_Write               = (byte) 0xD9;
	public static byte opMailbox_Read                = (byte) 0xDA;
	public static byte opMailbox_Test                = (byte) 0xDB;
	public static byte opMailbox_Ready               = (byte) 0xDC;
	public static byte opMailbox_Close               = (byte) 0xDD;
	public static byte opTst                         = (byte) 0xDD;
	// TST_SUBCODES
	public static byte TST_OPEN                      = (byte) 0x0A;
	public static byte TST_CLOSE                     = (byte) 0x0B;
	public static byte TST_READ_PINS                 = (byte) 0x0C;
	public static byte TST_WRITE_PINS                = (byte) 0x0D;
	public static byte TST_READ_ADC                  = (byte) 0x0E;
	public static byte TST_WRITE_UART                = (byte) 0x0F;
	public static byte TST_READ_UART                 = (byte) 0x10;
	public static byte TST_ENABLE_UART               = (byte) 0x11;
	public static byte TST_DISABLE_UART              = (byte) 0x12;
	public static byte TST_ACCU_SWITCH               = (byte) 0x13;
	public static byte TST_BOOT_MODE2                = (byte) 0x14;
	public static byte TST_POLL_MODE2                = (byte) 0x15;
	public static byte TST_CLOSE_MODE2               = (byte) 0x16;
	public static byte TST_RAM_CHECK                 = (byte) 0x17;

	// Slots
	public static byte CURRENT_SLOT                  = (byte) 0x21;
	public static byte GUI_SLOT                      = (byte) 0x00;
	public static byte USER_SLOT                     = (byte) 0x01;
	public static byte CMD_SLOT                      = (byte) 0x02;
	public static byte TERM_SLOT                     = (byte) 0x03;
	public static byte DEBUG_SLOT                    = (byte) 0x04;
	
//  values moved to respective classes
//	// sensor ports
//	public static byte SENSOR_PORT_1                 = (byte) 0x00;
//	public static byte SENSOR_PORT_2                 = (byte) 0x01;
//	public static byte SENSOR_PORT_3                 = (byte) 0x02;
//	public static byte SENSOR_PORT_4                 = (byte) 0x03;
//	public static byte SENSOR_PORT_A            	 = (byte) 0x10;
//	public static byte SENSOR_PORT_B            	 = (byte) 0x11;
//	public static byte SENSOR_PORT_C            	 = (byte) 0x12;
//	public static byte SENSOR_PORT_D            	 = (byte) 0x13;

//	// motor ports
//	public static byte MOTOR_PORT_A                  = (byte) 0x01;
//	public static byte MOTOR_PORT_B                  = (byte) 0x02;
//	public static byte MOTOR_PORT_C                  = (byte) 0x04;
//	public static byte MOTOR_PORT_D                  = (byte) 0x08;
//	public static byte MOTOR_PORT_ALL                = (byte) 0x0F;

//	// BUTTONTYPES
//	public static byte NO_BUTTON                     = (byte) 0x00;
//	public static byte UP_BUTTON                     = (byte) 0x01;
//	public static byte ENTER_BUTTON                  = (byte) 0x02;
//	public static byte DOWN_BUTTON                   = (byte) 0x03;
//	public static byte RIGHT_BUTTON                  = (byte) 0x04;
//	public static byte LEFT_BUTTON                   = (byte) 0x05;
//	public static byte BACK_BUTTON                   = (byte) 0x06;
//	public static byte ANY_BUTTON                    = (byte) 0x07;
//	public static byte BUTTONTYPES                   = (byte) 0x08;

	// MATHTYPES
	public static byte EXP                           = (byte) 0x01; //!< e^x r = expf(x)
	public static byte MOD                           = (byte) 0x02; //!< Modulo r = fmod(x'y)
	public static byte FLOOR                         = (byte) 0x03; //!< Floor r = floor(x)
	public static byte CEIL                          = (byte) 0x04; //!< Ceiling r = ceil(x)
	public static byte ROUND                         = (byte) 0x05; //!< Round r = round(x)
	public static byte ABS                           = (byte) 0x06; //!< Absolute r = fabs(x)
	public static byte NEGATE                        = (byte) 0x07; //!< Negate r = 0.0 - 0x
	public static byte SQRT                          = (byte) 0x08; //!< Squareroot r = sqrt(x)
	public static byte LOG                           = (byte) 0x09; //!< Log r = log10(x)
	public static byte LN                            = (byte) 0x0A; //!< Ln r = log(x)
	public static byte SIN                           = (byte) 0x0B; //!<
	public static byte COS                           = (byte) 0x0C; //!<
	public static byte TAN                           = (byte) 0x0D; //!<
	public static byte ASIN                          = (byte) 0x0E; //!<
	public static byte ACOS                          = (byte) 0x0F; //!<
	public static byte ATAN                          = (byte) 0x10; //!<
	public static byte MOD8                          = (byte) 0x11; //!< Modulo DATA8 r = 0x % y
	public static byte MOD16                         = (byte) 0x12; //!< Modulo DATA16 r = 0x % y
	public static byte MOD32                         = (byte) 0x13; //!< Modulo DATA32 r = 0x % y
	public static byte POW                           = (byte) 0x14; //!< Exponent r = powf(x,y)
	public static byte TRUNC                         = (byte) 0x15; // !< Truncate r = (float)((int)(x * pow(y))) / pow(y)

	// BROWSERTYPES
	public static byte BROWSE_FOLDERS                = (byte) 0x00; // folders
	public static byte BROWSE_FOLDS_FILES            = (byte) 0x01; // folders and files
	public static byte BROWSE_CACHE                  = (byte) 0x02; // cached / recent files
	public static byte BROWSE_FILES                  = (byte) 0x03; // files

	// FONTTYPES
	public static byte NORMAL_FONT                   = (byte) 0x00;
	public static byte SMALL_FONT                    = (byte) 0x01;
	public static byte LARGE_FONT                    = (byte) 0x02;
	public static byte TINY_FONT                     = (byte) 0x03;

	// ICONTYPES
	public static byte NORMAL_ICON                   = (byte) 0x00; // 24x12_Files_Folders_Settings.bmp
	public static byte SMALL_ICON                    = (byte) 0x01;
	public static byte LARGE_ICON                    = (byte) 0x02; // 24x22_Yes_No_OFF_FILEOps.bmp
	public static byte MENU_ICON                     = (byte) 0x03;
	public static byte ARROW_ICON                    = (byte) 0x04; // 8x12_miniArrows.bmp

	// S_ICON_NO
	public static byte SICON_CHARGING                = (byte) 0x00;
	public static byte SICON_BATT_4                  = (byte) 0x01;
	public static byte SICON_BATT_3                  = (byte) 0x02;
	public static byte SICON_BATT_2                  = (byte) 0x03;
	public static byte SICON_BATT_1                  = (byte) 0x04;
	public static byte SICON_BATT_0                  = (byte) 0x05;
	public static byte SICON_WAIT1                   = (byte) 0x06;
	public static byte SICON_WAIT2                   = (byte) 0x07;
	public static byte SICON_BT_ON                   = (byte) 0x08;
	public static byte SICON_BT_VISIBLE              = (byte) 0x09;
	public static byte SICON_BT_CONNECTED            = (byte) 0x0A;
	public static byte SICON_BT_CONNVISIB            = (byte) 0x0B;
	public static byte SICON_WIFI_3                  = (byte) 0x0C;
	public static byte SICON_WIFI_2                  = (byte) 0x0D;
	public static byte SICON_WIFI_1                  = (byte) 0x0E;
	public static byte SICON_WIFI_CONNECTED          = (byte) 0x0F;
	public static byte SICON_USB                     = (byte) 0x15;

	// N_ICON_NO
	public static byte ICON_NONE                     = (byte) 0x21;
	public static byte ICON_RUN                      = (byte) 0x00;
	public static byte ICON_FOLDER                   = (byte) 0x01;
	public static byte ICON_FOLDER2                  = (byte) 0x02;
	public static byte ICON_USB                      = (byte) 0x03;
	public static byte ICON_SD                       = (byte) 0x04;
	public static byte ICON_SOUND                    = (byte) 0x05;
	public static byte ICON_IMAGE                    = (byte) 0x06;
	public static byte ICON_SETTINGS                 = (byte) 0x07;
	public static byte ICON_ONOFF                    = (byte) 0x08;
	public static byte ICON_SEARCH                   = (byte) 0x09;
	public static byte ICON_WIFI                     = (byte) 0x0A;
	public static byte ICON_CONNECTIONS              = (byte) 0x0B;
	public static byte ICON_ADD_HIDDEN               = (byte) 0x0C;
	public static byte ICON_TRASHBIN                 = (byte) 0x0D;
	public static byte ICON_VISIBILITY               = (byte) 0x0E;
	public static byte ICON_KEY                      = (byte) 0x0F;
	public static byte ICON_CONNECT                  = (byte) 0x10;
	public static byte ICON_DISCONNECT               = (byte) 0x11;
	public static byte ICON_UP                       = (byte) 0x12;
	public static byte ICON_DOWN                     = (byte) 0x13;
	public static byte ICON_WAIT1                    = (byte) 0x14;
	public static byte ICON_WAIT2                    = (byte) 0x15;
	public static byte ICON_BLUETOOTH                = (byte) 0x16;
	public static byte ICON_INFO                     = (byte) 0x17;
	public static byte ICON_TEXT                     = (byte) 0x18;
	public static byte ICON_QUESTIONMARK             = (byte) 0x1B;
	public static byte ICON_INFO_FILE                = (byte) 0x1C;
	public static byte ICON_DISC                     = (byte) 0x1D;
	public static byte ICON_CONNECTED                = (byte) 0x1E;
	public static byte ICON_OBP                      = (byte) 0x1F;
	public static byte ICON_OBD                      = (byte) 0x20;
	public static byte ICON_OPENFOLDER               = (byte) 0x21;
	public static byte ICON_BRICK1                   = (byte) 0x22;

	// L_ICON_NO
	public static byte YES_NOTSEL                    = (byte) 0x00;
	public static byte YES_SEL                       = (byte) 0x01;
	public static byte NO_NOTSEL                     = (byte) 0x02;
	public static byte NO_SEL                        = (byte) 0x03;
	public static byte OFF                           = (byte) 0x04;
	public static byte WAIT_VERT                     = (byte) 0x05;
	public static byte WAIT_HORZ                     = (byte) 0x06;
	public static byte TO_MANUAL                     = (byte) 0x07;
	public static byte WARNSIGN                      = (byte) 0x08;
	public static byte WARN_BATT                     = (byte) 0x09;
	public static byte WARN_POWER                    = (byte) 0x0A;
	public static byte WARN_TEMP                     = (byte) 0x0B;
	public static byte NO_USBSTICK                   = (byte) 0x0C;
	public static byte TO_EXECUTE                    = (byte) 0x0D;
	public static byte TO_BRICK                      = (byte) 0x0E;
	public static byte TO_SDCARD                     = (byte) 0x0F;
	public static byte TO_USBSTICK                   = (byte) 0x10;
	public static byte TO_BLUETOOTH                  = (byte) 0x11;
	public static byte TO_WIFI                       = (byte) 0x12;
	public static byte TO_TRASH                      = (byte) 0x13;
	public static byte TO_COPY                       = (byte) 0x14;
	public static byte TO_FILE                       = (byte) 0x15;
	public static byte CHAR_ERROR                    = (byte) 0x16;
	public static byte COPY_ERROR                    = (byte) 0x17;
	public static byte PROGRAM_ERROR                 = (byte) 0x18;
	public static byte WARN_MEMORY                   = (byte) 0x1B;

	// M_ICON_NO
	public static byte ICON_STAR                     = (byte) 0x00;
	public static byte ICON_LOCKSTAR                 = (byte) 0x01;
	public static byte ICON_LOCK                     = (byte) 0x02;
	public static byte ICON_PC                       = (byte) 0x03; // Bluetooth type PC
	public static byte ICON_PHONE                    = (byte) 0x04; // Bluetooth type PHONE
	public static byte ICON_BRICK                    = (byte) 0x05; // Bluetooth type BRICK
	public static byte ICON_UNKNOWN                  = (byte) 0x06; // Bluetooth type UNKNOWN
	public static byte ICON_FROM_FOLDER              = (byte) 0x07;
	public static byte ICON_CHECKBOX                 = (byte) 0x08;
	public static byte ICON_CHECKED                  = (byte) 0x09;
	public static byte ICON_XED                      = (byte) 0x0A;

	// A_ICON_NO
	public static byte ICON_LEFT                     = (byte) 0x01;
	public static byte ICON_RIGHT                    = (byte) 0x02;

	//  BTTYPE
	public static byte BTTYPE_PC                     = (byte) 0x03; // Bluetooth type PC
	public static byte BTTYPE_PHONE                  = (byte) 0x04; // Bluetooth type PHONE
	public static byte BTTYPE_BRICK                  = (byte) 0x05; // Bluetooth type BRICK
	public static byte BTTYPE_UNKNOWN                = (byte) 0x06; // Bluetooth type UNKNOWN

//  values moved to respective class
//	// LEDPATTERN
//	public static byte LED_OFF                       = (byte) 0x00;
//	public static byte LED_GREEN                     = (byte) 0x01;
//	public static byte LED_RED                       = (byte) 0x02;
//	public static byte LED_ORANGE                    = (byte) 0x03;
//	public static byte LED_GREEN_FLASH               = (byte) 0x04;
//	public static byte LED_RED_FLASH                 = (byte) 0x05;
//	public static byte LED_ORANGE_FLASH              = (byte) 0x06;
//	public static byte LED_GREEN_PULSE               = (byte) 0x07;
//	public static byte LED_RED_PULSE                 = (byte) 0x08;
//	public static byte LED_ORANGE_PULSE              = (byte) 0x09;

	// LEDTYPE
	public static byte LED_ALL                       = (byte) 0x00; // All LEDs
	public static byte LED_RR                        = (byte) 0x01; // Right red
	public static byte LED_RG                        = (byte) 0x02; // Right green
	public static byte LED_LR                        = (byte) 0x03; // Left red
	public static byte LED_LG                        = (byte) 0x04; // Left green

	// FILETYPE
	public static byte FILETYPE_UNKNOWN              = (byte) 0x00;
	public static byte TYPE_FOLDER                   = (byte) 0x01;
	public static byte TYPE_SOUND                    = (byte) 0x02;
	public static byte TYPE_BYTECODE                 = (byte) 0x03;
	public static byte TYPE_GRAPHICS                 = (byte) 0x04;
	public static byte TYPE_DATALOG                  = (byte) 0x05;
	public static byte TYPE_PROGRAM                  = (byte) 0x06;
	public static byte TYPE_TEXT                     = (byte) 0x07;
	public static byte TYPE_SDCARD                   = (byte) 0x10;
	public static byte TYPE_USBSTICK                 = (byte) 0x20;
	public static byte TYPE_RESTART_BROWSER          = (byte) 0x21;
	public static byte TYPE_REFRESH_BROWSER          = (byte) 0x22;

	// RESULT
	public static byte OK                            = (byte) 0x00; // No errors to report
	public static byte BUSY                          = (byte) 0x01; // Busy - try again
	public static byte FAIL                          = (byte) 0x02; // Something failed
	public static byte STOP                          = (byte) 0x04; // Stopped

	// DATA_FORMAT
	public static byte DATA_8                        = (byte) 0x00; // DATA8 (don't change)
	public static byte DATA_16                       = (byte) 0x01; // DATA16 (don't change)
	public static byte DATA_32                       = (byte) 0x02; // DATA32 (don't change)
	public static byte DATA_F                        = (byte) 0x03; // DATAF (don't change)
	public static byte DATA_S                        = (byte) 0x04; // Zero terminated string
	public static byte DATA_A                        = (byte) 0x05; // Array handle
	public static byte DATA_V                        = (byte) 0x07; // Variable type
	public static byte DATA_PCT                      = (byte) 0x10; // Percent (used in opINPUT_READEXT)
	public static byte DATA_RAW                      = (byte) 0x12; // Raw (used in opINPUT_READEXT)
	public static byte DATA_SI                       = (byte) 0x13; // SI unit (used in opINPUT_READEXT)

	// DEL
	public static byte DEL_NONE                      = (byte) 0x00; // No delimiter at all
	public static byte DEL_TAB                       = (byte) 0x01; // Use tab as delimiter
	public static byte DEL_SPACE                     = (byte) 0x02; // Use space as delimiter
	public static byte DEL_RETURN                    = (byte) 0x03; // Use return as delimiter
	public static byte DEL_COLON                     = (byte) 0x04; // Use colon as delimiter
	public static byte DEL_COMMA                     = (byte) 0x05; // Use comma as delimiter
	public static byte DEL_LINEFEED                  = (byte) 0x06; // Use line feed as delimiter
	public static byte DEL_CRLF                      = (byte) 0x07; // Use return+line feed as delimiter

	// HWTYPE
	public static byte HW_USB                        = (byte) 0x01;
	public static byte HW_BT                         = (byte) 0x02;
	public static byte HW_WIFI                       = (byte) 0x03;

	// ENCRYPT
	public static byte ENCRYPT_NONE                  = (byte) 0x00;
	public static byte ENCRYPT_WPA2                  = (byte) 0x01;


	// MIX
	public static byte MODE_KEEP                     = (byte) 0x21;
	public static byte TYPE_KEEP                     = (byte) 0x00;

	// COLOR
	public static byte RED                           = (byte) 0x00;
	public static byte GREEN                         = (byte) 0x01;
	public static byte BLUE                          = (byte) 0x02;
	public static byte BLANK                         = (byte) 0x03;

	// NXTCOLOR
	public static byte BLACKCOLOR                    = (byte) 0x01;
	public static byte BLUECOLOR                     = (byte) 0x02;
	public static byte GREENCOLOR                    = (byte) 0x03;
	public static byte YELLOWCOLOR                   = (byte) 0x04;
	public static byte REDCOLOR                      = (byte) 0x05;
	public static byte WHITECOLOR                    = (byte) 0x06;

	// WARNING
	public static byte WARNING_TEMP                  = (byte) 0x01;
	public static byte WARNING_CURRENT               = (byte) 0x02;
	public static byte WARNING_VOLTAGE               = (byte) 0x04;
	public static byte WARNING_MEMORY                = (byte) 0x08;
	public static byte WARNING_DSPSTAT               = (byte) 0x10;
	public static byte WARNING_BATTLOW               = (byte) 0x40;
	public static byte WARNING_BUSY                  = (byte) 0x80;

	// OBJSTAT
	public static byte RUNNING                       = (byte) 0x10; // Object code is running
	public static byte WAITING                       = (byte) 0x20; // Object is waiting for final trigger
	public static byte STOPPED                       = (byte) 0x40; // Object is stopped or not triggered yet
	public static byte HALTED                        = (byte) 0x80; // Object is halted because a call is in progress

	//DEVCMD
	public static byte DEVCMD_RESET                  = (byte) 0x11; // UART device reset
	public static byte DEVCMD_FIRE                   = (byte) 0x11; // UART device fire (ultrasonic)
	public static byte DEVCMD_CHANNEL                = (byte) 0x12; // UART device channel (IR seeker)

}