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
	System.out.println("����������Ϊ��" + this.pay + "Ԫ");
	}
	public void getPay(double pay) {
		this.pay = pay * 30;
		System.out.println("����������Ϊ��" + this.pay + "Ԫ");
		}
	public void setFee(double fee) {
		this.fee = fee; 
		System.out.println("����ѧ��Ϊ��" + this.fee + "Ԫ");
		}
	public void getFee(double fee) {
		this.fee = fee;
		System.out.println("����ѧ��Ϊ��" + this.fee + "Ԫ");
		}
	public boolean Loan(){
		if ((this.pay - this.fee) <42000) {
			System.out.println("����������" + this.pay + ",��ȥѧ��" + this.fee + "����" + (this.pay - this.fee));
			return true;
			}
		System.out.println("����������" + this.pay + "Ԫ,��ȥѧ��" + this.fee +"Ԫ,��ȥ"+ 42000 + "Ԫ,��" + 0.03 + "����" + (this.pay - this.fee - 3500)*0.03 + "Ԫ");//���������ɷ��շѱ�׼
		return false;
		}
	public static void main(String[] args) {
		Graduate graduate = new Graduate();
		graduate.name = "���ں�";
		System.out.println("����:" + graduate.name);
		try {
		  Scanner input = new Scanner(System.in);
		// �����¹���
		   System.out.println("�����������¹��ʣ�");
		   double pay = input.nextDouble();
		   graduate.setPay(pay);
		// ����ѧ��
		   System.out.println("����������ѧ�ѣ�");
		   double fee = input.nextDouble();
		   graduate.setFee(fee);
		      input.close();
		   // �ж��Ƿ����˰��
		  boolean flag = graduate.Loan();
		  if (flag) {
		   System.out.println("�������˰��");
		  }else {
		   System.out.println("����Ҫ��˰"+(pay*12 - fee - 3500)*0.03+("Ԫ"));
		  }
		}catch(Exception e){
			System.out.println("�������ݸ�ʽ����!�����봿���֡�");
		  	}		 
		}
}