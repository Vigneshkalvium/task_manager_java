package com.example.taskmanager;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskControllerTest {
    @Autowired
    private TaskService taskService;

    @Test
    public void testCreateTask() {
        Task task = new Task();
        task.setTitle("Test Task");
        task.setDescription("Test Description");
        task.setCompleted(false);
        Task savedTask = taskService.createTask(task);
        assertNotNull(savedTask.getId());
        assertEquals("Test Task", savedTask.getTitle());
    }
}
