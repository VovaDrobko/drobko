package com.epam.lab.Strategy;
public class VisaPaymentProcessor implements PaymentProcessor {

  @Override
  public void execute(int amount) {
    System.out.println("Executing Visa payment: Charging $" + amount);
  }
}