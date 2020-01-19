package dc.springh2.dao;

import dc.springh2.PrivateAccount;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<PrivateAccount, Integer> {
  // nic nie trzeba dodawac!
}
