
public class Ex073003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88} // �ش����� 3�� = 3��
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0; // ��ü ������ ���� �Լ� (�۾�ȯ�濡�� �ﰢ ī���� �����ϵ��� ���)
		for(int i =0; i<array.length; i++) { // length�� �迭�� �ִ� 3. 
			for(int j=0; j<array[i].length; j++) { //������ ĭ�� ��
				sum+=array[i][j];
				count++;
			}
		}
		avg=(double)sum/count; // double �ۼ������� �Ҽ������� ����.�ش� (double)���̵� ���������ϳ� 0���θ� ǥ��
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
	}

}
