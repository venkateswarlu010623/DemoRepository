package java8_features;

interface book{
	
	public abstract void story();
	
}

public class lambda_expression {
	public static void main(String[] args) 
	{
		book b = () -> {
//			@Override
//			public void story() 
//			{
				System.out.println("ramayan");
//			}
		};
		b.story();
	}
}