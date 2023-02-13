package member.bo;

public class membership_bo {
	 private int id;
	private String name;
	 private String email;
	 private String contact_no;
	 private String loc;
	 private  String doj;
	  private String pack;
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getPack() {
		return pack;
	}
	public void setPack(String pack) {
		this.pack = pack;
	}
	public membership_bo(String name, String email, String contact_no, String loc, String doj, String pack) {
		super();
		this.name = name;
		this.email = email;
		this.contact_no = contact_no;
		this.loc = loc;
		this.doj = doj;
		this.pack = pack;
	}
	public membership_bo() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "membership_bo [name=" + name + ", email=" + email + ", contact_no=" + contact_no + ", loc=" + loc
				+ ", doj=" + doj + ", pack=" + pack + "]";
	}
	  
	  
	  
	
	
}
