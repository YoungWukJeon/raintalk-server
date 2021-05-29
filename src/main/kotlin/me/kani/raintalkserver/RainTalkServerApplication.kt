package me.kani.raintalkserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RainTalkServerApplication

fun main(args: Array<String>) {
    runApplication<RainTalkServerApplication>(*args)
}
