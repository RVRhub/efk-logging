package com.rvr.efk


import org.fluentd.logger.FluentLogger
import org.json.simple.JSONObject
import org.slf4j.LoggerFactory
import org.slf4j.MDC

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component


@Component
class FluentdSender : CommandLineRunner {

    private var LOG: FluentLogger = FluentLogger.getLogger("app")
    private val logger = LoggerFactory.getLogger(javaClass)

    override fun run(vararg args: String?) {
//        val data: HashMap<String, Any> = HashMap()
//        data.put("search_id", "1")
//        data.put("title", "test_title")
//        LOG.log("follow", data)

        while (true) {
            MDC.put("session_id", "1111111111111")
            logger.info("Message for log")
            Thread.sleep(3000)
        }
    }

}
