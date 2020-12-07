# Experiment-3-jiekou

实验目的：
掌握Java中抽象类和抽象方法的定义； 
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
了解异常的使用方法，并在程序中根据输入情况做异常处理

实验内容：
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。

实验核心代码：
package interfaces;
import java.util.Scanner;
public class Graduate implements Student,Teacher{
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	
	public void setPay(double pay) {
	this.pay = pay * 30 * 12;
	System.out.println("您的年收入为：" + this.pay + "元");
	}
	public void getPay(double pay) {
		this.pay = pay * 30;
		System.out.println("您的月收入为：" + this.pay + "元");
		}
	public void setFee(double fee) {
		this.fee = fee; 
		System.out.println("您的学费为：" + this.fee + "元");
		}
	public void getFee(double fee) {
		this.fee = fee;
		System.out.println("您的学费为：" + this.fee + "元");
		}
	public boolean Loan(){
		if ((this.pay - this.fee) <42000) {
			System.out.println("您的年收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
			return true;
			}
		System.out.println("您的年收入" + this.pay + "元,减去学费" + this.fee +"元,减去"+ 42000 + "元,乘" + 0.03 + "等于" + (this.pay - this.fee - 3500)*0.03 + "元");//国家最新纳费收费标准
		return false;
		}
	public static void main(String[] args) {
		Graduate graduate = new Graduate();
		graduate.name = "李宗翰";
		System.out.println("您好:" + graduate.name);
		try {
		  Scanner input = new Scanner(System.in);
		// 设置月工资
		   System.out.println("请输入您的月工资：");
		   double pay = input.nextDouble();
		   graduate.setPay(pay);
		// 设置学费
		   System.out.println("请输入您的学费：");
		   double fee = input.nextDouble();
		   graduate.setFee(fee);
		      input.close();
		   // 判断是否缴纳税款
		  boolean flag = graduate.Loan();
		  if (flag) {
		   System.out.println("您无需缴税。");
		  }else {
		   System.out.println("您需要缴税"+(pay*12 - fee - 3500)*0.03+("元"));
		  }
		}catch(Exception e){
			System.out.println("输入数据格式有误!请输入纯数字。");
		  	}		 
		}
}

student接口：
package interfaces;
public interface Student {
	 public abstract void setFee(double fee);//缴纳学费的抽象方法
	 public abstract void getFee(double fee);//查询学费的抽象方法
	}
  
Teacher接口：
package interfaces;
public interface Teacher {
	 public abstract void setPay(double pay); //年收入查询
	 public abstract void getPay(double pay); //月收入查询
	}

实验结果：
您好:李宗翰
请输入您的月工资：
12000
您的年收入为：144000.0元
请输入您的学费：
4500
您的学费为：4500.0元
您的年收入144000.0元,减去学费4500.0元,减去42000元,乘0.03等于4080.0元
您需要缴税4080.0元

实验感想：
通过本次实验学习掌握接口的使用方法，完成以下要求：
1.在博士研究生类中实现各个接口定义的抽象方法;
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，
4.实例化研究生类时，采用Scanner类实现运行时交互式输入。
5.根据输入情况，要在程序中做异常处理。

本次实验接口方式比较简单，但是代码整体设计出现很多小的细节错误，
在完成代码之前，查阅了很多资料，（包括国家最新工资纳税标准）和同学交换思路，
最后实现实例化的过程中还是遇到了不少的困难；
总结的接口和抽象类的概念：
接口相当与一种特殊的类，里面全部是由全局变量和公共的抽象方法（abstract），
不含有构造方法。一个类可以实现多个接口，非抽象楼实现接口时必须实现接口中的全部方法；
抽象类中直接定义了一个或多个抽象方法；继承了一个继承父类，但没有实现父类中的抽象方法；
一个类实现了一个接口，但没有完全实现接口包含的抽象方法。

试错过程中经常报错，总结了以下三点：
1，抽象类不能实例化（即抽象类不能被new），
2，abstract与private不能同时使用
3，abstract不能修饰变量

通过看书和上网查阅，总结的抽象类与接口的相似处和主要区别：
相似处：
1，都不能被实例化，只能被其他类继承或实现
2，都可以包含抽象方法，抽象类的继承类与接口的实现类必须实现父类中的抽象方法
主要区别：
1，抽象类可以包含普通方法，接口不可以；
2，Java中一个类只能有一个直接父类，但一个类可以实现多个接口
3，设计目的区别，抽象类体现的是一种模板式设计，用户可以在这个基础上增加完善功能，
而接口体现的是一种规范，用户只能完成这个规范。


