package uz.ulugbek.catalizator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import uz.ulugbek.catalizator.domain.Message;
import uz.ulugbek.catalizator.repository.MessageRepository;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Flux<Message> getMessages(){
        return messageRepository.findAll();
    }

    public Mono<Message> save(Message message){
        return messageRepository.save(message);
    }
}

