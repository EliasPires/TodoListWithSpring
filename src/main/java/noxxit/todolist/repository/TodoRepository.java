package noxxit.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import noxxit.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
} 