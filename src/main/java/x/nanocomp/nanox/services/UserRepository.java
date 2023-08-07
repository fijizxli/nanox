package x.nanocomp.nanox.services;

import org.springframework.data.repository.CrudRepository;
import x.nanocomp.nanox.models.User;

public interface UserRepository extends CrudRepository<User,Long>{
    User findByUsername(String username);
}
