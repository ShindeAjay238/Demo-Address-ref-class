package imuutableDemo;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainApp {
	
	public static void main(String[] args) {
		
		Address address=new Address();
		address.setStreet("MIDC ROAD");
		address.setZipcode(413512L);
		address.setAddressLine1("Adderss line 1  near line 2");
		address.setAddressLine2("near to address line 1");
		
		Set<String> skills=new LinkedHashSet<>();
		skills.add("Spring");
		skills.add("hibernate");
		skills.add("java");
		
		
		Date dob = null;
		try {
			dob = MyUtil.stringToDate("20/06/1992");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Employee employee=new Employee(010, "Ajay"," ajayshidne238@gmail.com", dob, skills, address);
		System.out.println();
		
	
	System.out.println("ID:"+employee.getId());
	System.out.println("Name:"+employee.getName());
	System.out.println("Email:"+employee.getEmail());
	System.out.println("DOB:"+employee.getDob());
	System.out.println("Skills:"+employee.getSkills());
	System.out.println("Employee Address::::");
	System.out.println("Street:"+address.getStreet());
	System.out.println("ZipCode:"+address.getZipcode());
	System.out.println("AddressLine1:"+address.getAddressLine1());
	System.out.println("AddressLine2:"+address.getAddressLine2());
	
	
	System.out.println("------------------------------------------------------------");
	
	employee.getAddress().setStreet("Samarth Nagar");
	
	employee.getDob().setTime(new Date().getTime());
	
	employee.getSkills().add("Spring Boot");
			
	System.out.println("ID:"+employee.getId());
	System.out.println("Name:"+employee.getName());
	System.out.println("Email:"+employee.getEmail());
	System.out.println("DOB:"+employee.getDob());
	System.out.println("Skills:"+employee.getSkills());
	System.out.println("Employee Address::::");
	System.out.println("Street:"+address.getStreet());
	System.out.println("ZipCode:"+address.getZipcode());
	System.out.println("AddressLine1:"+address.getAddressLine1());
	System.out.println("AddressLine2:"+address.getAddressLine2());
}
}




