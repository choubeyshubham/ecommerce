package in.choubeyshubham.ecom.order.domain.user.service;

import in.choubeyshubham.ecom.order.domain.user.aggregate.User;
import in.choubeyshubham.ecom.order.domain.user.repository.UserRepository;
import in.choubeyshubham.ecom.order.domain.user.vo.UserEmail;
import in.choubeyshubham.ecom.order.domain.user.vo.UserPublicId;

import java.util.Optional;

public class UserReader {

  private final UserRepository userRepository;

  public UserReader(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Optional<User> getByEmail(UserEmail userEmail) {
    return userRepository.getOneByEmail(userEmail);
  }

  public Optional<User> getByPublicId(UserPublicId userPublicId) {
    return userRepository.get(userPublicId);
  }
}