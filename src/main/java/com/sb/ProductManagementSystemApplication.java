package com.sb;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.sb.controller.ProductController;
import com.sb.model.Product;

@SpringBootApplication
@EnableScheduling
public class ProductManagementSystemApplication {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);

		ConfigurableApplicationContext context = SpringApplication.run(ProductManagementSystemApplication.class, args);

		ProductController controller = context.getBean(ProductController.class);

		int choice = 0;

		while (choice != 5) {
			try {
			
				Thread.sleep(2000);
				System.out.println("\n\n");
				
			System.out.println("enter 1 for add Product ");
			System.out.println("enter 2 for view product ");
			System.out.println("enter 3 for  update");
			System.out.println("enter 4 for  delete");
			System.out.println("enter 5 for exit ");
			}catch(InterruptedException e ) {
				System.err.println("Please Reload This Project");
			}

			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter Product ID: ");
				int pId = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Product Name : ");
				String proName = sc.nextLine();

				System.out.println("Enter product Desc : ");
				String proDecp = sc.nextLine();

				System.out.println("Enter product Price : ");
				double proPrice = sc.nextDouble();

				try {
					Thread.sleep(2000);
					controller.addProduct(new Product(pId, proName, proDecp, proPrice));
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				break;
			}

			case 2: {
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
				}
				controller.viewProduct();
				break;
			}
			case 3: {
				System.out.println("Enter Product ID: ");
				int pId1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Product Name : ");
				String proName1 = sc.nextLine();

				System.out.println("Enter product Desc : ");
				String proDecp1 = sc.nextLine();

				System.out.println("Enter product Price : ");
				double proPrice1 = sc.nextDouble();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println("re Load This Project ");
				}
				controller.changeDetails(new Product(pId1, proName1, proDecp1, proPrice1));
				break;
			}
			case 4: {
				System.out.println("enter id for delete product ");
				int id = sc.nextInt();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("re Load This Project ");
				}
				controller.deleteProduct(id);
				break;
			}
			case 5: {
				System.out.println("Thank you!");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					System.out.println("re Load This Project ");
				}
				System.exit(0);
			}
			default: {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("re Load This Project ");
				}
				System.out.println("Invlid Choice : ");
			}
			}// switch

		} // while

		sc.close();
	}// main

}// class
