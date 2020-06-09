package com.rvr.efk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EfkApplication

fun main(args: Array<String>) {
	runApplication<EfkApplication>(*args)
}
