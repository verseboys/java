package 泛型.generic;
/*
 * 定义泛型上限
 */
public class Children2 <T extends Number>
{
	private String name;
	private T age; //T:表示类型，泛指所有类型
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Children [name=" + name + ", age=" + age + "]";
	}
	public Children2(String name, T age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Children2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
