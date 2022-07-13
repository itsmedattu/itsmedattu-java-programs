

import java.util.ArrayList;

public class myProduct {
	public static void main(String[] args)
	{
		Product pObj=new Product();
		String [] prodCodes= {
				"Product1",
				"DProduct2",
				"Procuct3",
				"RProcuct4",
				"DProduct5"
				};
		pObj.OrderProductsByPriority(prodCodes);
	}
	
	

}

class Product
{
	private int GetPriority(String productCode) {
		if(productCode.startsWith("D"))
		{
			return 1;
		}
		else if(productCode.startsWith("P"))
		{
			return 2;
		}
		else if(productCode.startsWith("R"))
		{
			return 3;
		}
		else 
			return -1;
	}
	
	@SuppressWarnings("null")
	public void OrderProductsByPriority(String[] productCodes)
	{
		int counter=0;
		System.out.println("Products are ");
		for(String str:productCodes) {
			System.out.println(str);
		}	
		System.out.println("ordering Products by Priority");
		ArrayList<String> lowPriorityProducts=new ArrayList<String>();
		ArrayList<String> mediumPriorityProducts=new ArrayList<String>();
		ArrayList<String> highPriorityProducts=new ArrayList<String>();
		for(String productCode:productCodes)
		{
			if(GetPriority(productCode)==1)
			{
				lowPriorityProducts.add(productCode);
			}
			else if(GetPriority(productCode)==2)
			{
				mediumPriorityProducts.add(productCode);
			}
			else if(GetPriority(productCode)==3)
			{
				highPriorityProducts.add(productCode);
			}
		}
		
		
		for(int i=0;i<lowPriorityProducts.size();i++) {
			productCodes[counter]=lowPriorityProducts.get(i);
			counter++;
		}
		for(int i=0;i<mediumPriorityProducts.size();i++) {
			productCodes[counter]=mediumPriorityProducts.get(i);
			counter++;
		}
		for(int i=0;i<highPriorityProducts.size();i++) {
			productCodes[counter]=highPriorityProducts.get(i);
			counter++;
		}
		System.out.println("sorted products by priority");
		System.out.println("Products are ");
		for(String str:productCodes) {
			System.out.println(str);
		}	
	}

}
