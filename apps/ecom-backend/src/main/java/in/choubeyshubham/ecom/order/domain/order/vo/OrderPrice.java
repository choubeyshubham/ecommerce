package in.choubeyshubham.ecom.order.domain.order.vo;

import in.choubeyshubham.ecom.shared.error.domain.Assert;

public record OrderPrice(double value) {

  public OrderPrice {
    Assert.field("value", value).strictlyPositive();
  }
}
