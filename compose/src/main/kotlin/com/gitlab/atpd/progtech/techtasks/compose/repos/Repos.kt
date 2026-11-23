package com.gitlab.atpd.progtech.techtasks.compose.repos

import com.gitlab.atpd.progtech.techtasks.compose.entities.Locomotive
import org.springframework.data.jpa.repository.JpaRepository

interface LocomotiveRepository : JpaRepository<Locomotive, Long>
