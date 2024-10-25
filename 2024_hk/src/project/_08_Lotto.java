package project;

public class _08_Lotto {
	
public static int[] Lotto() {
		
		int[] lottoNum = new int[7];
		
		for (int i=0; i<7; i++) {
			int	r = (int)(Math.random()*45+1);
			for (int j = 0; j < i; j++) {
				while (lottoNum[j] == r)
					r = (int)(Math.random()*45+1);
			}
			lottoNum[i] = r;
			if (i == 6)
				System.out.print("+ " + lottoNum[i]);
			else System.out.print(lottoNum[i]+ " ");
		}
		System.out.println();
		return lottoNum;
	}

public static int[][] LottoStore(int t) {
	int[][] totalLotto = new int[t][6];
	for (int i = 0; i < t; i++)
		totalLotto[i] = Lotto();
	
	return totalLotto;
}

public void LottoResult(int[] lottoNum) {
	System.out.println("\n당첨 결과 ");
	
	int[] result = {10, 15, 24, 30, 31, 37};
	int count = 0;
	
	for(int i=0; i<6; i++) {
		for (int j =0; j<6; j++)
			if (result[j] == lottoNum[i])
				count++;	
	}
	if (count == 6)
		System.out.println("1등 ");
	else if (count == 5 && lottoNum[6] == 32)
		System.out.println("2등 ");
	else if (count == 5)
		System.out.println("3등 ");
	else if (count == 4)
		System.out.println("4등 ");
	else if (count == 3)
		System.out.println("5등 ");
	else 
		System.out.println("꽝");
}

public void LottoResult(int[][] lottoNum) {
	System.out.println("\n당첨 결과 ");

	int[] result = {10, 15, 24, 30, 31, 37};
	
	for(int i=0; i<lottoNum.length; i++) {
		int count = 0;
		for (int j=0; j<6; j++)
			for (int k=0; k<6; k++)
				if (result[k] == lottoNum[i][j])
					count++;
		if (count == 6)
			System.out.println((i+1) + ": 1등");
		else if (count == 5 && lottoNum[i][6] == 32)
			System.out.println((i+1) + ": 2등 ");
		else if (count == 5)
			System.out.println((i+1) + ": 3등 ");
		else if (count == 4)
			System.out.println((i+1) + ": 4등 ");
		else if (count == 3)
			System.out.println((i+1) + ": 5등 ");
		else 
			System.out.println((i+1) + ": 꽝");
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_08_Lotto lotto = new _08_Lotto();
		
		System.out.println("당첨 번호\n10 15 24 30 31 37 + 32\n\n구매 번호");
		
		lotto.LottoResult(LottoStore(5));
		
//		int[] one = {10, 15, 24, 30, 31, 37, 32};
//		lotto.LottoResult(one);
	}

}
