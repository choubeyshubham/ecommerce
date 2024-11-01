package in.choubeyshubham.ecom.order.infrastructure.secondary.repository;

import in.choubeyshubham.ecom.order.infrastructure.secondary.entity.OrderedProductEntity;
import in.choubeyshubham.ecom.order.infrastructure.secondary.entity.OrderedProductEntityPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderedProductRepository extends JpaRepository<OrderedProductEntity, OrderedProductEntityPk> {

}
