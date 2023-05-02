package main;

import java.util.Scanner;

import event.EventSevice;
import event.EventSeviceImpl;
import member.MemberService;
import member.MemberServiceImpl;



public class MainClass {
public static void main(String[] args) {
	EventSevice ev = new EventSeviceImpl();
	MemberService mem = new MemberServiceImpl();
   Scanner sc = new Scanner(System.in);
   int num ;
   
   while (true) {
      System.out.println("1.회원 이동");
      System.out.println("2. 이밴트 이동");
      System.out.print("--->");
      num = sc.nextInt();
      
      switch (num) {
      case 1:
    	  
    	  mem.inputName();
    	  mem.print();
         break;
      case 2:
    	  ev.monthEventView();
    	  ev.allEventView();
         break;
      }
   }
   

}

}