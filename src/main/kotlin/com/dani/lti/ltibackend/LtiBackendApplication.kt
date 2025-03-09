package com.dani.lti.ltibackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LtiBackendApplication

fun main(args: Array<String>) {
    runApplication<LtiBackendApplication>(*args)
}
