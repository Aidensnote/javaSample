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
//	public void save(Object obj, String fileName){ 				//7 obj -> fileName, 세이브 기능 추가 object를 핸들링.
	public synchronized void save(Object obj, String fileName) {// 16 멀티쓰레드용 + 싱크로라이즈드 추가.
		FileOutputStream fos = null; 							// 9 디폴트
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(fileName); 				// 10 넘겨받은 파일 저장 + 예외처리
			bos = new BufferedOutputStream(fos);				// 13 저장하게 연결 fos->bos->oos
			oos = new ObjectOutputStream(bos);
			oos.writeObject(obj); 								// 14 oos로 쓰기
			oos.flush(); 										// 15 쓰기에 반드시 필요. buffer일 경우 비우기(=flush)를 안하면 로스데이터 생김.
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (oos != null) 								// 11 자원반납+trycatch + null처리 + 순서대로 자원반납
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
		System.out.println("저장이 완료 되었습니다."); 					// 12 확인 메세지
	}

// 16 오토세이브 = 쓰레드 = 동기화처리. + 리부팅 후 리드 메소드.
	public synchronized Object read(String fileName) {	// 17 리드 메소드 + Object타입으로 + 리턴 타입 변경.
		FileInputStream fis = null;								 	// 18 output->input으로 변경
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		Object obj = null;								//27

		try {
			fis = new FileInputStream(fileName);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			obj = ois.readObject(); 								// 19 oos가 읽어드린 데이터를 obj에 저장.
																	// 28 삭제
			System.out.println("로드 작업이 완료 되었습니다."); 			// 21 메세지의 적합한 위치.

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
		return obj; 												// 20 obj를 리턴
	}
}
