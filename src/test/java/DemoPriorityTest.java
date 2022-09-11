import org.testng.annotations.Test;

public class DemoPriorityTest {

	@Test(invocationCount = 5)
	public void orgTest() {
		System.out.println("organisation created");
	}
	@Test(enabled = false)
	public void industryTest() {
		System.out.println("organisation with Industry created");
	}
	@Test
	public void ContactTest() {
		System.out.println("Contact created");
	}

}
