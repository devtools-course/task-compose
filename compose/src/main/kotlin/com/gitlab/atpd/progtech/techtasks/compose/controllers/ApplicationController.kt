package com.gitlab.atpd.progtech.techtasks.compose.controllers

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.context.annotation.Bean
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.HandlerInterceptor
import java.lang.Exception
import kotlin.system.exitProcess

@RestController
class ApplicationController {
    @GetMapping("/shutdown")
    fun shutdown() : String {
        return "Bye"
    }
}
