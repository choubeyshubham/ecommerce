package in.choubeyshubham.ecom.product.infrastrucuture.secondary.repository;

import in.choubeyshubham.ecom.product.infrastrucuture.secondary.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface JpaCategoryRepository extends JpaRepository<CategoryEntity, Long> {

  Optional<CategoryEntity> findByPublicId(UUID publicId);

  int deleteByPublicId(UUID publicId);

}
