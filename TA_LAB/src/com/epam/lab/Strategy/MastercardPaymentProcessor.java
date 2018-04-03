package com.epam.lab.Strategy;
public class MastercardPaymentProcessor implements PaymentProcessor {

  @Override
  public void execute(int amount) {
    System.out.println("Executing Mastercard payment: Charging $" + amount);
  }
}