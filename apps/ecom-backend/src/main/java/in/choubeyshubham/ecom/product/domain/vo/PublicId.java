package in.choubeyshubham.ecom.product.domain.vo;

import in.choubeyshubham.ecom.shared.error.domain.Assert;

import java.util.UUID;

public record PublicId(UUID value) {

  public PublicId {
    Assert.notNull("value", value);
  }
}
