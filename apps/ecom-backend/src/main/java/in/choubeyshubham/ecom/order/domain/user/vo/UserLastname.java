package in.choubeyshubham.ecom.order.domain.user.vo;

import in.choubeyshubham.ecom.shared.error.domain.Assert;

public record UserLastname(String value) {

  public UserLastname {
    Assert.field("value", value).maxLength(255);
  }
}
