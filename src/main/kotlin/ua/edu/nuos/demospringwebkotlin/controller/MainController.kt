package ua.edu.nuos.demospringwebkotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/")
class MainController {

    @RequestMapping("/hello/{username}/{color}")
    fun hello(model: Model, @PathVariable color: String, @PathVariable username: String): String {
        model.addAttribute("user", username)
        model.addAttribute("color", color)
        return "hello"
    }
}
