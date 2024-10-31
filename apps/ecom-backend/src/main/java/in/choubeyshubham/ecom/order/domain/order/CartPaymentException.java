package in.choubeyshubham.ecom.order.domain.order;


public class CartPaymentException extends RuntimeException {
  public CartPaymentException(String message) {
    super(message);
  }
}
