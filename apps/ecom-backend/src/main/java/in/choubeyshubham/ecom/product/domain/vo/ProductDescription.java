package in.choubeyshubham.ecom.product.domain.vo;

import in.choubeyshubham.ecom.shared.error.domain.Assert;

public record ProductDescription(String value) {

  public ProductDescription {
    Assert.field("value", value).notNull().minLength(10);
  }
}
