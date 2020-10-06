/*
 * 62.	Create a class that checks whether a given number is prime or not using  Runnable interface
 */
package demo;

class checknum
{
    public static void main(String args[])
    {
    	NewThread1 t = new NewThread1();
    	Thread t1 = new Thread(t); 
    	t1.start();
        System.out.println("Main Thread is Terminated");
    }
}
class NewThread1 implements Runnable
{

	public void run()
	{
		int i=2,no=11 ,flag=1;
      
		try
        {
			System.out.println("Run() Method Started");
			int n2= no/2;
			if(n2==0)
				System.out.println("No is not prime");
			else
				System.out.println("No is prime");
                   Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception"); 
        }
	}
}