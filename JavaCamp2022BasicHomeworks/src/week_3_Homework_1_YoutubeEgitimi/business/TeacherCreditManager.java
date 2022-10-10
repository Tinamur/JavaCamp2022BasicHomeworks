package week_3_Homework_1_YoutubeEgitimi.business;

public class TeacherCreditManager extends BaseCreditManager implements CreditService {

	@Override
	public void calculate() {
		System.out.println("Credit Calculated : Teacher");

	}

	@Override
	public void save() {
		System.out.println("teacherSaved");
	}

}
