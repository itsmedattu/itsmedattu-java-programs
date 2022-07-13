
public class ProducerConsumer {
	public int count=0;
	
	public void increment()
	{ 
		count++;
	}
	public void get() 
	{
		System.out.println("count value is "+count);
	}
}

class Producer implements Runnable
{
	ProducerConsumer pc1=new ProducerConsumer();
	
	public void run() 
	{	
		for(int i=0;i<10;i++) {
			pc1.increment();
		}	
	}
}
class Consumer implements Runnable
{
ProducerConsumer pc2=new ProducerConsumer();
 
public void run() {
	System.out.println("hi");
	for( int i=0;i<10;i++){
		pc2.get();
	}
}
}