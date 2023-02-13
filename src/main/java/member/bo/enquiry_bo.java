package member.bo;

public class enquiry_bo {
	 public int id;
	 public String first_name;
	   public String last_name;  
	   public String current_weight;
	   public String bmi;  
	   public String age; 
	   public String goal_weight;
	     public String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getCurrent_weight() {
		return current_weight;
	}
	public void setCurrent_weight(String current_weight) {
		this.current_weight = current_weight;
	}
	public String getBmi() {
		return bmi;
	}
	public void setBmi(String bmi) {
		this.bmi = bmi;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGoal_weight() {
		return goal_weight;
	}
	public void setGoal_weight(String goal_weight) {
		this.goal_weight = goal_weight;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String emai) {
		this.email = emai;
	}
	public enquiry_bo(String first_name, String last_name, String current_weight, String bmi, String age,
			String goal_weight, String emai) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.current_weight = current_weight;
		this.bmi = bmi;
		this.age = age;
		this.goal_weight = goal_weight;
		this.email = emai;
	}
	public enquiry_bo() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "enquiry_bo [first_name=" + first_name + ", last_name=" + last_name + ", current_weight="
				+ current_weight + ", bmi=" + bmi + ", age=" + age + ", goal_weight=" + goal_weight + ", emai=" + email
				+ ", getFirst_name()=" + getFirst_name() + ", getLast_name()=" + getLast_name()
				+ ", getCurrent_weight()=" + getCurrent_weight() + ", getBmi()=" + getBmi() + ", getAge()=" + getAge()
				+ ", getGoal_weight()=" + getGoal_weight() + ", getEmai()=" + getEmail() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
     
     
     
     
     
     
     
     
     
     
     
     

}
