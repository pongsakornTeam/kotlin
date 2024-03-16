package springboot.backend.kotlin.dao

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Menu
    (
        @Id
        val menuId: Int,
        val menu: String,
        val ingredients:String
    )