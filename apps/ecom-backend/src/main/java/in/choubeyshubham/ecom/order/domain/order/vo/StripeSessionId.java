package in.choubeyshubham.ecom.order.domain.order.vo;


import in.choubeyshubham.ecom.shared.error.domain.Assert;

public record StripeSessionId(String value) {

  public StripeSessionId {
    Assert.notNull("value", value);
  }
}
