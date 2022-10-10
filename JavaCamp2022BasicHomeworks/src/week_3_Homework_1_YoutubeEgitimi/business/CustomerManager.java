package week_3_Homework_1_YoutubeEgitimi.business;

import week_3_Homework_1_YoutubeEgitimi.entities.Customer;

public class CustomerManager {

	private Customer customer;
	private CreditService creditManager;

	public CustomerManager(Customer customer, CreditService creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void save() {
		System.out.println("Customer Saved : " + customer.getId());
	};

	public void delete() {
		System.out.println("Customer Deleted : " + customer.getId());
	};

	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Credit given");
		creditManager.save();
	}
}
