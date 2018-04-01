package com.capgemini.entity;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OrderDetailsEntityTest</code> contains tests for the class <code>{@link OrderDetailsEntity}</code>.
 *
 * @generatedBy CodePro at 2/7/18 10:59 AM
 * @author msisodia
 * @version $Revision: 1.0 $
 */
public class OrderDetailsEntityTest {
	/**
	 * Run the OrderDetailsEntity() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Test
	public void testOrderDetailsEntity_1()
		throws Exception {

		OrderDetailsEntity result = new OrderDetailsEntity();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
		assertEquals(null, result.getProductName());
		assertEquals(null, result.getProductId());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getQuantity());
	}

	/**
	 * Run the OrderDetailsEntity(Long,Long,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Test
	public void testOrderDetailsEntity_2()
		throws Exception {
		Long id = new Long(1L);
		String productId = "";
		String productName = "";
		int price = 1;
		int quantity = 1;

		OrderDetailsEntity result = new OrderDetailsEntity(id, productId, productName, price, quantity);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Long(1L), result.getId());
		assertEquals("", result.getProductName());
		assertEquals(new Long(1L), result.getProductId());
		assertEquals(1, result.getPrice());
		assertEquals(1, result.getQuantity());
	}

	/**
	 * Run the Long getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);

		Long result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);

		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Long getProductId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Test
	public void testGetProductId_1()
		throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);

		String result = fixture.getProductId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		//assertEquals((byte) 1, result.byteValue());
		//assertEquals((short) 1, result.shortValue());
		//assertEquals(1, result.intValue());
		//assertEquals(1L, result.longValue());
		//assertEquals(1.0f, result.floatValue(), 1.0f);
		//assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the String getProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Test
	public void testGetProductName_1()
		throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);

		String result = fixture.getProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getQuantity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Test
	public void testGetQuantity_1()
		throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);

		int result = fixture.getQuantity();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);
		Long id = new Long(1L);

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);
		int price = 1;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the void setProductId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Test
	public void testSetProductId_1()
		throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);
		String productId="";

		fixture.setProductId(productId);

		// add additional test code here
	}

	/**
	 * Run the void setProductName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Test
	public void testSetProductName_1()
		throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);
		String productName = "";

		fixture.setProductName(productName);

		// add additional test code here
	}

	/**
	 * Run the void setQuantity(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Test
	public void testSetQuantity_1()
		throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);
		int quantity = 1;

		fixture.setQuantity(quantity);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2/7/18 10:59 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OrderDetailsEntityTest.class);
	}
}