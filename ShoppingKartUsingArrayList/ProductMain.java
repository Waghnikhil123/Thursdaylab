package shoppingKartUsingArrayList;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

			//Declaring variables
			int choice;
			Scanner sc=new Scanner(System.in);
			do {
				System.out.println("=====================================");
			System.out.println("Welcome to Shopping Kart");
			System.out.println("=====================================");
			System.out.println("Press 1. for Add Product\nPress 2. for get product by id\n"
					+ "Press 3. To update prodcut by Id\npress 4. to delete product by id\n"
					+ "Press 5. to see all product details\npress"
					+ " 6. to Book product\n"
					+ "7.to cancel order\n"
					+ "8.to check order details\n"
					+ "9.quit");
			System.out.println("=====================================");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			   case 1:
			   ProductService.addProduct();
				
				System.out.println("=====================================");
				break;
				
			case 2:
				System.out.println("Enter id to search:");
				int id=sc.nextInt();
				
				try {
					 ProductService.getProductById(id);
				} catch (GlobalException e) 
				{
					System.out.println("Exception occured: "+e.getMessage());
				}
				System.out.println("=====================================");
				
				break;
			case 3:
				System.out.println("Enter id to update:");
				 id=sc.nextInt();
					
				try {
					 ProductService.updateProduct(id);
				} catch (GlobalException e) 
				{
					System.out.println("Exception occured: "+e.getMessage());
				}
				System.out.println("=====================================");
				break;
					
			case 4:
				System.out.println("Enter id to Delete product:");
			int id2=sc.nextInt();
			try {
				 ProductService.deleteProductById(id2);
				} 
				catch (GlobalException e) {
					System.out.println("Exception occured: "+e.getMessage());
					
			           }
			break;
					
			case 5:
				ProductService.getAllProduct();
				System.out.println("=====================================");
				break;
				
			case 6:
				ProductService.bookProduct();
				System.out.println("=====================================");
				break;
				
			case 7:
				ProductService.cancelOrder();
				System.out.println("====================================");
				break;
			case 8:
				ProductService.OrderDetails();
				System.out.println("====================================");
				break;
			}
			}while(choice!=9);

		}
	}


