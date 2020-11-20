package test;

public class hello {
	
	private Integer id;
	private String name;
	private String branch;
	private String email;
	
	public hello(Integer id,String name,String branch,String email) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.email = email;
	}
	public hello() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "User [id=" + id + ", name=" + name + "branch=" + branch + "email=" + email + "]";
	}
	
//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public String sayhelloHTML(@QueryParam("num") int num) {
//		System.out.println("Number is = " + num);
//		String res = "";
//		if(num==3) {
//			res = "<h1>Data is "+num+"</h1>";
//		}
//		return res;
//	}
	
}
