package in.choubeyshubham.ecom.product.infrastrucuture.primary.exceprtions;

public class EntityCreationFailed extends RuntimeException {
  public EntityCreationFailed(String message) {
    super(message);
  }
}
