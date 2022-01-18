package kr.board.domain;

import lombok.Data;

@Data // lombok API
public class Board {
	//property(프로퍼티, 속성)
	private int idx; //번호 
	private String memId;
	private String title;//제목 
	private String contents; //내용 
	private String writer; //작성자 
	private String indate; //작성일 mysql에서 이미 datetime로 날짜를 정해줬기때문에 자바에서까지 date로 다시하지말고 String으로 하라.
	private int count; //조회수
	
}