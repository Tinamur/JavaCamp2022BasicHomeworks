package week_3_Homework_1_YoutubeEgitimi;

import week_3_Homework_1_YoutubeEgitimi.business.CustomerManager;
import week_3_Homework_1_YoutubeEgitimi.business.TeacherCreditManager;
import week_3_Homework_1_YoutubeEgitimi.entities.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
	}

}
