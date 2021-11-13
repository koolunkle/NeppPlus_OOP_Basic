package Codes;

public class MainDrive {

	public static void main(String[] args) {

//		실제 시나리오 작성 공간.

//		책 정보 객체화 -> b1, b2 변수에 연결. 
		Book b1 = new Book();

		b1.title = "어린 왕자";
		b1.limitAge = 0;
		b1.rentFee = 500;

		Book b2 = new Book();

		b2.title = "타짜";
		b2.limitAge = 19;
		b2.rentFee = 1000;

		b1.printBookInfo();

		b2.printBookInfo();

//		사용자 정보 객체화 -> u1, u2 변수에 연결.
		User u1 = new User();
		u1.name = "김준기";
		u1.birthYear = 1996;
		u1.money = 50000;
		u1.phoneNum = "010-7153-7394";

		User u2 = new User();
		u2.name = "이학생";
		u2.birthYear = 2012;
		u2.money = 200;
		u2.phoneNum = null; // 없다를 표현해보자.

		u1.printUserInfo();

		u2.printUserInfo();

//		어린 왕자(b1) 을 빌려간 사람의 이름? 
//		System.out.println(b1.rentUser.name);

//		빌려간 사람 설정 -> null 아님!
		b1.rentUser = u1;

		b1.printBookInfo();

//		replace 함수 연습
		System.out.println(b1.rentUser.phoneNum.replace("-", "").length());

	}

}
