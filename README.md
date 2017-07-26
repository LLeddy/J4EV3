# J4EV3
A Java API capable of communicating with the LEGO Mindstorms EV3 brick through direct commands. This API was coded with the intention of being simple to use, therefore every functionality is accessed through an object of the Brick class.

## Usage
To use this library in your project simply add its *.jar* file (Available in the "build" folder or build it yourself) to your project dependecies and create a Brick object with the necessary parameter. This parameter is a class that implements the CommInterface java interface. The only one present in the project currently is BluetoothComm.

Example:
```
Brick brick = new Brick(new BluetoothComm("12EF26A3CB2D"));
```
From a Brick object you can access instances of the classes which contain the methods that interact with the EV3 brick. These classes are:
- Button
- LCD
- LED
- Motor
- Sensor
- Speaker

These classes start a method chain that generates code that the EV3 brick understands and then sends the code to it and awaits a response if necessary.

Method Examples:
```
brick.getButton().buttonPressed(Button.ANY_BUTTON);
brick.getLCD().drawLine(LCD.COLOR_BLACK, 0, 0, 45, 45);
brick.getLED().setPattern(LED.LED_GREEN_FLASH);
brick.getMotor().turnAtPower( (byte)(Motor.PORT_B+Motor.PORT_C) , 100);
brick.getSensor().getValuePercent(Sensor.PORT_3, Sensor.TYPE_COLOR, Sensor.COLOR_AMBIENT);
brick.getSpeaker().playTone(100, 600, 1000)
```
Most classes have static variables defined inside them that are used as parameters in their methods.

## Build Instructions
To build the library into a *.jar* file just use any method of exportation that packages the dependencies with the code. In eclipse you can simply create an empty main method in any file and export the project as an executable *.jar* file. If you do not export it with dependencies the BluetoothComm class will not work and will raise errors because of the lack of necessary libraries.

If you wish to implement another means of communication with another platform or using another technology you can generate a *.jar* file containing only the classes in the **core** package. Then you just have to create a class the implements the interface CommInterface and code its methods.

### Additional Notes

- A gist of the implementation of an Android communication class is available [here](https://gist.github.com/LLeddy/69ffcbe4e12b037d4c2545437ca2893e) and a compiled *.aar* file is available in the "build" folder. Simply import it in your Android project and create a Brick object passing a BluetoothDevice which you can obtain using the native Android Bluetooth API.
- [Bluecove](http://bluecove.org/) was used to implement bluetooth communication in this library. Bluecove is licensed under the Apache License 2.0 and GNU GPL
- For further knowledge on accepted parameter values refer to the LEGO Mindstorms EV3 Firmware Developer Kit available at https://education.lego.com/en-us/support/mindstorms-ev3/developer-kits
