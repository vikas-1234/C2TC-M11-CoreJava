package com.cg.smms.client;

import java.time.LocalDate;
import java.util.*;

import com.cg.smms.entities.*;
import com.cg.smms.services.*;

@SuppressWarnings("unused")
public class Entry {

	public static void main(String[] args) {

		/* Entity Object Creation */
		User user;
		MallAdmin mallAdmin;
		Mall mall;
		ShopOwner shopOwner;
		Shop shop;
		Employee employee;
		List<Employee> list1 = new ArrayList<Employee>();
		Item item;
		List<Item> list2 = new ArrayList<Item>();
		Customer customer;
		OrderDetails order;
		List<OrderDetails> list3 = new ArrayList<OrderDetails>();

		/* Service Object Creation */
		IUserService uService = new UserServiceImpl();
		IAdminService aService = new AdminServiceImpl();
		IShopService sService = new ShopServiceImpl();
		IEmployeeService eService = new EmployeeServiceImpl();
		ICustomerService cService = new CustomerServiceImpl();
		IOrderService oService = new OrderServiceImpl();

		/* Login */
		user = new User();
		user.setUserId(1);
		user.setPassword("1234");
		uService.login(user);

		/* Logout */
		aService.logOut();

//		1.
		/* USER ----> MALL ADMIN */
//		user = new User();
//		user.setName("Faraz");
//		user.setPassword("56faraz34");
//		user.setType("Mall Admin");
//		uService.addNewUser(user);

		
//		2.
//		/* MALL */
//		mallAdmin = new MallAdmin();
//		mallAdmin.setPhone("5487621587");
//		mallAdmin.setUser(user);// <---
//
//		aService.addMallAdmin(mallAdmin);// <---

//		
//***	mallAdmin = new MallAdmin();
//		mall = new Mall();
//		mall.setMallName("Naturals Organic Mango");
//		mall.setLocation("Mumbai");
//		mall.setCategories("All");
////
////	//	mallAdmin add the mall
//		mallAdmin.setMall(mall);// <---

////		3.
//		/* USER ----> SHOP OWNER ----> SHOP */
//		user = new User();
//		user.setName("Jyoti");
//		user.setPassword("jyoti@143");
//		user.setType("Shop Owner");
//
//		shopOwner = new ShopOwner();
//		shopOwner.setDob(LocalDate.of(1998, 10, 6));
//		shopOwner.setAddress("Delhi");
//		shopOwner.setUser(user);// <---
//
//		shop = new Shop();
//		shop.setShopCategory("Naturals Rose cream");
//		shop.setShopName("Rose");
//		shop.setShopStatus("OPEN");
//		shop.setLeaseStatus("Pending");
////
////		shopOwner set shop 
//		shopOwner.setShop(shop);// <---

////		4.
//		/* EMPLOYEE */
////		Employee details(1)
//		employee = new Employee();
//		employee.setName("Vikas P.");
//		employee.setDob(LocalDate.of(1995, 12, 11));
//		employee.setSalary(450);
//		employee.setAddress("Mumbai");
//		employee.setDesignation("Worker");
//
//		shop = sService.searchShopById(1);
//		employee.setShop(shop);// <---
//
////		Single Employee Added
//		eService.addEmployee(employee);// <---
//
////		Employee details(2)
//		employee = new Employee();
//		employee.setName("Kapil P.");
//		employee.setDob(LocalDate.of(1997, 09, 10));
//		employee.setSalary(6000);
//		employee.setAddress("Pune");
//		employee.setDesignation("Sr. Consultant");
//
//		shop = sService.searchShopById(1);
//		employee.setShop(shop);// <---
//
//		list1.add(employee);// <---
//
////		Employee details(3)
//		employee = new Employee();
//		employee.setName("Prachi B.");
//		employee.setDob(LocalDate.of(1998, 11, 3));
//		employee.setSalary(10000);
//		employee.setAddress("Goa");
//		employee.setDesignation("Hr. Manager");
//
//		shop = sService.searchShopById(1);
//		employee.setShop(shop);// <---
//
//		list1.add(employee);// <---
//
////		Multiple/ List of Employees are added to Shop
//		sService.addEmployees(list1);// <---

////		4.
//		/* ITEM */
//
////		Item details (1)
//		item = new Item();
//		item.setCategory("Naturals Chocolate");
//		item.setManufacturing(LocalDate.of(2021, 12, 26));
//		item.setExpiry(LocalDate.of(2022, 1, 5));
//		item.setName("Naturals Dark chocolate");
//		item.setPrice(420);
//
//		shop = sService.searchShopById(1);
//		item.setShop(shop);// <---
//
////		Single item added to Shop
//		sService.addItem(item);// <---
//
////		Item details (2)
//		item = new Item();
//		item.setCategory("Naturals Orignal Chocolate");
//		item.setManufacturing(LocalDate.of(2022, 01, 10));
//		item.setExpiry(LocalDate.of(2022, 04, 05));
//		item.setName("Choco Orignal");
//		item.setPrice(529);
//
//		shop = sService.searchShopById(1);
//		item.setShop(shop);// <---
//
//		list2.add(item);// <---
//
////		Item details (3)
//		item = new Item();
//		item.setCategory("Naturals MallaiPista");
//		item.setManufacturing(LocalDate.of(2022, 03, 01));
//		item.setExpiry(LocalDate.of(2022, 05, 15));
//		item.setName("MallaiPista");
//		item.setPrice(150);
//
//		shop = sService.searchShopById(1);
//		item.setShop(shop);// <---
//
//		list2.add(item);// <---
//
////		Multiple/ List of  Item added to Shop
//		sService.addItems(list2);// <---

////		5.
//		/* USER ---> CUSTOMER ---> in SHOP */
//		user = new User();
//		user.setName("Chirag");
//		user.setPassword("Chirag@5639");
//		user.setType("Customer");
//
//		customer = new Customer();
//		customer.setEmail("chirag@gmail.com");
//		customer.setPhone("9875621485");
//		customer.setUser(user);// <---
//
//		shop = sService.searchShopById(1);
//		customer.setShop(shop);// <---
//
//		uService.addCustomer(customer);// <---

////		6.
//		/* ORDER ---> CUSTOMER ---> SHOP */
//		/*
//		 * because of insufficient information, I am not adding items to order Logic is
//		 * Quatity of items: when add to order, delete from shop Payment
//		 */
////		Order Details(1)
//		order = new OrderDetails();
//		order.setDateOfPurchase(LocalDate.of(2022, 3, 6));
//		order.setPaymentMode("BHIM UPI");
//		order.setTotal(5000);
//
//		customer = uService.searchCustomer(1);
//		order.setCustomer(customer);// <---
//
//		shop = sService.searchShopById(1);
//		order.setShop(shop);// <---
//
////		Single Order is added to Customer profile
//		oService.addOrder(order);// <---
//
////		Order Details(2)
//		order = new OrderDetails();
//		order.setDateOfPurchase(LocalDate.of(2022, 04, 22));
//		order.setPaymentMode("CASH PAYMENT");
//		order.setTotal(1000);
//
//		list3.add(order);// <---
//
////		Order Details(3)
//		order = new OrderDetails();
//		order.setDateOfPurchase(LocalDate.of(2022, 3, 16));
//		order.setPaymentMode("DEBIT CARD");
//		order.setTotal(4000);
//
//		list3.add(order);// <---
//
//		customer = uService.searchCustomer(1);
//		customer.setOrders(list3);// <---
//
////		Multiple/ List of Orders added to the Customer Profile
//		uService.updateCustomer(customer);// <---

		/* CRUD OPERATIONS */

	}

}
