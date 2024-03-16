package springboot.backend.kotlin.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import springboot.backend.kotlin.dao.Menu
import springboot.backend.kotlin.service.FoodService

@RestController
@RequestMapping("main")
class FoodController {

    @Autowired
    private lateinit var service : FoodService;
    @GetMapping
    fun getFood(): Collection<Menu> = service.getFood()
}