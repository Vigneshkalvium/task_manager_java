
# Task Manager Fullstack Project

This project is a fullstack Task Manager application with a Spring Boot backend and a React + Tailwind CSS frontend.

## Backend: Spring Boot API
- **Tech:** Spring Boot, Spring Data JPA, H2 (dev) / PostgreSQL (prod), JWT Security
- **Features:**
	- User registration & login (JWT authentication)
	- CRUD APIs for tasks
	- Filter tasks by status (pending/completed)
	- Custom exception handling
	- CORS configuration for frontend integration
- **Run:**
	1. Open `task-manager-api` folder
	2. Run `mvn spring-boot:run`
	3. API available at `http://localhost:8080`

## Frontend: React + Tailwind CSS
- **Tech:** React, Tailwind CSS
- **Features:**
	- User registration & login UI
	- Task creation, update, delete, mark as completed
	- Filter tasks by status
	- Connects to backend via REST API
- **Run:**
	1. Open `client` folder
	2. Run `npm install` then `npm run dev`
	3. App available at `http://localhost:5173`

## CORS Setup
- The backend includes a CORS configuration (`WebConfig.java`) to allow requests from the React frontend.
- If you change the frontend port, update the allowed origin in `WebConfig.java`.

## Usage
1. Start backend (`mvn spring-boot:run`)
2. Start frontend (`npm run dev`)
3. Register/login, manage tasks, and filter by status in the UI

## Folder Structure
```
task-manager-api/      # Spring Boot backend
client/                # React + Tailwind frontend
```

## Troubleshooting
- If you see CORS errors, ensure the backend is running and the allowed origin matches your frontend URL.
- For database issues, check `application.properties` for H2/PostgreSQL config.

## Author & Credits
Generated and maintained with GitHub Copilot.
