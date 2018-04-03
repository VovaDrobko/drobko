package com.epam.lab.Strategy;
public class Order {

  private final PaymentProcessor paymentProcessor;
  private final int amount;

  public Order(int amount, PaymentProcessor paymentProcessor) {
    this.amount = amount;
    this.paymentProcessor = paymentProcessor;
  }

  public void process() {
    paymentProcessor.execute(amount);
  }
}