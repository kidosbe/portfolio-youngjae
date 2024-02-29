package org.youngjae.portfolio.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.youngjae.portfolio.domain.entity.ProjectSkill

interface ProjectSkillRepository : JpaRepository<ProjectSkill, Long>