package lab8.adapterpattern;

public class AdapterTester {
	public static void main(String[] args) {
	
		SimpleName simp = new SimpleName();
		
		simp.setName("Tori McDonald");
		
		SimpleNametoFullNameAdapter fullName = new SimpleNametoFullNameAdapter(simp);
	
		System.out.println(fullName.getFirstName()); //Display the first name 
		System.out.println(fullName.getLastName()); //Display the last name**/
	}
}
