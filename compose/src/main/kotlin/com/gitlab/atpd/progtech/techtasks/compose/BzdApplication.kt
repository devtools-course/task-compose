package com.gitlab.atpd.progtech.techtasks.compose

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.lang.Exception
import kotlin.system.exitProcess

@SpringBootApplication
class TpComposeSolApplication

@Component
class ShutdownInterceptor(
    private val ctx: ConfigurableApplicationContext,
) : HandlerInterceptor {
    override fun afterCompletion(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
        ex: Exception?
    ) {
        this.ctx;
        val ecode = SpringApplication.exit(ctx, { 3 })
        exitProcess(ecode)
    }
}

@Configuration
class ShutdownConfiguration(
    private val iceptor: ShutdownInterceptor,
) : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(iceptor).addPathPatterns("/shutdown")
    }
}

fun main(args: Array<String>) {
    runApplication<TpComposeSolApplication>(*args)
}
