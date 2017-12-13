/* �������� & �������� */
package util;

public class Array {	//Ŭ���� �����,Ŭ���� ���Ǻ�
	// int sort1;	���� ����.
	// int[] sort;	�迭 ����.
		
	public static int[] sort(int[] a){ //�޼ҵ�(���) �����. ����Ÿ��/���ϰ� �޼ҵ����(�Ű�����(object)-�Էµ� �ʿ��� ������ Ÿ��)
		// int[] data = a; //����a�� data�� �ֻ簡 ���� �ǹ���.
		int[] data = new int [a.length]; //����a�� ����
		System.arraycopy(a, 0, data, 0, a.length); //�����ּҸ� data�� ����.
		
		for(int i=0;i<data.length-1;i++){ //0���� i ���� ����������.
				for(int j=i+1;j<data.length;j++){ // ��������
					if(data[i] > data[j]){ //data�� ����i
						int temp = data[i]; //������ �ʿ� (�ӽð� �ʿ�)
						data[i] = data[j];
						data[j] = temp;
						
					}
				}
		}
		//sort �˰��� - ���.
		return data; // return ��������, void�� �ƴϹǷ� ���ϰ� �ʼ�. �޼ҵ� ���� �� ��ȯ�� �ּ�(����)
	}	//������(����/���)
	
	/**
	 * 
	 * @param a
	 * @param descmode �ǵ� ����.
	 * @return
	 */
	public static int[] sort(int[] a,boolean descmode){ // �����ϴ� descmode�� ���� ��/���� ������ ���.
		int[] data = new int [a.length];
		System.arraycopy(a, 0, data, 0, a.length); //�����ּҸ� data�� ����.
		
		for(int i=0;i<data.length-1;i++){
				for(int j=i+1;j<data.length;j++){
					if(data[i] > data[j]){
						int temp = data[i];
						data[i] = data[j];
						data[j] = temp;
						
					}
				}
		}
		return data;
	}
}
