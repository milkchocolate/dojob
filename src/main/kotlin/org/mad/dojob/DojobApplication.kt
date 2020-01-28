package org.mad.dojob

import org.mad.dojob.item.Job
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DojobApplication(private val job: Job) : CommandLineRunner {
    override fun run(vararg args: String?) {
        job.doJob()
    }
}

fun main(args: Array<String>) {
    runApplication<DojobApplication>(*args)
}
