package interfaces;

import java.util.Scanner;

public class Test {
	
	public static void main(String args[]) {
		Scanner scan1 = new Scanner(System.in);	
		Doctor D1 = new Doctor();
		System.out.println("请输入第一位博士生的信息");
		
		System.out.println("姓名：");
		D1.Name= scan1.nextLine();
			
		System.out.println("性别：");
		D1.Sex= scan1.nextLine();
		
		System.out.println("年龄：");
		while(scan1.hasNextLine()) 
		if(scan1.hasNextInt()) {
			D1.Age = scan1.nextLine();
			break;
		}else {
			System.out.println("请输入数字");
			D1.Age = scan1.nextLine();
			continue;
			}
        System.out.println("每学期学费：");
        while(scan1.hasNextLine()) {
			if(scan1.hasNextInt()) {
				D1.f = scan1.nextLine();
				D1.fee  = Integer.parseInt(D1.f);
				break;
			}else {
				System.out.println("请输入数字");
				D1.f = scan1.nextLine();
				continue;
			}
        
		System.out.println("每月薪水：");
		System.out.println("学习学期：");
		while(scan1.hasNextLine()) {
			if(scan1.hasNextInt()) {
				D1.f = scan1.nextLine();
				D1.fee  = Integer.parseInt(D1.f);
				break;
			}else {
				System.out.println("请输入数字");
				D1.f = scan1.nextLine();
				continue;
			}
    	  }
		
		

		System.out.println("工作月份：");
		try	{	D1.m = scan1.nextLine();
        D1.month  = Integer.parseInt(D1.m);}
		catch(Exception eb) {
        System.out.println("请注意输入整型数字哦！！！");
        D1.month = scan1.nextInt();
        }
        System.out.println(D1);
        D1.QF();D1.QS();  
		}
         
   
		Scanner scan2 = new Scanner(System.in);
		Doctor D2 = new Doctor();
		System.out.println("请输入第二位博士生的信息");
		System.out.println("姓名：");
		D2.Name= scan2.nextLine();
		System.out.println("性别：");
		D2.Sex= scan2.nextLine();
		System.out.println("年龄：");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
				D2.Age = scan2.nextLine();
				break;
			}else {
				System.out.println("请输入整型数字哦！");
				D2.Age = scan2.nextLine();
				continue;
			}
		}
		System.out.println("每学期学费：");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
			    D2.f = scan2.nextLine();
			    D2.fee = Integer.parseInt(D2.f);
				break;
			}else {
				System.out.println("请输入整型数字哦！");
				D2.f = scan2.nextLine();
				continue;
			}
		}
		System.out.println("每月薪水：");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
			    D2.s = scan2.nextLine();
			    D2.salary = Integer.parseInt(D2.s);
				break;
			}else {
				System.out.println("请输入整型数字哦！");
				D2.s = scan2.nextLine();
				continue;
			}
		}
		System.out.println("学习学期：");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
				D2.t = scan2.nextLine();
				D2.term = Integer.parseInt(D2.t);
				break;
			}else {
				System.out.println("请输入整型数字哦！");
				D2.t = scan2.nextLine();
				continue;
			}
    	}
		System.out.println("工作月份：");
		try	{	D2.m = scan2.nextLine();
		        D2.month  = Integer.parseInt(D2.m);}
        catch(Exception eb) {
	        System.out.println("请注意输入整型数字哦！！！");
	        D2.month = scan2.nextInt();
        }
		System.out.println(D2);
		D2.QF();D2.QS();
        }
	}


		

	

