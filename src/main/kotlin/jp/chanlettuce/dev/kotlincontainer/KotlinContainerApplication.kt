package jp.chanlettuce.dev.kotlincontainer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinContainerApplication

fun main(args: Array<String>) {
	runApplication<KotlinContainerApplication>(*args)
}
