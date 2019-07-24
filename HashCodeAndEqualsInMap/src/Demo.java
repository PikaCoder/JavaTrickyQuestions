import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		
		Map<Employee,String> map = new HashMap<Employee,String>();
		map.put(emp1, "Jack");
		map.put(emp2, "Rohan");
		
		System.out.println(map.size());
		System.out.println(map);
	}
}


class Employee{
	int eid;
	
	public Employee(int eid) {
		// TODO Auto-generated constructor stub
		this.eid = eid;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	
}
