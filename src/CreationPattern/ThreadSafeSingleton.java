package CreationPattern;

public class ThreadSafeSingleton {
	//-2 instance
	private static  ThreadSafeSingleton _instance;
	//-1 private constructor
	private ThreadSafeSingleton(){
		
	}
	//-3 getInstance

	public static synchronized ThreadSafeSingleton getInstance(){
		if(_instance==null)
		{
			System.out.println("creating thread safe instance ");
			_instance=new ThreadSafeSingleton();
			return _instance;
		}	
		System.out.println("returning thread safe instance ");
		return _instance;
	}

}
