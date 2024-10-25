package edu20240715;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class _05_SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new HashSet();
		
		set.add("정");
		set.add("재");
		set.add("민");
		set.add("정"); // 중복된 값 X
		
		// 순서X -> 값을 꺼낼 때 Iterator 클래스 활용 
		Iterator iter = set.iterator(); // HeshSet 클래스에 iterator()가 객체를 구해줌
		while(iter.hasNext()) { // hasNext(): Set에 값이 존재하는지 확인 			
			String str = (String)iter.next();
			System.out.print(str + " ");
		}
	}

}
