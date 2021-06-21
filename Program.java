package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* ������ ���� �ȴ� -- �и��Ѵ�!!!
		 * ���������� �����ϴ� ������� �ڵ带 ����
		Exam exam = new NewlecExam();
		//1. �����ڸ� ���� ����
//		ExamConsole console  = new InlineExamConsole(exam); // DI
		ExamConsole console  = new GridExamConsole(exam);
		//�̰� di�� inline / grid �� �Ȱ� �׿� ���� ��� ��� �ٲ��  
		
		//2. set�� ���� ����
		console.setExam(exam);
		*/
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		ExamConsole console = ?;
		console.print();
		
	}

}
