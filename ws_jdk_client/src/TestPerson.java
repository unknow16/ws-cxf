import java.util.List;

import com.fuyi.person.Person;
import com.fuyi.person.PersonService;
import com.fuyi.person.PersonServiceService;

public class TestPerson {

	public static void main(String[] args) {
		PersonServiceService personServiceService = new PersonServiceService();
		PersonService personServicePort = personServiceService.getPersonServicePort();
		
		Person person = new Person();
		person.setId(123);
		person.setAge(22);
		person.setPassword("pass");
		person.setUsername("name");
		personServicePort.addPerson(person);
		
		List<Person> list = personServicePort.getAllPerson();
		for (Person p : list) {
			System.out.println("id=" + p.getId() + ", age=" + p.getAge() + ",pass=" + p.getPassword() + ", name=" + p.getUsername());
		}
	}
}
