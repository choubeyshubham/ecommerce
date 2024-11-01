package in.choubeyshubham.ecom.product.domain.vo;


import in.choubeyshubham.ecom.shared.error.domain.Assert;

public record ProductBrand(String value) {

  public ProductBrand {
    Assert.field("value", value).notNull().minLength(3);
  }
}
