import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private String gender;
	private int salary;
	private Date hiredate;
	
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
	
	public Emp(String name, int age, String gender, int salary, Date hiredate){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Date getHiredate() {
		return hiredate;
	}


	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "姓名："+ getName()+ " , " + "年龄：" + getAge() + " , " + "性别：" + getGender() + " , " + "薪资：" + getSalary() + " , " + "入职时间:" + getHiredate();
	}

}
