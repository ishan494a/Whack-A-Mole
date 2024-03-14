# Whack-A-Mole Game

## Introduction
Whack-A-Mole is a simple and classic arcade game where the player has to hit the appearing moles. This project implements a digital version of the game using JavaFX.

## Features
- Random spawning of moles on a grid-based board.
- Moles disappear after a certain duration if not whacked.
- Score tracking system.
- Play and reset functionality.
- Integration with JDBC for player high score tracking. (To be implemented)

## Getting Started
### Prerequisites
- Java Development Kit (JDK) installed on your system.
- An integrated development environment (IDE) like IntelliJ IDEA or Eclipse.

### Installation and Running
1. Clone or download the project files to your local machine.
2. Set up the database by running the provided SQL script to create necessary tables.
3. Configure the database connection details in the project.
4. Open the project in your preferred IDE.
5. Ensure that the necessary JavaFX libraries are correctly configured in your IDE.
6. Run the `MoleGameController.java` file to start the game.
7. Click the "Play" button to begin the game.
8. Use your mouse to click on the appearing moles to whack them.
9. The game ends after a certain number of rounds (currently set to 20), after which you can click the "Reset" button to play again.

## Usage
- Click the "Play" button to start the game.
- Moles will randomly appear on the board.
- Click on a mole with your mouse to whack it.
- Score is displayed on the top-left corner of the screen.
- After the game ends, click the "Reset" button to play again.

## Technical Details
- The game is implemented in Java using the JavaFX framework.
- `MoleGameController.java` is the main controller class that handles the game logic.
- Moles are represented as JavaFX `ImageView` objects.
- Random moles are spawned on a `GridPane` board.
- Score is tracked using a simple integer variable.
- Timelines are used for mole spawning and disappearance.
- Images for moles are loaded from resources.
- Integration with JDBC (Java Database Connectivity) for storing and retrieving player high scores.

## Snapshot
![Screenshot 2024-03-13 at 5 10 43 AM](https://github.com/ishan494a/Whack-A-Mole/assets/128569642/48380639-20dc-49d5-bb80-37ee12f1e298)


