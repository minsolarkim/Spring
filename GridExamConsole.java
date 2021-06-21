package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam; //물려받음
	
	//기본 생성자 추가
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	//필드 가지고 생성자 만듦
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.println("total ||   avg");
		System.out.printf("%3d   ||  %3.2f\n", exam.total(), exam.avg());
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
