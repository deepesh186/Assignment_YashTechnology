package com.yash.oops;
/**
 * @author deepesh.a
 * class is created to show Abstract and Interface
 *
 */
abstract class Demo
{
	int noOfTrainee;//define no of trainee in Training
	//parametrize construtor to print the no of trainee
	Demo(int noOfTrainee)
	{
		this.noOfTrainee=noOfTrainee;
		System.out.println(noOfTrainee);
	}
	//Abstract method for user in training
	abstract void useTrng();
	//method to define user of keyboard
	void useKeyboard()
	{
		System.out.println("keyboard method invoked");
	}
}
//Driver class

public class AbstractDemo extends Demo implements DemoInterface{

	AbstractDemo(int noOfTrainee) {
		super(noOfTrainee);
		// TODO Auto-generated constructor stub
	}
	@Override
	void useTrng() {
		// TODO Auto-generated method stub
		System.out.println("training method invoked");
		
	}
	public static void main(String[] args)
	{
		AbstractDemo demo=new AbstractDemo(35);
		demo.useKeyboard();
		demo.useTrng();
		demo.useLight();
		demo.useClassRoom();
	}
	@Override
	public void useClassRoom() {
		// TODO Auto-generated method stub
		System.out.println("classroom method from interface invoked");
		
	}
	@Override
	public void useLight() {
		// TODO Auto-generated method stub
		System.out.println("uselight method from interface invoked");
		
	}

}
