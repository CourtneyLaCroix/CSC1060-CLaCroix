import java.util.ArrayList;
import java.util.List;

public class TestSchoolRecords {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		Student student1 = new Student("John Smith", "301 Maple Ave", "970-123-4567", "JoSmith@random.com", 1);
		Student student2 = new Student("Jane Doe", "418 Mountain Dr", "719-321-7654", "JaDo@random.com", 4);

		Faculty faculty1 = new Faculty("Dr. Dude", "901 String CT", "555-555-5555", "thedude@dudes.com", 305, 76000.00,
				2000, "9:00am - 10:00am", 1);
		Faculty faculty2 = new Faculty("Mrs. Mayhem", "606 Homely Dr", "987-765-5432", "MAYhem@random.com", 101, 80000.00,
				1995, "11:00am - 12:00am", 2);

		Staff staff1 = new Staff("Brad Man", "123 Peach Ave", "970-695-1515", "BradTHEman@random.com", 212, 95000.00,
				2012, "Super Boss");
		Staff staff2 = new Staff("Britney Boss", "55 Ivory Lane", "970-453-1421", "bossbritney@random.com", 303, 100000.00,
				2020, "The Bestest Boss");

		persons.add(student1);
		persons.add(student2);
		persons.add(faculty1);
		persons.add(faculty2);
		persons.add(staff1);
		persons.add(staff2);

		for (Person p: persons) {
			printInfo(p);
		}

	}

	public static void printInfo(Person p) {
		if (p instanceof Student) {
			System.out.println(p.getName() + p.getAddress() + p.getPhoneNumber() + p.getEmailAddress() + 
					((Student) p).getStatus());
		}
		if (p instanceof Faculty) {
			System.out.println(p.getName() + p.getAddress() + p.getPhoneNumber() + p.getEmailAddress() 
					+ ((Employee) p).getOffice()+ ((Employee) p).getSalary() + ((Employee) p).getDateHired() 
					+ ((Faculty) p).getOfficeHours() + ((Faculty) p).getRank());
		}
		if (p instanceof Staff) {
			System.out.println(p.getName() + p.getAddress() + p.getPhoneNumber() + p.getEmailAddress() 
				+ ((Employee) p).getOffice()+ ((Employee) p).getSalary() + ((Employee) p).getDateHired() 
				+ ((Staff) p).getTitle());
		}		
	}

}
