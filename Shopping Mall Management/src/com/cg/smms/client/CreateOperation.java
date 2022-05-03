package com.cg.smms.client;

import java.time.LocalDate;
import java.util.*;

import com.cg.smms.entities.*;
import com.cg.smms.services.*;

@SuppressWarnings("unused")
public class CreateOperation {


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

		/* USER ----> MALL ADMIN ----> MALL */
		/* User */
		user = new User();
		user.setName("Sweta");
		user.setPassword("1234");
		user.setType("Mall Admin");
		/* uService.addNewUser(user); */// <---

		/* MallAdmin */
		mallAdmin = new MallAdmin();
		mallAdmin.setPhone("123456789");
		mallAdmin.setUser(user);// <---
		/* aService.addMallAdmin(mallAdmin); */// <---

		/* Mall */
		mall = new Mall();
		mall.setMallName("Grover mart");
		mall.setLocation("Ranchi");
		mall.setCategories("All");
		mall.setMallAdmin(mallAdmin);

		aService.addMall(mall);// <---

		/* USER ----> SHOP OWNER ----> SHOP */
		user = new User();
		user.setName("Anu");
		user.setPassword("anu@123");
		user.setType("Shop Owner");

		shopOwner = new ShopOwner();
		shopOwner.setDob(LocalDate.of(2000, 1, 1));
		shopOwner.setAddress("Ranchi");
		shopOwner.setUser(user);// <---

		shop = new Shop();
		shop.setShopCategory("Ice-cream");
		shop.setShopName("The Sweet Course");
		shop.setShopStatus("OPEN");
		shop.setLeaseStatus("Pending");
		shop.setMall(mall);// <---
		
//		shopOwner set shop 
		shopOwner.setShop(shop);// <---
		sService.addShopOwner(shopOwner);
		
		/* EMPLOYEE */
//	Employee details(1)
	employee = new Employee();
	employee.setName("Emp1");
	employee.setDob(LocalDate.of(1997, 1, 1));
	employee.setSalary(8000);
	employee.setAddress("Ranchi");
	employee.setDesignation("Worker");

	shop = sService.searchShopById(1);
	employee.setShop(shop);// <---

//	Single Employee Added
	eService.addEmployee(employee);// <---

//	Employee details(2)
	employee = new Employee();
	employee.setName("Emp2");
	employee.setDob(LocalDate.of(1996, 1, 1));
	employee.setSalary(8000);
	employee.setAddress("Ranchi");
	employee.setDesignation("CA");

	shop = sService.searchShopById(1);
	employee.setShop(shop);// <---

	list1.add(employee);// <---

//	Employee details(3)
	employee = new Employee();
	employee.setName("Emp3");
	employee.setDob(LocalDate.of(1995, 1, 1));
	employee.setSalary(10000);
	employee.setAddress("Pune");
	employee.setDesignation("Manager");

	shop = sService.searchShopById(1);
	employee.setShop(shop);// <---

	list1.add(employee);// <---

//	Multiple/ List of Employees are added to Shop
	sService.addEmployees(list1);// <---

	/* ITEM */

//			Item details (1)
	item = new Item();
	item.setCategory("French Ice Creams");
	item.setManufacturing(LocalDate.of(2022, 05, 05));
	item.setExpiry(LocalDate.of(2022, 1, 5));
	item.setName("Vanilla");
	item.setPrice(150);

	shop = sService.searchShopById(1);
	item.setShop(shop);// <---

//			Single item added to Shop
	sService.addItem(item);// <---

//			Item details (2)
	item = new Item();
	item.setCategory("Light Ice Creams");
	item.setManufacturing(LocalDate.of(2022, 05, 05));
	item.setExpiry(LocalDate.of(2022, 01, 05));
	item.setName("light Vanilla bean");
	item.setPrice(199);

	shop = sService.searchShopById(1);
	item.setShop(shop);// <---

	list2.add(item);// <---

//			Item details (3)
	item = new Item();
	item.setCategory("Organic Ice Creams");
	item.setManufacturing(LocalDate.of(2022, 01, 01));
	item.setExpiry(LocalDate.of(2022, 01, 05));
	item.setName("Blue Bell Lactose");
	item.setPrice(359);

	shop = sService.searchShopById(1);
	item.setShop(shop);// <---

	list2.add(item);// <---

//			Multiple/ List of  Item added to Shop
	sService.addItems(list2);// <---

		/* USER ---> CUSTOMER ---> in SHOP */
	user = new User();
	user.setName("Vismay");
	user.setPassword("vismay@123");
	user.setType("Customer");

	customer = new Customer();
	customer.setEmail("vismay@gmail.com");
	customer.setPhone("3456789");
	customer.setUser(user);// <---

	shop = sService.searchShopById(1);
	customer.setShop(shop);// <---

	uService.addCustomer(customer);// <---

		/* ORDER ---> CUSTOMER ---> SHOP */
		/*
		 * because of insufficient information, I am not adding items to order Logic is
		 * Quatity of items: when add to order, delete from shop Payment
		 */
//		Order Details(1)
		order = new OrderDetails();
		order.setDateOfPurchase(LocalDate.of(2022, 01, 01));
		order.setPaymentMode("UPI");
		order.setTotal(1000);

		customer = uService.searchCustomer(1);
		order.setCustomer(customer);// <---

		shop = sService.searchShopById(1);
		order.setShop(shop);// <---

//		Single Order is added to Customer profile
		oService.addOrder(order);// <---

//		Order Details(2)
		order = new OrderDetails();
		order.setDateOfPurchase(LocalDate.of(2022, 01, 05));
		order.setPaymentMode("CASH");
		order.setTotal(1000);
		
		customer = uService.searchCustomer(1);
		order.setCustomer(customer);// <---
		shop = sService.searchShopById(1);
		order.setShop(shop);// <---
		
		list3.add(order);// <---

//		Order Details(3)
		order = new OrderDetails();
		order.setDateOfPurchase(LocalDate.of(2022, 01, 05));
		order.setPaymentMode("CASH");
		order.setTotal(1000);
		
		customer = uService.searchCustomer(1);
		order.setCustomer(customer);// <---
		shop = sService.searchShopById(1);
		order.setShop(shop);// <---
		
		list3.add(order);// <---

		customer = uService.searchCustomer(1);
		customer.setOrders(list3);// <---

//		Multiple/ List of Orders added to the Customer Profile
		uService.updateCustomer(customer);// <---

	}

}
