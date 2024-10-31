package in.choubeyshubham.ecom.order.domain.user.vo;

import in.choubeyshubham.ecom.shared.error.domain.Assert;

public record UserFirstname(String value) {

  public UserFirstname {
    Assert.field("value", value).maxLength(255);
  }
}
