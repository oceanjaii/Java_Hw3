package test_p15;

public class Sample3_7
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		int number =1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number, gasoline);
	}
}

class Car
{
	int num;
	double gas;
	
	void setNumGas(int n, double g)
	{
		int num = n;
		double gas = g;
		
		System.out.println("�N�����]��" + num +"�A�T���q�]��" + gas);
	}
	
	void show()
	{
		System.out.println("�����O" +num);
		System.out.println("�T�o�q�O" +gas);
	}
	
}
