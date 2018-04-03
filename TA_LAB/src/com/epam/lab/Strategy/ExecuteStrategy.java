package com.epam.lab.Strategy;

import com.epam.lab.Command;

public class ExecuteStrategy implements Command {

	@Override
	public void execute() {
		System.out.println("-------Strategy Pattern--------- ");
		Order order = new Order(15, new VisaPaymentProcessor());
		order.process();
	}
}
