package in.choubeyshubham.ecom.product.domain.aggregate;

import in.choubeyshubham.ecom.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public record Picture(byte[] file, String mimeType) {

  public Picture {
    Assert.notNull("file", file);
    Assert.notNull("mimeType", mimeType);
  }
}