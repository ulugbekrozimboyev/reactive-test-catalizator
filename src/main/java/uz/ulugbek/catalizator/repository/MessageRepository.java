package uz.ulugbek.catalizator.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import uz.ulugbek.catalizator.domain.Message;

public interface MessageRepository extends ReactiveCrudRepository<Message, Long> {
}
