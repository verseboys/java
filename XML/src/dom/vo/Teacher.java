package dom.vo;

/*
 * VO��value object
 */
public class Teacher 
{
	private int id;
	private String name;
	private String desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}
	public Teacher(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
