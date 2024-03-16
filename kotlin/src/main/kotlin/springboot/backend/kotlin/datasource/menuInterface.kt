package springboot.backend.kotlin.datasource

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import springboot.backend.kotlin.dao.Menu

@Repository
interface menuInterface : JpaRepository<Menu, Int> {
}