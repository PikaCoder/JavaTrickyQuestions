import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContractBetweenHashCodeAndEquals {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "siva", "JavaTechie1");
		Employee emp2 = new Employee(101, "siva", "JavaTechie1");
		Employee emp3 = new Employee(102, "tom", "JavaTechie2");
		Employee emp4 = new Employee(103, "Bill", "JavaTechie3");
		Employee emp5 = emp1;
		
		
		System.out.println(emp5.equals(emp1));
		System.out.println("HashCode for emp1"+emp1.hashCode());
		System.out.println("HashCode for emp2"+emp2.hashCode());
		System.out.println("HashCode for emp3"+emp3.hashCode());
		System.out.println("HashCode for emp4"+emp4.hashCode());
		
		System.out.println("Printing Employee Objects from HashSet");
		Set<Employee> empSet = new HashSet<>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		
		for(Employee emp:empSet){
			System.out.println(emp);
		}
		
		
		Map<Employee,Employee> empMap = new HashMap<>();
		empMap.put(emp1, emp1);
		empMap.put(emp2, emp2);
		empMap.put(emp3, emp3);
		empMap.put(emp4, emp4);
		
		System.out.println("Printing Employee Objects From HashMap");
		for(Map.Entry<Employee, Employee> emp: empMap.entrySet()){
			System.out.println("Key is "+emp.getKey()+"---> value is "+emp.getValue());
		}
		System.out.println(empMap.get(emp2));
	}
}
