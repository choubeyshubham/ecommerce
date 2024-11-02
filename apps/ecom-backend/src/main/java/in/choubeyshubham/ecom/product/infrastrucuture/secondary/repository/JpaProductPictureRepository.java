package in.choubeyshubham.ecom.product.infrastrucuture.secondary.repository;

import in.choubeyshubham.ecom.product.infrastrucuture.secondary.entity.PictureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductPictureRepository extends JpaRepository<PictureEntity, Long> {
}
