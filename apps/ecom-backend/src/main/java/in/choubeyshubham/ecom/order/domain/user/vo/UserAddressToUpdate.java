package in.choubeyshubham.ecom.order.domain.user.vo;

import in.choubeyshubham.ecom.shared.error.domain.Assert;
import lombok.Builder;

@Builder
public record UserAddressToUpdate(UserPublicId userPublicId, UserAddress userAddress) {

  public UserAddressToUpdate {
    Assert.notNull("value", userPublicId);
    Assert.notNull("value", userAddress);
  }
}