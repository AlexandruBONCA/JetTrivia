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

UI (Compose)
    ↓
ViewModel
    ↓
Repository
    ↓
Retrofit / Room
    ↓
External Trivia API / Local Database

## API

Trivia questions and answers are retrieved from an external REST API.



## Screenshots

[...screenshots...]
