package question7;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{

	String name;
	String department;
	int age;
	
	public Employee(){
		
	}
	
	public Employee(String name, String department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
//	public int compareTo(Employee o2) {
		
//		if(!this.getName().equals(o2.getName())) {
//			//return this.getName().compareTo(o2.getName());
//			return -1;
//		} else {
//			if(!this.getDepartment().equals(o2.getDepartment())){
//		//	return this.getDepartment().compareTo(o2.getDepartment());	
//				return 1;
//			}else {
//				//return this.getAge() - o2.getAge();
//				return 0;
//			}
//		}
	
	public int compare(Employee o1, Employee o2){
		int nameInt = o1.getName().compareTo(o2.getName());
		int deptInt = o1.getDepartment().compareTo(o2.getDepartment());
		
		if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        else if (o1.getAge() > o2.getAge()) {
            return 1;
        }		
        else if(nameInt < 0){
        	return -1;
        }
        else if (nameInt > 0) {
			return 1;
		}
        else if (deptInt < 0) {
			return -1;
		}
        else if(deptInt > 0){
			return 1;
		}return 0;
	}
	
	@Override
public String toString() {
	return "Employee [name=" + name + ", department=" + department + ", age=" + age + "]";
}
	
}