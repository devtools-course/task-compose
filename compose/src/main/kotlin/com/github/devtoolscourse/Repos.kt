package com.github.devtoolscourse

import org.springframework.data.jpa.repository.JpaRepository

interface LocomotiveRepository : JpaRepository<Locomotive, Long>
