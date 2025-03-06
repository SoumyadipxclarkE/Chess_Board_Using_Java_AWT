# ChessBoard_GUI_Using_Java
 This program simulates a simple chessboard using an 8x8 grid of buttons in a Frame window. The chessboard alternates between black and white squares, which are represented by Button components. The buttons' background color changes based on their position on the grid (even and odd positions create the chessboard pattern).
Key Features:

    GUI Layout: A Frame window is used to hold the chessboard, and a GridLayout is used to arrange the buttons in an 8x8 grid (representing the chessboard).
    Button Behavior: Each button's background color alternates between black and white, creating the visual appearance of a chessboard.
    Event Handling: An ActionListener is added to each button, printing "Performed" to the console when a button is clicked.
    Window Closing: A WindowListener is added to ensure that the program closes the window properly when the user attempts to close it.

How it works:

    Grid Layout: The GridLayout(8,8) arranges the buttons into an 8x8 grid, simulating a chessboard.
    Button Color: The colors of the buttons alternate using the condition (r + c) % 2, where r and c are the row and column indices, ensuring the correct chessboard pattern.
    ActionListener: When any button is clicked, an event is triggered, and a message ("Performed") is printed in the console.

Usage:

    When run, a window will appear with an 8x8 chessboard pattern.
    Clicking on any square will trigger an action, printing "Performed" to the console.

This program is a basic starting point for creating a graphical chessboard in Java. It can be expanded with features like moving pieces, handling game logic, or integrating piece images.
