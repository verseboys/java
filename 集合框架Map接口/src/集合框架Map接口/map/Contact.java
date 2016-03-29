package 集合框架Map接口.map;
/*
 * 联系人
 */
public class Contact 
{
	private String name;
	private String phoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
