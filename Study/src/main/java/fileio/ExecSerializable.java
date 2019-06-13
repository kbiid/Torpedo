package fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ExecSerializable {
	private File dirfile;
	private File makefile;
	private ArrayList<Employee> employeeList;

	public ExecSerializable() {
		dirfile = new File(Main.DIR);
		makefile = new File(Main.DIR + Main.FILE_NAME);
		employeeList = new ArrayList<>();
	}
	
	public void setMakefile(String str) {
		makefile = new File(str);
	}

	// 사원 입력 메소드
	public void makeEmployee() {
		employeeList.add(new Employee("김기주", 26, "010-2972-4701", "개발부", "kbiid@naver.com"));
		employeeList.add(new Employee("홍길동", 23, "010-1234-5678", "영업부", "hong@naver.com"));
		employeeList.add(new Employee("장발장", 25, "010-5678-1234", "인사부", "jang@naver.com"));
		employeeList.add(new Employee("김광현", 30, "010-4789-5131", "개발부", "kim@naver.com"));
		employeeList.add(new Employee("김성현", 28, "010-7465-1459", "인사부", "sung@naver.com"));
	}
	
	public void makeIntern() {
		employeeList.add(new Intern("김인턴", 20, "010-3475-1496", "개발부", "intern@naver.com",6));
		employeeList.add(new Intern("이인턴", 27, "010-8754-7894", "인사부", "lee@naver.com",12));
		employeeList.add(new Intern("심인턴", 32, "010-8522-0537", "영업부", "sim@naver.com",8));
		employeeList.add(new Intern("박인턴", 24, "010-3694-7891", "인사부", "park@naver.com",12));
	}

	// 디렉토리를 확인하고 만드는 메소드
	public void makeDir() {
		if (dirfile == null) {
			throw new NullPointerException("dirfile 변수가 NULL!");
		}

		if (!dirfile.exists()) { // 폴더가 없는 경우
			System.out.println("폴더가 없습니다.");
			if (dirfile.mkdir()) {
				System.out.println("폴더 생성 성공");
			} else {
				System.out.println("폴더 생성 실패");
			}
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
	}

	// 파일 여부 확인하고 만드는 메소드
	public void makeFile() {
		if (makefile == null) {
			throw new NullPointerException("makefile 변수가 NULL!");
		}

		if (!makefile.exists()) { // 파일이 없는 경우
			System.out.println("파일이 없습니다.");
			try {
				if (makefile.createNewFile()) {
					System.out.println("파일 생성 성공");
				} else {
					System.out.println("파일 생성 실패");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("파일이 이미 존재합니다.");
		}

	}

	// 직렬화 후 파일에 저장하는 메소드
	public void doSelialization() {
		makeDir();
		makeFile();

		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		try {
			fout = new FileOutputStream(makefile);
			oout = new ObjectOutputStream(fout);
			writeEmployee(oout);
			fout.close();
			oout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 파일에 데이터를 입력하는 메소드
	public void writeEmployee(ObjectOutputStream oout) {
		for (Employee employee : employeeList) {
			try {
				oout.writeObject(employee);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void serializationNotIntern() {
		makeEmployee();
		doSelialization();
	}

	public void serializationIntern() {
		makeIntern();
		doSelialization();
	}
}
