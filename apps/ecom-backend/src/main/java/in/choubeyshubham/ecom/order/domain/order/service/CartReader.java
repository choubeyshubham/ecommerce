package in.choubeyshubham.ecom.order.domain.order.service;


import java.util.List;

public class CartReader {

  public CartReader() {
  }

  public DetailCartResponse getDetails(List<Product> products) {
    List<ProductCart> cartProducts = products.stream().map(ProductCart::from).toList();
    return DetailCartResponseBuilder.detailCartResponse().products(cartProducts)
      .build();
  }
}
