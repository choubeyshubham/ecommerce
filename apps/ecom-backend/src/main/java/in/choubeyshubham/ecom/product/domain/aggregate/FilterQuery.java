package in.choubeyshubham.ecom.product.domain.aggregate;

import org.jilt.Builder;

import java.util.List;

@Builder
public record FilterQuery(PublicId categoryId, List<ProductSize> sizes) {
}
