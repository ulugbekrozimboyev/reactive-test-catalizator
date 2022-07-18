package uz.ulugbek.catalizator.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import uz.ulugbek.catalizator.domain.Message;
import uz.ulugbek.catalizator.service.MessageService;

@RestController
@RequestMapping("/web")
public class MainController {

    private final MessageService messageService;

    public MainController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public Flux<Message> getList(@RequestParam(defaultValue = "0") Long start,
                                 @RequestParam(defaultValue = "3") Long count){
        return messageService.getMessages();
    }

    @PostMapping
    public Mono<Message> save(Message message){
        return messageService.save(message);
    }

}
