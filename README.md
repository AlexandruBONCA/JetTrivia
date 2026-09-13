# JetTrivia

A trivia game application built with Kotlin and Jetpack Compose.

## Features

- Fetches trivia questions from an external API
- Multiple-choice questions
- Stores data locally using Room
- Handles loading/error/success states
- Clean separation between UI and data layers

## Tech Stack

- Kotlin
- Jetpack Compose
- Coroutines
- Retrofit
- Room
- ViewModel
- Repository pattern
- REST API

## Architecture
```
UI (Compose)
    ↓
ViewModel
    ↓
Repository
    ↓
Retrofit / Room
    ↓
External Trivia API / Local Database
```

## API

Trivia questions and answers are retrieved from an external REST API.



## Screenshots



<img width="317" height="697" alt="first_question" src="https://github.com/user-attachments/assets/3be1c475-6e66-48a0-8f3c-f076115fcebb" />
<img width="311" height="682" alt="wrong_answer" src="https://github.com/user-attachments/assets/d32681ea-6d77-4302-9a4b-284b90e09eac" />
<img width="332" height="681" alt="right_answer" src="https://github.com/user-attachments/assets/15de566a-b788-4c0c-bf38-84f2b7714c3b" />


