package com.github.devtoolscourse

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "locomotives")
class Locomotive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "locomotive_id")
    var id: Long? = null

    @Column(name = "locomotive_name")
    var name: String? = null

    @Column(name = "locomotive_speed")
    var speed: Double? = null
}

fun locoFromDTO(locomotiveDTO: LocomotiveDTO) = Locomotive().apply {
    name = locomotiveDTO.name
    speed = locomotiveDTO.speed
}
