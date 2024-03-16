package springboot.backend.kotlin.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import springboot.backend.kotlin.dao.Menu
import springboot.backend.kotlin.datasource.menuInterface

@Service
class FoodService {

    @Autowired
    private lateinit var datasource: menuInterface
    fun getFood() : Collection<Menu> = datasource.findAll()
}