
public class Ex072904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]mathScores = new int[2][3]; // 2�� 3�� ���� �۾� (new int = �迭�� ���� �� ����)
				for(int i=0; i<mathScores.length; i++) { //i = �� ,i=3(length)���� �۴�, i�� 1�� ���� 
					for(int k=0; k<mathScores[i].length;k++) {//k = ��, k=i�� ������ �۴�, k�� 1�� ����
						System.out.println("mathScores["+i+"]["+k+"]="
								+mathScores[i][k]); // ������� 0�� ������ ������ �����͸� ���� �ʾұ� ����
					}
				}
	
		System.out.println();
		

		
		int[][]englishScores = new int[2][];
		englishScores[0]= new int[2];
		englishScores[1]= new int[3]; //���� ���� ������ ���� ���(null �Ǵ� 0), ������ �� �Ǵ� ������ �࿭ ������ ǥ��
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