package com.dashaleshok.todoapp.repositories;

import com.dashaleshok.todoapp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long>{

}



