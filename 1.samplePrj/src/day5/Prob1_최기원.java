package day5;

public class Prob1_�ֱ�� {

	public static void main(String[] args) {
		String sourceString = 
				"everyday we have is one more than we deserve";
				String encodedString = "";
				
				
				// ���α׷��� ������ ����.	
				// ���� : ���� 'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�. 
				for (int i = 0; i < sourceString.length(); i++) {
					if (sourceString.charAt(i) == 'x' || sourceString.charAt(i) == 'y' || sourceString.charAt(i) == 'z') {
						encodedString += (char) (sourceString.charAt(i) - 23);
					} else if (sourceString.charAt(i) == ' ') {
						encodedString += ' ';
					} else {
						encodedString += (char) (sourceString.charAt(i) + 3);
				}
				//���α׷� ������ ��.
				
				System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
				System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);
				}
			}
}