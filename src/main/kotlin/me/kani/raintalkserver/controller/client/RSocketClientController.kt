package me.kani.raintalkserver.controller.client

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.rsocket.RSocketRequester
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.time.LocalDateTime

@RestController
class RSocketClientController(@Autowired builder: RSocketRequester.Builder) {
    final val rsocketRequester: RSocketRequester

    init {
        this.rsocketRequester = builder.tcp("localhost", 7000)
    }

    @GetMapping("/temp")
    fun requestResponse(): Mono<LocalDateTime> {
        return rsocketRequester.route("/current")
            .retrieveMono(LocalDateTime::class.java)
    }
}