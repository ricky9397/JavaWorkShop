package com.test;

class BBSItem {
	static int seqNo; //일련번호 필드
	String writer; //작성자 필드
	String writtenDate; //작성일자 필드
	String title; //제목필드
	String content; //내용필드
	BBSItem (int seqNo, String writer, String writtenDate,

			String title, String content){//생성자

			this.seqNo=seqNo;
			this.writer=writer;
			this.writtenDate=writtenDate;
			this.title=title;
			this.content=content;
	}
	public void showInfo() {
		System.out.println(seqNo+=1);
	}
}

public class WorkShop2_3 {
	
	public static void main(String[] args) {
//		BBSItem.seqNo = 0;
//		int seqNumber = BBSItem.seqNo;
//		for (int i=0; i<3;i++) {
//			seqNumber += 1;
			BBSItem bbs1 = new BBSItem(0, null, null, null, null);
			BBSItem bbs2 = new BBSItem(0, null, null, null, null);
			BBSItem bbs3 = new BBSItem(0, null, null, null, null);
			bbs1.showInfo();
			bbs2.showInfo();
			bbs3.showInfo();
			
//			System.out.println(bbs2.seqNoInfo());
//			System.out.println(bbs3.seqNoInfo());
			
//			System.out.println(bbs.seqNo);
//			BBSItem bbs1 = new BBSItem(2, null, null, null, null);
//			System.out.println(bbs1.seqNo);
//			BBSItem bbs2 = new BBSItem(3, null, null, null, null);
//			System.out.println(bbs2.seqNo);
		
		
		
		
	}
}

