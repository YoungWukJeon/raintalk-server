package me.kani.raintalkserver.controller

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.time.LocalDateTime

@RestController
class TestController {
    @MessageMapping("/current")
    fun getCurrent(): Mono<LocalDateTime> {
        return Mono.just(LocalDateTime.now())
    }
}