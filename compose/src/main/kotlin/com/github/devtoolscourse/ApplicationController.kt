package com.github.devtoolscourse

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApplicationController {
    @GetMapping("/shutdown")
    fun shutdown() : String {
        return "Bye"
    }
}
