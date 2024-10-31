package in.choubeyshubham.ecom.order.domain.order.vo;


import in.choubeyshubham.ecom.shared.error.domain.Assert;

public record OrderQuantity(long value) {

  public OrderQuantity {
    Assert.field("value", value).positive();

  }
}
