package day5;

public class Prob2 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		
		for(int i = 0; i<=sourceString.length()-1;i++){
			char c = sourceString.charAt(i); //������ ��ϱ� ����ȭ.
			
			if(c == 'x'||c=='y'||c=='z'){
				encodedString += (char)(c-23); //���忡�� x,y,z�� -23�� ���� a,b,c�� ����. 
			}else if(c==' '){
				encodedString += c; // ������ ��� �״�� �������� ó��
			}else{
				encodedString += (char)(c+3); // �� �ܿ� ���� +3�ؼ� ��ȭ.
				
			}
		}
				
				
				
				System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
				System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);
		
	}

}
