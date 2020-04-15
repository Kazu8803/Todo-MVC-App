package todo.mvc.app.todo

import java.util.Date
import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
data class Todo (
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private val id: Long,

    @NotNull
    @Size(min = 2, max = 100)
    private val title: String,

    private val completed: Boolean,

    private val updateDate: Date = Date()
)