//package com.example.InherintanceMapping;
//
//import com.example.InherintanceMapping.singlemap.Singletable.entity.Check;
//import com.example.InherintanceMapping.singlemap.Singletable.entity.Credit;
//import com.example.InherintanceMapping.singlemap.Singletable.repo.PaymentDao;
//import com.example.InherintanceMapping.componentMapping.entity.Address;
//import com.example.InherintanceMapping.componentMapping.entity.Employee;
//import com.example.InherintanceMapping.componentMapping.repo.EmployeeRepo;
//import com.example.InherintanceMapping.joined.entity.CheckJoined;
//import com.example.InherintanceMapping.joined.entity.CreditJoined;
//import com.example.InherintanceMapping.joined.repo.PaymentDaoJ;
//import com.example.InherintanceMapping.pertable.entity.CheckPerTable;
//import com.example.InherintanceMapping.pertable.entity.CreditPerTable;
//import com.example.InherintanceMapping.pertable.repo.PaymentDaoP;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class InherintanceMappingApplicationTests {
//	@Autowired
//	PaymentDao paymentDao;
//
//	@Autowired
//	PaymentDaoJ paymentJDao;
//
//	@Autowired
//	PaymentDaoP paymentDaoP;
//
//
//	@Autowired
//	EmployeeRepo employeeRepo;
//
//	@Test
//	void contextLoads() {
//	}
//
//
//	// tests for single class.
//
//	@Test
//	public void test_Create1(){
//		Check c1 =new Check("22w");
//		c1.setId(1);
//		c1.setAmount(2000);
//		c1.setCheckNo("122344");
//		paymentDao.save(c1);
//
//	}
//	@Test
//	public void test_Create2(){
//		Credit c1= new Credit("33we");
//		c1.setId(3);
//		c1.setAmount(2321);
//		c1.setCreditNo("13313");
//		paymentDao.save(c1);
//	}
//
//	// test for table class
//
//	@Test
//	public void test_CreateT1(){
//		CreditPerTable c1= new CreditPerTable("1222");
//		c1.setId(232);
//		c1.setAmount(2341);
//		paymentDaoP.save(c1);
//	}
//
//	@Test
//	public void test_CreateT12(){
//		CheckPerTable c1= new CheckPerTable("1222");
//		c1.setId(424);
//		c1.setAmount(5341);
//		paymentDaoP.save(c1);
//	}
//
//	// test for joined
//
//	@Test
//	public void test_CreateJ1(){
//		CreditJoined c1= new CreditJoined("21342");
//		c1.setId(2323243);
//		c1.setAmount(23431);
//		paymentJDao.save(c1);
//	}
//
//	@Test
//	public void test_CreateJ12(){
//		CheckJoined c1= new CheckJoined("67742");
//		c1.setId(42433);
//		c1.setAmount(534321);
//		paymentJDao.save(c1);
//	}
//	@Test
//	public void test_CreateComponent(){
//		Employee e1 = new Employee();
//		e1.setId(21);
//		e1.setName("Daksh");
//		e1.setAd(new Address("delhi","A-17","Shahdara"));
//		employeeRepo.save(e1);
//
//
//	}
//
//
//}
