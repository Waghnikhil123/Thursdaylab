package shoppingKartUsingArrayList;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import shoppingKartUsingArrayList.OrderDetails;
//import shoppingKartUsingArrayList.shoppingKartOperations;

public class ProductService {
	static ArrayList<Product> product=new ArrayList<Product>();
	static ArrayList<OrderDetails> order=new ArrayList<OrderDetails>();
	static Scanner sc=new Scanner(System.in);

	static void addProduct()
	{
		System.out.println("Enter Product id:");
		int id=sc.nextInt();                                //1
		
		sc.nextLine();
		System.out.println("Enter Product Name:");
		String name=sc.nextLine();                           //mobile
		
		System.out.println("Enter Product Brand:"); 
		String brand=sc.nextLine();                           //re
		
		System.out.println("Enter Product Price:");
		double price=sc.nextDouble();
		
		System.out.println("Enter Product Stock:");
		int stock=sc.nextInt();
		
		product.add(new Product(id, name, brand, price, stock));
		System.out.println("Product details added successfully!!");
		
	}

	static void updateProduct(int id) throws GlobalException
	{
		boolean status=false;
		for(int i=0;i<product.size();i++)
		{
			if(id==product.get(i).getId())
			{
				
				System.out.println("Enter new Product id:");
				int pid=sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter new Product Name:");
				String name=sc.nextLine();
				
				System.out.println("Enter new Product Brand:");
			    String brand=sc.nextLine();
				
				System.out.println("Enter new Product Price:");
				double price=sc.nextDouble();
				
				System.out.println("Enter new Product Stock:");
				int stock=sc.nextInt();
				
				product.set(i, new Product(pid, name, brand, price, stock));
				System.out.println("Product has been updated successfully!");
				status=true;
			}
		}
		
		if(status==false)
	     throw new GlobalException("Product id not found!!!");
	}
	static void getProductById(int id)throws GlobalException
	{
		boolean status=false;
		for(int i=0;i<product.size();i++)
		{
			if(id==product.get(i).getId())
			{
		for(Product ob:product)
		{
			System.out.println("\nproduct id: "+ob.getId()+"\n product name: "+ob.getName()+" \nproduct brand: "+ob.getBrand()+"\n product price: "+ob.getPrice()+" \nproduct stock: "+ob.getStock());
			status=true;
		}
			}
		}
		if(status==false)
		     throw new GlobalException("Product id not found!!!");
	}
	static void getAllProduct()
	{
		
			for(Product ob:product)
			{
				System.out.println("\nproduct id: "+ob.getId()+"\n product name: "+ob.getName()+" \nproduct brand: "+ob.getBrand()+"\n product price: "+ob.getPrice()+" \nproduct stock: "+ob.getStock());
				
			}
		
	}
	static void deleteProductById(int id) throws GlobalException
	{
		boolean status=false;
		for(int i=0;i<product.size();i++)
		{
			if(id==product.get(i).getId())
			{
				product.remove(i);
				System.out.println("product deleted successfully");
				status=true;
			}
			
		}
		if(status==false)
		     throw new GlobalException("Product id not found!!!");
	}
	
	static void bookProduct()
	{
		boolean status=false;
		sc.nextLine();
		System.out.println("Enter Product Name:");
		String name=sc.nextLine();                                                              //mobile
		System.out.println("=========================================");
		
		//display product for booking
		for(int i=0;i<product.size();i++)
		{
			if(Objects.equals(name, product.get(i).getName()))                                   // at 1 mobile==mobile
			{
				for(Product ob:product) {
				System.out.println("\nproduct id: "+ob.getId()+"\n product name: "+ob.getName()+" \nproduct brand: "+ob.getBrand());
					
				if(product.get(i).getStock()<=0)                         //10<=0
				{
					System.out.println("Currently Unavialable");
				}
				else
				{
				System.out.println("Product Stock:"+product.get(i).getStock());             //10
				}
				System.out.println("=========================================");
				status=true;
				}
			}
		}
		
		//if searched product is available,then proceed for booking
		if(status==true)
		{
			int confirmation;
			//sc.nextLine();
			System.out.println("Want to book product? if Yes then press 1 else press 2:");
			confirmation=sc.nextInt();                                          //for booking press 1
			if(confirmation==1)
			{
			System.out.println("For Booking, Enter Id");
			int bId=sc.nextInt();                                      //booking id =1
			
			for(int i=0;i<product.size();i++)
			{
				if(product.get(i).getId()==bId)
				{
					System.out.println("Enter quantity:");
					int quantity=sc.nextInt();                                    //enter quantity=2
					
					//checking stock is available or not
					if(product.get(i).getStock()>quantity)                           //10>2 t
					{
						System.out.println("Your Booking has done successfully!!");
						double totalAmount=quantity*product.get(i).getPrice();     //total amount=2*20000=40000

										
						System.out.println("~Booking Details:~");
						System.out.println("Product Name:"+product.get(i).getName());
						System.out.println("Product Brand:"+product.get(i).getBrand());
						System.out.println("Product Quantity:"+quantity);
						System.out.println("Total Amount:"+totalAmount);
					    
						//updating stock after booking product
						product.get(i).setStock(product.get(i).getStock()-quantity);               //stock=10-2=8
						
						order.add(new OrderDetails(bId,product.get(i).getId(),name,product.get(i).getBrand(), quantity, totalAmount));
						break;			
					}
				}
			}		
		}//confirmation if closed
		
			
		}
		else
			System.out.println("No such product available in shopping kart!!");
	}
	
	static void cancelOrder()
	{
			
		boolean status=false;
		System.out.println("Enter Order id to Cancel booked product");
		int OId=sc.nextInt(); 
		for(int i = 0;i<product.size();i++)
		{
			
		
			if(OId == order.get(i).getOrderId())
			{
				product.get(i).setStock(product.get(i).getStock()+order.get(i).getQuantity());

				order.remove(i);
				System.out.println("Product bearing Id "+OId+" has been deleted sucessfully! ");
				status=true;
	         }	
			
			break;
	    }
		if(status==false)
		{
			System.out.println("Product Id not found");
			System.out.println("=====================================");
		}
	}
	static void OrderDetails()
	{
		for(OrderDetails ob:order)
		{
			System.out.println("\norder id: "+ob.getOrderId()+"\n product name: "+ob.getProductName()+" \nproduct brand: "+ob.getBrand()+"\n product price: "+ob.getTotalAmount()+" \nproduct stock: "+ob.getQuantity());
			
		}
		
	}
		
	}


