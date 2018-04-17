package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface CategoryResponsiveRepository extends ReactiveMongoRepository<Category, String> {
	Mono<Category> findByDescription(String description);
}
