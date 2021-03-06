package 装饰者模式.decorator;

public class Test 
{

	public static void main(String[] args) 
	{
		//生产一杯豆酱
		Drink soya = new SoyaBeanMilk();
		//在豆浆中加鸡蛋
		EggDecorator eggSoya  = new EggDecorator(soya);
		//在加了鸡蛋的豆浆中加糖
		SugarDecorator sugarEggSoya = new SugarDecorator(eggSoya);
		//在加了鸡蛋和糖的豆浆中加黑豆
		BlackBeanDecorator blackBeanSugarEggSoya =  new BlackBeanDecorator(sugarEggSoya);
		
		//结账
		System.out.println("同志，您点的是："+blackBeanSugarEggSoya.description());
		System.out.println("你一共消费了："+blackBeanSugarEggSoya.cost()+"元");
		
	}

}
