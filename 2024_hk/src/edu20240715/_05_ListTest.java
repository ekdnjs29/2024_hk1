package edu20240715;

import java.util.ArrayList;
import java.util.List;

public class _05_ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 제네릭: 형변환을 미리 해주는 개념
		List<String> list = new ArrayList<>();
		
		list.add("정"); // 값을 저장하면 자동으로 저장공간과 인덱스 생성 
		list.add("재");
		list.add("민");
		
		String str ="";
		for (int i=0; i<list.size(); i++) 
			str += list.get(i);
		System.out.println(str);
		
		list.remove(0); // 특정 인덱스 값 삭제 
		for (int i=0; i<list.size(); i++)
			System.out.print(list.get(i));
		
//		list.clear(); // 모두 삭제 
	}

}
