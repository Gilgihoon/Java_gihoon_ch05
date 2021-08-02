
public class Ex073003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88} // 해당행은 3줄 = 3행
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0; // 전체 개수를 세는 함수 (작업환경에서 즉각 카운팅 가능하도록 사용)
		for(int i =0; i<array.length; i++) { // length는 배열값 최대 3. 
			for(int j=0; j<array[i].length; j++) { //각각의 칸의 값
				sum+=array[i][j];
				count++;
			}
		}
		avg=(double)sum/count; // double 작성함으로 소수점까지 구현.해당 (double)없이도 구현가능하나 0으로만 표시
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
