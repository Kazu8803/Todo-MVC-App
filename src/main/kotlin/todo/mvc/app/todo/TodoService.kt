package todo.mvc.app.todo

import org.springframework.stereotype.Service

@Service
class TodoService(private val stockRepository: TodoRepository) {

    fun findAll(): List<Todo> = stockRepository.findAll()

    fun saveAll(todos: List<Todo>): List<Todo> = stockRepository.saveAll(todos)

}