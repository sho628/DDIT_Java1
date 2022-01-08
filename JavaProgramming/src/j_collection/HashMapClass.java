package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 */
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("age", 10);
		map.put("name", "홍길동");
		map.put("date", new Date());
		
		System.out.println(map);
		
		map.put("name", "이순신"); //덮어쓴다.
		
		System.out.println(map);
		
		map.remove("age");
		
		System.out.println(map);
		
		Object value = map.get("name");
		System.out.println(value);
		
		Set<String> keys = map.keySet();
		
		for(String key : keys){
			System.out.println(key + " : " + map.get(key));
		}
		
		
		
		HashMap<String, Object> lprod = new HashMap<>();
		
		lprod.put("LPROD_ID", 1);
		lprod.put("LPROD_GU", "P101");
		lprod.put("LPROD_NM", "컴퓨터제품");
		
		ArrayList<HashMap<String, Object>> lprodTable = new ArrayList<>();
		
		lprodTable.add(lprod);
		
		lprod = new HashMap<>();
		
		lprod.put("LPROD_ID", 2);
		lprod.put("LPROD_GU", "P102");
		lprod.put("LPROD_NM", "전자제품");
		
		lprodTable.add(lprod);
		
		for(int i = 0; i < lprodTable.size(); i++){
			HashMap<String, Object> tempMap = lprodTable.get(i);
			Set<String> keys2 = tempMap.keySet();
			for(String key : keys2){
				System.out.println(key + " : " + tempMap.get(key));
			}
			System.out.println("-----------------------");
		}
		
		
		
		
		//회원 테이블
		//아이디, 비밀번호, 이름, 전화번호
		//ArrayList와 HashMap을 사용해서 회원 테이블을 만들어주시고, 테이블에 3명의 데이터를 저장해주세요.
		//3명의 데이터가 저장된 테이블을 아래와 같은 형태로 출력해주세요.
		/*
		 * ===================================
		 * 아이디	비밀번호	이름		전화번호
		 * -----------------------------------
		 * id1	1234	홍길동	010-1234-1234
		 * id2	1234	홍길동	010-1234-1234
		 * id3	1234	홍길동	010-1234-1234
		 * ===================================
		 */
		
		ArrayList<HashMap<String, Object>> memberTable = new ArrayList<>();
		
		HashMap<String, Object> member = new HashMap<>();
		member.put("MEM_ID", "qwer");
		member.put("PASSWORD", "qwer123");
		member.put("MEM_NAME", "홍길동1");
		member.put("TEL_NO", "010-1234-1234");
		memberTable.add(member);
		
		member = new HashMap<>();
		member.put("MEM_ID", "asdf");
		member.put("PASSWORD", "asdf123");
		member.put("MEM_NAME", "홍길동2");
		member.put("TEL_NO", "010-2345-2345");
		memberTable.add(member);
		
		member = new HashMap<>();
		member.put("MEM_ID", "zxcv");
		member.put("PASSWORD", "zxcv123");
		member.put("MEM_NAME", "홍길동3");
		member.put("TEL_NO", "010-3456-3456");
		memberTable.add(member);
		
		System.out.println("=========================================");
		System.out.println("아이디\t비밀번호\t이름\t전화번호");
		System.out.println("-----------------------------------------");
		for(int i = 0; i < memberTable.size(); i++){
			HashMap<String, Object> mem = memberTable.get(i);
			System.out.println(mem.get("MEM_ID")
					+ "\t" + mem.get("PASSWORD")
					+ "\t" + mem.get("MEM_NAME")
					+ "\t" + mem.get("TEL_NO"));
		}
		System.out.println("=========================================");
	}

}














