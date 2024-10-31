package in.choubeyshubham.ecom.order.domain.user.vo;


import in.choubeyshubham.ecom.shared.error.domain.Assert;

import java.util.UUID;

public record UserPublicId(UUID value) {

  public UserPublicId {
    Assert.notNull("value", value);
  }
}
