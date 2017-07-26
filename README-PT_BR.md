# J4EV3
Uma API Java capaz de comunicar com o brick LEGO Mindstorms EV3 através de comandos diretos. Essa API foi implementada com o intuito de ser simples de usar, portanto todas as funcionalidades são acessadas através de um objeto da classe Brick.

## Modo de Uso
Para utilizar essa biblioteca em seu projeto basta adicionar o arquivo *.jar* (Disponível na pasta "build" ou você pode gerar) às dependências do seu projeto e criar um objeto Brick passando o parâmetro necessário. Esse parâmetro é uma instância de uma classe que implementa a interface java CommInterface. A única disponível nesse momento é a BluetoothComm.

Exemplo:
```
Brick brick = new Brick(new BluetoothComm("12EF26A3CB2D"));
```
Através de um objeto Brick você pode acessar instâncias das classes que contém os métodos que interagem com o brick EV3. Essas classes são:
- Button
- LCD
- LED
- Motor
- Sensor
- Speaker

Essas classes começam uma sequência de métodos que gera código que o brick EV3 entende e depois o envia e aguarda uma resposta se necessário.

Exemplos de Métodos:
```
brick.getButton().buttonPressed(Button.ANY_BUTTON);
brick.getLCD().drawLine(LCD.COLOR_BLACK, 0, 0, 45, 45);
brick.getLED().setPattern(LED.LED_GREEN_FLASH);
brick.getMotor().turnAtPower( (byte)(Motor.PORT_B+Motor.PORT_C) , 100);
brick.getSensor().getValuePercent(Sensor.PORT_3, Sensor.TYPE_COLOR, Sensor.COLOR_AMBIENT);
brick.getSpeaker().playTone(100, 600, 1000)
```
A maioria das classes contém variáveis static definidas que são usadas como parâmetros em seus métodos.

## Instruções de Build
Para buildar a biblioteca em um arquivo *.jar* basta usar qualquer meio de exportação que empacota as dependências junto com o código gerado. No eclipse você pode simplesmente criar um método main vazio em qualquer arquivo e exportar o projeto como um arquivo *.jar* executável. Se você não exportar ele com as dependências a classe BluetoothComm não vai funcionar e vai indicar que existem erros por causa da falta de bibliotecas.

Se você deseja implementar outro meio de comunicação com outra plataforma ou usando outra tecnologia você pode gerar um arquivo *.jar* contendo somente as classes do pacote **core**. Após isso basta criar uma classe que implementa a interface CommInterface e escrever seus métodos.

### Notas Adicionais

- Um gist da implementação de uma classe de comunicação Android está disponível [aqui](https://gist.github.com/LLeddy/69ffcbe4e12b037d4c2545437ca2893e) e um arquivo *.aar* compilado está disponível na pasta "build". Basta importar o arquivo no seu projeto Android e criar um objeto Brick passando um BluetoothDevice como parâmetro. O BluetoothDevice pode ser obtido usando a Android Bluetooth API nativa.
- [Bluecove](http://bluecove.org/) foi usado para implementar a comunicação bluetooth nessa biblioteca. Bluecove adere às licensas Apache License 2.0 e GNU GPL.
- Para obter um maior conhecimento sobre os valores de parâmetros aceitos veja o LEGO Mindstorms EV3 Firmware Developer Kit disponível no link https://education.lego.com/en-us/support/mindstorms-ev3/developer-kits.
