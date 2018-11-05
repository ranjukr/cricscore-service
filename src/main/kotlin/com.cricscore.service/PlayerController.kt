package com.cricscore.service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class PlayerController {

    @GetMapping("/players")
    fun players() = "Player"


}