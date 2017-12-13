package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap();		//18 key°ªÀ» ±âÁØÀ¸·Î Á¤·Ä.
//		Map<String, String> map = new HashMap<>();		//1 Å°°ªÀº Áßº¹ÀÌ ¾ÈµÊ = Áßº¹µÇ´Â Á¾·ù´Â ºÒ°¡ÇÏ´Ù.= À¯´ÏÅ©(À¯ÀÏ) ÇØ¾ßÇÑ´Ù.
		map.put("korea01", "1234");						//2 Å°°ªÀÌ Áßº¹µÇ¸é µÚ¿¡ ¿À´Â °ÍÀ¸·Î ¿À¹ö¶óÀÌÆ® µÇ¹ö¸°´Ù.
		map.put("japan01", "1234");						//3 º§·ù°ªÀÌ Áßº¹Àº »ó°ü ¾ø´Ù.
		map.put("china02", "5678");
		map.put("canada03", "91011");						
		map.put("usa04", "121314");
		map.put("java05", "151617");
		map.put("php06", "181920");
		map.put("asp07", "212223");
		map.put("c++08", "242526");
		map.put("c#09", "272829");
		map.put("oracle10", "303132");
//		System.out.println(map);						//4 Å°¯“°ú º§·ù°ªÀº =À¸·Î ¿¬°á½ÃÄÑ¼­ Ãâ·ÂµÈ´Ù.
		
//		System.out.println(map.get("java01"));			//5 Å°°ª¿¡ ¿¬°áµÈ ¹ë·ù°ªÀ» Ãâ·Â½ÃÄÑÁÜ. = Å°°ªÀ» ¾Ë¾Æ¾ß ¹ë·ù°ªÀ» °¡Á®¿Ã ¼ö ÀÖ´Ù.
//		System.out.println(map.get("java02"));			//6 °Ù¸Ş¼Òµå·Î ¸ñ·Ï¸¸ ¹Ù²î¸é µÈ´Ù = Å°°ª ¼øÈ¯
//		System.out.println(map.get("java03"));			
//		System.out.println(map.get("java04"));			
//		System.out.println(map.get("java05"));			
//		System.out.println(map.get("java06"));			
//		System.out.println(map.get("java07"));			
//		System.out.println(map.get("java08"));
		
//		System.out.println(map.keySet());				//8 map¿¡ ÀÖ´Â key°ª¸¸ Ãâ·Â
//		Set<String>keys = map.keySet();					//9 keyÀÌ¸§¸¸ keys¿¡ ÀúÀå.
		
//		//»õ·Î³ª¿Â for() / iterator µÑ Áß ÅÃ1
//		Iterator<String> it = keys.iterator();			//10 key°ª ¸®½ºÆ® Ãâ·Â.
//		while (it.hasNext()) {
//			String keyName = (String) it.next();		//11 key°ª¿¡ µû¶ó keyName¿¡ pw ¸ÅÄªµÇ¼­ ÀúÀåµÈ´Ù.
//			System.out.println("ID:"+keyName+" , pw:"+map.get(keyName));
//			
//		}
		while(true){									//17 ·Î±×ÀÎ ÇÒ¶§±îÁö ¹İº¹.
			System.out.println(" ·Î±×ÀÎ Ã³¸® ");			//12 id/pw ÇÊ¿ä.
			Scanner scanner = new Scanner(System.in);	//13 Å°º¸µå·Î ÀÔ·Â
			System.out.print("ID: _");
			String id = scanner.nextLine();
			System.out.print("\npw: _");
			String pw = scanner.nextLine();
			
			if(map.containsKey(id)){						//14 id Á¸ÀçÇÔ
				if(map.get(id).equals(pw)){					//14 id/pw ÀÏÄ¡½Ã
					System.out.println("·Î±×ÀÎ ¼º°øÀÔ´Ï´Ù.");	//14 Ãâ·Â ¸Ş¼Òµå.
					break;									//17 ºüÁ®³ª¿À´Â Á¾·á ½ÃÁ¡ = Á¤»ó ·Î±×ÀÎ.
				}else{
					System.out.println("ºñ¹Ğ¹øÈ£¸¦ ´Ù½Ã È®ÀÎÇÏ¼¼¿ä.");	//15 id/pwºÒÀÏÄ¡
				}
			}else{											//16 id Á¸Àç ¾ÈÇÔ
				System.out.println("ID°¡ Á¸ÀçÇÏÁö ¾Ê½À´Ï´Ù.");	//16 if ½ÃÀÛÀ¸·Î ¸®ÅÏ.
			}
		}
		System.out.println("====== ¼­ºñ½º ¸ñ·Ï ======");	//14 id/pw±îÁö ¸ÅÄª ¿Ï·á½Ã Ãâ·Â.
		
		
		
		Set<String>keys = map.keySet();					//19 key°ªÀ¸·Î ¿À¸§Â÷¼ø Á¤·ÄÇØ¼­ Ãâ·Â. 
		Iterator<String> it = keys.iterator();			
		while (it.hasNext()) {
			String keyName = (String) it.next();		
			System.out.println("ID:"+keyName+" , pw:"+map.get(keyName));
		
		
		
	}
}
}