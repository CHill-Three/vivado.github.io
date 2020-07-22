// Define Pins
// Blue will be designated to pin 3
#define BLUE 3
// Green will be designated to pin 5
#define GREEN 5
// Red will be designated to pin 6
#define RED 6

void setup()
{
// Define all three pins being used as outputs
pinMode(RED, OUTPUT);
pinMode(GREEN, OUTPUT);
pinMode(BLUE, OUTPUT);
}

void Color(int redValue, int greenValue, int blueValue) 
{
  analogWrite(RED, redValue);
  analogWrite(GREEN, greenValue);
  analogWrite(BLUE, blueValue);
}

// choose a value between 1 and 255 to change the color. (red value, green value, blue value)
void loop() 
{
  Color(255, 0, 0); // Red
  delay(1000);
  Color(204, 102, 0); // Orange
  delay(1000);
  Color(255, 255, 0); // Yellow
  delay(1000);
  Color(0, 255, 0); // Green
  delay(1000);
  Color(0, 255, 255); // Cyan
  delay(1000);
  Color(0, 0, 255); // Blue
  delay(1000);
  Color(170, 0, 255); // Purple
  delay(1000);
  Color(255, 51, 153); // Pink
  delay(1000);
  Color(255, 255, 255); // White
  delay(1000);
  // "Exit" Statement
  Color(0, 0, 0); // No Color (Black)
  delay(1000);
  exit(0);
}
