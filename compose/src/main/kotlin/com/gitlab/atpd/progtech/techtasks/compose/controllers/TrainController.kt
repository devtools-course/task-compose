package com.gitlab.atpd.progtech.techtasks.compose.controllers

import com.gitlab.atpd.progtech.techtasks.compose.dtos.LocomotiveDTO
import com.gitlab.atpd.progtech.techtasks.compose.entities.locoFromDTO
import com.gitlab.atpd.progtech.techtasks.compose.repos.LocomotiveRepository
import org.springframework.web.bind.annotation.*


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
