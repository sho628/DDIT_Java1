package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {

	static ArrayList<HashMap<String, Object>> boardTable = new ArrayList<>();
	
	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * ----------------------------------
		 * 번호		제목		작성자	작성일
		 * ----------------------------------
		 * 4	안녕하세요		홍길동	6/8
		 * 3	안녕하세요		홍길동	6/8
		 * 2	안녕하세요		홍길동	6/8
		 * 1	안녕하세요		홍길동	6/8
		 * ----------------------------------
		 * 1.조회		2.등록	0.종료
		 */
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("BOARD_NO", 1);
		map.put("TITLE", "111111");
		map.put("CONTENT", "");
		map.put("USER_NAME", "홍길동");
		map.put("REG_DATE", new Date());
		boardTable.add(map);
		
		map = new HashMap<>();
		map.put("BOARD_NO", 2);
		map.put("TITLE", "111111111111111");
		map.put("CONTENT", "");
		map.put("USER_NAME", "홍길동");
		map.put("REG_DATE", new Date());
		boardTable.add(map);
		
		map = new HashMap<>();
		map.put("BOARD_NO", 3);
		map.put("TITLE", "111111111111111111111111");
		map.put("CONTENT", "");
		map.put("USER_NAME", "홍길동");
		map.put("REG_DATE", new Date());
		boardTable.add(map);
		
		
		while(true){
			System.out.println("---------------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("---------------------------------");
			for(int i = boardTable.size() - 1; i >= 0; i--){
				HashMap<String, Object> board = boardTable.get(i);
				System.out.print(board.get("BOARD_NO"));
				System.out.printf("\t%30s", board.get("TITLE"));
				System.out.print("\t" + board.get("USER_NAME"));
				System.out.println("\t" + board.get("REG_DATE"));
			}
			System.out.println("---------------------------------");
			System.out.println("1.조회\t2.등록\t0.종료");
			
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: //조회
				read();
				break;
			case 2: //등록
				insert();
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}

	//조회
	private static void read() {
		System.out.print("게시글 번호 입력>");
		int boardNo = ScanUtil.nextInt();
		
		HashMap<String, Object> board = null;
		for(int i = 0; i < boardTable.size(); i++){
			if((Integer)boardTable.get(i).get("BOARD_NO") == boardNo){
				board = boardTable.get(i);
			}
		}
		
		if(board == null){
			System.out.println("존재하지 않는 게시글 번호입니다.");
			return;
		}
		
		System.out.println("------------------------------");
		System.out.println("번호\t: " + board.get("BOARD_NO"));
		System.out.println("작성자\t: " + board.get("USER_NAME"));
		System.out.println("작성일\t: " + board.get("REG_DATE"));
		System.out.println("제목\t: " + board.get("TITLE"));
		System.out.println("내용\t: " + board.get("CONTENT"));
		System.out.println("------------------------------");
		System.out.println("1.수정\t2.삭제\t0.목록");
		System.out.print("입력>");
		int input = ScanUtil.nextInt();
		
		switch (input) {
		case 1: //수정
			update(boardNo);
			break;
		case 2: //삭제
			delete(boardNo);
			break;
		case 0: //목록
			
			break;
		}
		
	}

	//삭제
	private static void delete(int boardNo) {
		for(int i = 0; i < boardTable.size(); i++){
			if((Integer)boardTable.get(i).get("BOARD_NO") == boardNo){
				boardTable.remove(i);
			}
		}
		System.out.println("삭제가 완료되었습니다.");
	}

	//수정
	private static void update(int boardNo) {
		HashMap<String, Object> board = null;
		for(int i = 0; i < boardTable.size(); i++){
			if((Integer)boardTable.get(i).get("BOARD_NO") == boardNo){
				board = boardTable.get(i);
			}
		}
		
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		
		board.put("TITLE", title);
		board.put("CONTENT", content);
		
		System.out.println("수정이 완료되었습니다.");
	}

	//등록
	private static void insert() {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("이름>");
		String userName = ScanUtil.nextLine();
		
		int max = 0;
		for(int i = 0; i < boardTable.size(); i++){
			int boardNo = (Integer)boardTable.get(i).get("BOARD_NO");
			if(max < boardNo){
				max = boardNo;
			}
		}
		
		HashMap<String, Object> board = new HashMap<>();
		board.put("BOARD_NO", max + 1);
		board.put("TITLE", title);
		board.put("CONTENT", content);
		board.put("USER_NAME", userName);
		board.put("REG_DATE", new Date());
		
		boardTable.add(board);
		System.out.println("게시물 등록이 완료되었습니다.");
	}
	

}













