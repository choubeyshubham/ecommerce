package in.choubeyshubham.ecom.order.domain.order.aggregate;

import in.choubeyshubham.ecom.product.domain.vo.PublicId;
import org.jilt.Builder;

@Builder
public record DetailCartItemRequest(PublicId productId, long quantity) {
}
