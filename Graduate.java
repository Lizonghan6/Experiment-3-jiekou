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