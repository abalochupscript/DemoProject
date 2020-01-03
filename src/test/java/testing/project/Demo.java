package testing.project;

/**
 * Test class
 */
public class Demo {

	public void testOne() {
		System.out.println("First method executed successfully");
	}

	public void testTwo() {
		int value = 20;
		assert value < 10: "Value is greater than 10";
		System.out.println("Third method executed successfully");
	}

	public void testThree() {
		System.out.println("Second method executed successfully");
	}
}
