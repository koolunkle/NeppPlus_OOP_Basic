package Codes;

public class Book {

	String title;
	int limitAge;
	int rentFee;

//	책을 빌려간 사람? -> 초기값 : 빌려간 사람이 없다. 
	User rentUser = null;

//	책의 정보 출력

	void printBookInfo() {
		System.out.println("===== 도서 정보 출력 =====");
		System.out.println("제목 : " + title);

		if (limitAge == 0) {
			System.out.println("연령 제한 : 전체이용가");
		} else {
			System.out.println("연령 제한 : " + limitAge + "세 이용가");
		}
		System.out.println("대여료 : " + rentFee);

//		책을 빌려간 사람이 누군지? -> 없는 경우 (null) 고려
		if (rentUser == null) {

//			대여자 없는 경우. 
			System.out.println("빌려간 사람 : 아직 없음.");

		} else {

//			빌려간 사람이 있는 경우. null 아님.
			System.out.println("빌려간 사람 : " + rentUser.name);

		}

		System.out.println("=======================");
	}

}