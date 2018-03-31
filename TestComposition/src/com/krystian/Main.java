package com.krystian;

public class Main {

	public static void main(String [] args) {
		Dimension dimension = new Dimension(20, 20, 5);
		Case theCase = new Case("220b", "Dell", "240", dimension);
		
		Monitor monitor = new Monitor("ABC", "Asus", 27, new Resolution(2540, 1440));
		Motherboard motherboard = new Motherboard("ZZ", "AMD", 2, 3, "Bios");
		
		PC pc = new PC(theCase, monitor, motherboard);
		System.out.println(pc.toString());
	}
}
