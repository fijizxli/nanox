package x.nanocomp.nanox.repositories;

import org.springframework.data.repository.CrudRepository;
import x.nanocomp.nanox.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
