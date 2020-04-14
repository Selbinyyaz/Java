package com.syntax.class24;

public abstract class Phone {
	
	//implemented methods
	public void call() {
		System.out.println("Phone can make call");
	}

	public void text() {
		System.out.println("Phone can send text");
	}

	// unimplemented methods=undefined methods=abstract method
	public abstract void takePicture(int a);

	public abstract void playMusic();

}

class iPhone extends Phone {

	@Override
	public void takePicture(int a) {
		System.out.println("iphone takes pictures");

	}

	@Override
	public void playMusic() {
		System.out.println("iphone play music using apple store");

	}

}
class Samsung extends Phone{

	@Override
	public void takePicture(int a) {
		System.out.println("Samsung takes pictures");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung play music using apple store");
		
	}
	
}