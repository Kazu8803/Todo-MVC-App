package todo.mvc.app.todo

import org.hibernate.annotations.common.util.impl.LoggerFactory.logger
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/todos")
class TodoAPI(private val stockService: TodoService) {

    private val log = logger(this.javaClass)

    @GetMapping
    fun findAll() : ResponseEntity<List<Todo>> = ResponseEntity.ok(stockService.findAll())

    @PostMapping
    fun saveAll(@Valid @RequestBody todos: List<Todo>): ResponseEntity<List<Todo>> {
        log.info("$todos")
        return ResponseEntity.ok(stockService.saveAll(todos))
    }

}