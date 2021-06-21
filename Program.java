package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 설정을 빼게 된다 -- 분리한다!!!
		 * 스프링에서 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam();
		//1. 생성자를 통한 결합
//		ExamConsole console  = new InlineExamConsole(exam); // DI
		ExamConsole console  = new GridExamConsole(exam);
		//이게 di임 inline / grid 에 꽂고 그에 따라 출력 방식 바뀐다  
		
		//2. set을 통한 결합
		console.setExam(exam);
		*/
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		ExamConsole console = ?;
		console.print();
		
	}

}
