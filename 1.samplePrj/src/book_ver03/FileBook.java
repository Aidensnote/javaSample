package book_ver03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileBook {
//	public void save(Object obj, String fileName){ 				//7 obj -> fileName, ���̺� ��� �߰� object�� �ڵ鸵.
	public synchronized void save(Object obj, String fileName) {// 16 ��Ƽ������� + ��ũ�ζ������ �߰�.
		FileOutputStream fos = null; 							// 9 ����Ʈ
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(fileName); 				// 10 �Ѱܹ��� ���� ���� + ����ó��
			bos = new BufferedOutputStream(fos);				// 13 �����ϰ� ���� fos->bos->oos
			oos = new ObjectOutputStream(bos);
			oos.writeObject(obj); 								// 14 oos�� ����
			oos.flush(); 										// 15 ���⿡ �ݵ�� �ʿ�. buffer�� ��� ����(=flush)�� ���ϸ� �ν������� ����.
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (oos != null) 								// 11 �ڿ��ݳ�+trycatch + nulló�� + ������� �ڿ��ݳ�
					oos.close();
				oos = null;
				if (bos != null)
					bos.close();
				bos = null;
				if (fos != null)
					fos.close();
				fos = null;

			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		System.out.println("������ �Ϸ� �Ǿ����ϴ�."); 					// 12 Ȯ�� �޼���
	}

// 16 ���似�̺� = ������ = ����ȭó��. + ������ �� ���� �޼ҵ�.
	public synchronized Object read(String fileName) {	// 17 ���� �޼ҵ� + ObjectŸ������ + ���� Ÿ�� ����.
		FileInputStream fis = null;								 	// 18 output->input���� ����
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		Object obj = null;								//27

		try {
			fis = new FileInputStream(fileName);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			obj = ois.readObject(); 								// 19 oos�� �о�帰 �����͸� obj�� ����.
																	// 28 ����
			System.out.println("�ε� �۾��� �Ϸ� �Ǿ����ϴ�."); 			// 21 �޼����� ������ ��ġ.

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (ois != null)
					ois.close();
				ois = null;
				if (bis != null)
					bis.close();
				bis = null;
				if (fis != null)
					fis.close();
				fis = null;

			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		return obj; 												// 20 obj�� ����
	}
}
