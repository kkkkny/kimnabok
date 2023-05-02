package member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServiceImpl implements MemberService{
	Scanner input = new Scanner(System.in);
	ArrayList<String> arr = new ArrayList<>();
	String name = null;
	
	public void inputName() {		
		System.out.print("저장할 이름을 입력해주세요: ");
        String name = input.next();
        arr.add(name);
	}
	
	public void print() {		
		System.out.println(arr.size()+"명");
	}
}
