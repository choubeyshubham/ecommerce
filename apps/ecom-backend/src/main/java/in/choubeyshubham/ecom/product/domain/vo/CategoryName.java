package in.choubeyshubham.ecom.product.domain.vo;


import in.choubeyshubham.ecom.shared.error.domain.Assert;

public record CategoryName(String value) {
  public CategoryName {
    Assert.field("value", value).notNull().minLength(3);
  }
}
