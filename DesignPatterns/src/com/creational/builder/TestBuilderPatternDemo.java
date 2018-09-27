package com.creational.builder;

import com.creational.builder.Computer;

public class TestBuilderPatternDemo {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer.ComputerBuilder("50GB", "6GB").isBluetoothEnabled(true).
				isGraphicsEnabled(true).build();
		
	}

}
