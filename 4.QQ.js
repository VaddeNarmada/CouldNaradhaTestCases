<!DOCTYPE html>
<html lang="en">
<head>
    <title>To-Do List</title>
</head>
<body>
    <h2>To-Do List</h2>
    <input type="text" id="taskInput" placeholder="Add a new task">
    <button onclick="addTask()">Add Task</button>
    <ul id="taskList"></ul>

    <script>
        function addTask() {
            const taskInput = document.getElementById("taskInput");
            const taskList = document.getElementById("taskList");

            if (taskInput.value.trim() === "") return; 

            const li = document.createElement("li");
            li.textContent = taskInput.value;

            const removeButton = document.createElement("button");
            removeButton.textContent = "Remove";
            removeButton.onclick = () => li.remove();

            li.appendChild(removeButton);
            taskList.appendChild(li);
            taskInput.value = "";
        }
    </script>
</body>
</html>
