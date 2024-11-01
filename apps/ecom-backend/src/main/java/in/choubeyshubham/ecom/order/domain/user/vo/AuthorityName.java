package in.choubeyshubham.ecom.order.domain.user.vo;


import in.choubeyshubham.ecom.shared.error.domain.Assert;

public record AuthorityName(String name) {

  public AuthorityName {
    Assert.field("name", name).notNull();
  }
}
