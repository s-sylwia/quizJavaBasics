# quizJavaBasics
QuizJavaBasics is a simply Java program that allows users to take a quiz based on JSON-formatted questions, providing a command-line interface for a simple and interactive quiz experience. The program uses the Jackson library for JSON parsing.

## Table of Contents

1. [Introduction](#introduction)
2. [Installation](#installation)
3. [Usage](#usage)
4. [Contributing](#contributing)
5. [License](#license)

## Introduction

The QuizJavaBasics program is designed to provide a basic quiz-playing experience in the Java programming language. It loads quiz questions from a JSON file and presents them to the user. The user can then input their answers, and the program evaluates the answers and provides a final score.

## Installation

To use the QuizJavaBasics program, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Build the project to resolve dependencies.
4. Ensure that the required Jackson library is included in your project.
5. Place your quiz questions in a JSON file and update the `Quiz` constructor to use the correct file name.

## Usage

To run the QuizJavaBasics program, execute the `play()` method in the `Quiz` class. The program will load the quiz questions from the JSON file and present them one by one to the user. The user can input their answer for each question, and the program will provide feedback on whether the answer is correct or incorrect. At the end of the quiz, the program will display the final score.

## Contributing

Contributions to QuizJavaBasics are welcome! If you have any suggestions, bug reports, or feature requests, please open an issue on the GitHub repository.

## License

QuizJavaBasics is released under the [MIT License](LICENSE)
