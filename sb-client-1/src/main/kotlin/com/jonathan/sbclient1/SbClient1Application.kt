package com.jonathan.sbclient1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled

@EnableScheduling
@SpringBootApplication
class SbClient1Application {

  @Scheduled(fixedRate = 1000)
  fun schedule1() {}
}

fun main(args: Array<String>) {
  runApplication<SbClient1Application>(*args)
}
