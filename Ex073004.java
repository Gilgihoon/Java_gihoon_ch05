
public class Ex073004 {

	public static void main(String[] args) {
		int max = 0;
		int min = 100;
		
		int[][]array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88} // 해당행은 3줄 = 3행
		};
		
		for(int i = 0; i<array.length; i++) { // length는 배열값 최대 3. 
			for(int j= 0; j<array[i].length; j++) { //각각의 칸의 값
		
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
		
		
		System.out.println("최고값 : " + max);
		System.out.println("최저값 : " + min);
			}
}