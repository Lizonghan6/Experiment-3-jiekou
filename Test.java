package interfaces;

import java.util.Scanner;

public class Test {
	
	public static void main(String args[]) {
		Scanner scan1 = new Scanner(System.in);	
		Doctor D1 = new Doctor();
		System.out.println("�������һλ��ʿ������Ϣ");
		
		System.out.println("������");
		D1.Name= scan1.nextLine();
			
		System.out.println("�Ա�");
		D1.Sex= scan1.nextLine();
		
		System.out.println("���䣺");
		while(scan1.hasNextLine()) 
		if(scan1.hasNextInt()) {
			D1.Age = scan1.nextLine();
			break;
		}else {
			System.out.println("����������");
			D1.Age = scan1.nextLine();
			continue;
			}
        System.out.println("ÿѧ��ѧ�ѣ�");
        while(scan1.hasNextLine()) {
			if(scan1.hasNextInt()) {
				D1.f = scan1.nextLine();
				D1.fee  = Integer.parseInt(D1.f);
				break;
			}else {
				System.out.println("����������");
				D1.f = scan1.nextLine();
				continue;
			}
        
		System.out.println("ÿ��нˮ��");
		System.out.println("ѧϰѧ�ڣ�");
		while(scan1.hasNextLine()) {
			if(scan1.hasNextInt()) {
				D1.f = scan1.nextLine();
				D1.fee  = Integer.parseInt(D1.f);
				break;
			}else {
				System.out.println("����������");
				D1.f = scan1.nextLine();
				continue;
			}
    	  }
		
		

		System.out.println("�����·ݣ�");
		try	{	D1.m = scan1.nextLine();
        D1.month  = Integer.parseInt(D1.m);}
		catch(Exception eb) {
        System.out.println("��ע��������������Ŷ������");
        D1.month = scan1.nextInt();
        }
        System.out.println(D1);
        D1.QF();D1.QS();  
		}
         
   
		Scanner scan2 = new Scanner(System.in);
		Doctor D2 = new Doctor();
		System.out.println("������ڶ�λ��ʿ������Ϣ");
		System.out.println("������");
		D2.Name= scan2.nextLine();
		System.out.println("�Ա�");
		D2.Sex= scan2.nextLine();
		System.out.println("���䣺");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
				D2.Age = scan2.nextLine();
				break;
			}else {
				System.out.println("��������������Ŷ��");
				D2.Age = scan2.nextLine();
				continue;
			}
		}
		System.out.println("ÿѧ��ѧ�ѣ�");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
			    D2.f = scan2.nextLine();
			    D2.fee = Integer.parseInt(D2.f);
				break;
			}else {
				System.out.println("��������������Ŷ��");
				D2.f = scan2.nextLine();
				continue;
			}
		}
		System.out.println("ÿ��нˮ��");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
			    D2.s = scan2.nextLine();
			    D2.salary = Integer.parseInt(D2.s);
				break;
			}else {
				System.out.println("��������������Ŷ��");
				D2.s = scan2.nextLine();
				continue;
			}
		}
		System.out.println("ѧϰѧ�ڣ�");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
				D2.t = scan2.nextLine();
				D2.term = Integer.parseInt(D2.t);
				break;
			}else {
				System.out.println("��������������Ŷ��");
				D2.t = scan2.nextLine();
				continue;
			}
    	}
		System.out.println("�����·ݣ�");
		try	{	D2.m = scan2.nextLine();
		        D2.month  = Integer.parseInt(D2.m);}
        catch(Exception eb) {
	        System.out.println("��ע��������������Ŷ������");
	        D2.month = scan2.nextInt();
        }
		System.out.println(D2);
		D2.QF();D2.QS();
        }
	}


		

	

