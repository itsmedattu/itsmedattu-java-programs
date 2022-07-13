import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



public class MyClassCreation implements Cloneable {

	/**
	 * @param args
	 */
	
	
	
	
	MyClassCreation()
	{
		System.out.println("welcome");
	}
	
	String name="MyClass";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class myc=Class.forName("MyClassCreation");
			MyClassCreation mycc=(MyClassCreation)myc.newInstance();
			System.out.println(mycc.name);
			
			MyClassCreation o=new MyClassCreation();
			try {
			MyClassCreation on=(MyClassCreation)o.clone();
			System.out.println("Object name "+on.name );
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
			
			
			
			
			Constructor<MyClassCreation> con=MyClassCreation.class.getDeclaredConstructor();
			try {
				MyClassCreation mynewobject=con.newInstance();
				
			}
			catch(Exception e)
			{
				
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}

}

