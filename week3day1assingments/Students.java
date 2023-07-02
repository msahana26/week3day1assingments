package week3day1assingments;

public class Students {
	
	public void getStudentInfo(String id) {
		System.out.println(id);
	}
	public void getStudentInfo(String id,String name) {
		System.out.println(id +"       " + name);
	}
	public void getStudentInfo(String emailid,long phoneno) {
		
		System.out.println(emailid+ "  "+phoneno);
	}
	
	public static void main(String[] args) {
		
		Students obj = new Students();
		
		obj.getStudentInfo("CBE11567");
		obj.getStudentInfo("CBE11567","vinu");
		obj.getStudentInfo("xyz@gmail.com", 9123456789l);
	}
}