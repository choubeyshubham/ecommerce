package in.choubeyshubham.ecom.order.domain.order.vo;


import in.choubeyshubham.ecom.shared.error.domain.Assert;

import java.util.UUID;

public record ProductPublicId(UUID value) {

  public ProductPublicId {
    Assert.notNull("value", value);
  }
}
