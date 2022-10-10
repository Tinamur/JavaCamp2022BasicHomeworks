package week_3_Homework_1_YoutubeEgitimi.business;

abstract class BaseCreditManager implements CreditService {

	@Override
	public abstract void calculate();

	@Override
	public void save() {
		System.out.println("Credit saved");
	}

}
