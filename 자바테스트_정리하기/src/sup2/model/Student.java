package sup2.model;

public class Student {
// 학생의 이름, 학년, 반, 번호, 성별, 성적을 키보드로 입력받아 출력처리
// 단, 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 삼항연산자를 사용하여 출력처리
	//필드
	String 이름;
	int 학년;
	int 반;
	int 번호;
	char 성별;
	double 성적;
	
// 메서드
	// 필수 이름 학년 반 번호 성별 성적
	public Student(String 이름, int 학년, int 반, int 번호, char 성별, double 성적) {
		super();
		this.이름 = 이름;
		this.학년 = 학년;
		this.반 = 반;
		this.번호 = 번호;
		this.성별 = 성별;
		this.성적 = 성적;
	}
	
	public void 정보() {
		String 성별확인 = (성별 == 'M') ? "남학생" : "여학생";
		System.out.println("이름 : " + 이름 + ", 학년 : " + 학년 + ", 반 : " + 반 + ", 번호 : " 
		+ 번호 + ", 성별 : " + 성별확인 + ", 성적 : " + 성적);
		//System.out.println("성별확인 : " + 성별확인);
	}

	// public void 정보() {		// 참이면 남학생 불 여학생
	// String 성별확인 = (성별 == 'M') ? 
	
}
