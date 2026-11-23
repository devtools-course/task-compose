package com.github.devtoolscourse

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TrainController(
    private val locomotiveRepository: LocomotiveRepository,
) {
    @GetMapping("/loco/{locomotiveId}")
    fun getLocomotiveById(@PathVariable locomotiveId: Long) = locomotiveRepository.findById(locomotiveId)

    @PostMapping("/loco")
    fun createLocomotive(@RequestBody locomotive: LocomotiveDTO) = locomotiveRepository.save(
        locoFromDTO(locomotive)
    )
}
