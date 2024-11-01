package in.choubeyshubham.ecom.order.domain.order.aggregate;

import org.jilt.Builder;

@Builder
public record DetailCartItemRequest(PublicId productId, long quantity) {
}
