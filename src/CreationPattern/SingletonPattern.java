package CreationPattern;
import java.lang.System;



public class SingletonPattern {
	
	//-2 instance
	private static final SingletonPattern _instance =new SingletonPattern();
	
	//-1 private constructor
	private SingletonPattern(){
		
	}
	//-3 getInstance
	
	public static  SingletonPattern getInstance(){
		System.out.println("get instance :");
		return _instance;
		
	}

}
