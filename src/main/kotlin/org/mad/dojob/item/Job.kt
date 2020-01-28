package org.mad.dojob.item

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@Component
class Job(@Value("\${item.url}") private val itemUrl: String) {
    fun doJob() {
        val restTemplate = RestTemplate()
        val result = restTemplate.getForObject<String>(itemUrl)
        println(result)
    }
}