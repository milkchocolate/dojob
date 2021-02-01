package org.mad.dojob

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DojobApplication

fun main(args: Array<String>) {
	runApplication<DojobApplication>(*args)
}
