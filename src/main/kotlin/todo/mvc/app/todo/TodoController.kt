package todo.mvc.app.todo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TodoController {

    @GetMapping("/")
    fun list(): String{
        return "todo"
    }

}