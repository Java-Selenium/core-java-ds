package nestedclass;

public class OuterClass {
	
	InnerA innerA = new InnerA();
	InnerB innerB = new InnerB();
	
	public void ouuterMethod(){
		System.out.println("I am a Outter method");
		innerA.innerAMethod();
		System.out.println(innerA.getNumber());
		innerB.innerBMethod();
		System.out.println(innerB.getValue());
	}
	public void getInnerMessage(){
		innerA.innerAMethod();
	}
	
	private class InnerA{
	
		int num = 10;
		
		public int getNumber(){
			return num;
		}
		public void innerAMethod(){
			System.out.println("I am a Inner A method");
		}
		
		
	}
	
    private class InnerB{
        int value = 20;
		
		public int getValue(){
			return value;
		}
		public void innerBMethod(){
			System.out.println("I am a Inner B method");
		}
		
		
	}   
    
    
}
