
public class Ex072904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]mathScores = new int[2][3]; // 2행 3열 기준 작업 (new int = 배열의 대한 값 지정)
				for(int i=0; i<mathScores.length; i++) { //i = 행 ,i=3(length)보다 작다, i는 1씩 증가 
					for(int k=0; k<mathScores[i].length;k++) {//k = 열, k=i의 값보다 작다, k는 1씩 증가
						System.out.println("mathScores["+i+"]["+k+"]="
								+mathScores[i][k]); // 결과값이 0이 나오는 이유는 데이터를 넣지 않았기 때문
					}
				}
	
		System.out.println();
		

		
		int[][]englishScores = new int[2][];
		englishScores[0]= new int[2];
		englishScores[1]= new int[3]; //값이 지정 되있지 않은 경우(null 또는 0), 지정된 행 또는 열에만 행열 공간값 표시
				for(int i=0; i<englishScores.length; i++) {
					for(int k=0; k<englishScores[i].length;k++) {
						System.out.println("englishScores["+i+"]["+k+"]="
								+englishScores[i][k]);
	
					}
				}
				
		System.out.println();
		
		int[][]javaScores = { {95,80}, {92,96,80} };
			for(int i1=0; i1<javaScores.length; i1++) {
				for(int k1=0; k1<javaScores[i1].length; k1++) {
					System.out.println("javaScores["+i1+"]["+k1+"]="
							+javaScores[i1][k1]);			
						
					}
				}
			}
		}