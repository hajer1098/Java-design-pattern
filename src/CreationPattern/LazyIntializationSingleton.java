package CreationPattern;

public class LazyIntializationSingleton {
	 //not create the instance in previous
	private static  LazyIntializationSingleton _instance ;
	
	
	//-1 private constructor
		private LazyIntializationSingleton(){
			
		}
		//-3 getInstance
		
		public static  LazyIntializationSingleton getInstance(){
			//but we create when we need
			if(_instance==null){
				System.out.println("creating new instance ");
				 _instance=new LazyIntializationSingleton();
			}
			System.out.println("returning the instance ");
			return _instance;
			
		}

}

