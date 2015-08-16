import java.util.HashSet;
import java.util.Set;


public class MainApp {
public static void main(String[] args) {
	Set<Employee> s=new HashSet<Employee>();
	Employee e=new Employee();
	Employee e2=new Employee();
	s.add(e2);
	s.add(e);
	System.out.println(s);
	System.out.println("hello");
}
}
