package com.jonathan.admin

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableAdminServer
@SpringBootApplication
class SbAdminApplication

fun main(args: Array<String>) {
  runApplication<SbAdminApplication>(*args)
}
