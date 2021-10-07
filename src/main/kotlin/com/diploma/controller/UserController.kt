package com.diploma.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UserController {
    @GetMapping
    fun main() = "Hello User"
}