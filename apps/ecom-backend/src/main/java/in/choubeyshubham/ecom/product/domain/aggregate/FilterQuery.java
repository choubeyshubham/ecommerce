package in.choubeyshubham.ecom.product.domain.aggregate;

import in.choubeyshubham.ecom.product.domain.vo.ProductSize;
import in.choubeyshubham.ecom.product.domain.vo.PublicId;
import org.jilt.Builder;

import java.util.List;

@Builder
public record FilterQuery(PublicId categoryId, List<ProductSize> sizes) {
}
