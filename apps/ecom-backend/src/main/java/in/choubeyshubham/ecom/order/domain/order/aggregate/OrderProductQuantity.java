package in.choubeyshubham.ecom.order.domain.order.aggregate;

import in.choubeyshubham.ecom.order.domain.order.vo.OrderQuantity;
import in.choubeyshubham.ecom.order.domain.order.vo.ProductPublicId;
import org.jilt.Builder;

@Builder
public record OrderProductQuantity(OrderQuantity quantity, ProductPublicId productPublicId) {
}
