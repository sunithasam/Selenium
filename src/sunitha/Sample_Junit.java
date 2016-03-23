package sunitha;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sample_Junit {
	@After
	public void after()
	{
		System.out.println("This is After Method");
	}
	
	@Test
	public void test()
	{
		System.out.println("This is Test Method");
	}
	@Test
	public void test1()
	{
		System.out.println("This is Test1 Method");
	}
	@Test
	public void test2()
	{
		System.out.println("This is Test2 Method");
	}
	@Test
	public void test3()
	{
		System.out.println("This is Test3 Method");
	}
	@Test
	public void test4()
	{
		System.out.println("This is Test4 Method");
	}
	@Before
	public void before()
	{
		System.out.println("This is Before Method");
	}
	
	
	

	
	
	
	

}
