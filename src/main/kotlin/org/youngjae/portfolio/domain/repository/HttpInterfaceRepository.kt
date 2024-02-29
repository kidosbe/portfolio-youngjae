package org.youngjae.portfolio.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.youngjae.portfolio.domain.entity.HttpInterface

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long>