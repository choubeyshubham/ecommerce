package in.choubeyshubham.ecom.order.domain.user.vo;

import in.choubeyshubham.ecom.shared.error.domain.Assert;
import lombok.Builder;

@Builder
public record UserAddress(String street, String city, String zipCode, String country) {

  public UserAddress {
    Assert.field("street", street).notNull();
    Assert.field("city", city).notNull();
    Assert.field("zipCode", zipCode).notNull();
    Assert.field("country", country).notNull();
  }
}
