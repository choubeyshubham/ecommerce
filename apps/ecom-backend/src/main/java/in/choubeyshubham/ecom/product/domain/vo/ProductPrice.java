package in.choubeyshubham.ecom.product.domain.vo;


import in.choubeyshubham.ecom.shared.error.domain.Assert;

public record ProductPrice(double value) {

  public ProductPrice {
    Assert.field("value", value).min(0.1);
  }
}
