
public class Ex073004 {

	public static void main(String[] args) {
		int max = 0;
		int min = 100;
		
		int[][]array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88} // �ش����� 3�� = 3��
		};
		
		for(int i = 0; i<array.length; i++) { // length�� �迭�� �ִ� 3. 
			for(int j= 0; j<array[i].length; j++) { //������ ĭ�� ��
		
				if(max<array[i][j])	{
					max=array[i][j];
				}
			}
		}

		for(int i = 0; i<array.length; i++) { 
			for(int j= 0; j<array[i].length; j++) {
					
					if(min>array[i][j]) {
						min=array[i][j];
							
					}
				
				}
			}
		
		
		System.out.println("�ְ� : " + max);
		System.out.println("������ : " + min);
			}
}