package Iseue4;

public class Adapter extends Robot implements Spieler
{
	 public int geheNachLinks(int a)
	 {
		 double xPosition = getX();
		 xPosition -= a;
	     return (int) xPosition;
	 }
	 
	 public int geheNachRechts(int a)
	 {
		 double xPosition = getX();
		 xPosition += a;
	     return (int) xPosition;
		 
	 }
	 
	 public int geheNachOben(int a)
	 {
		 double yPosition = getY();
		 yPosition += a;
	     return (int) yPosition;
	 }
	 
	 public int geheNachUnten(int a)
	 {
		 double yPosition = getY();
		 yPosition -= a;
	     return (int) yPosition;
	 }
	 
	 public static void main(String[] args)
	 {
		 Adapter Ralphobot = new Adapter(); // Adapter statt Roboter
		 System.out.println(Ralphobot.geheNachOben(3));
	 }

}
