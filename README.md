# Suckless Pomodoro

This program is a simple & *suckless* productivity tool written in Java using the Swing library which serves to be an efficient tool for those using the Pomodoro technique to complete their daunting tasks. The Pomodoro technique is a productivity technique meant for a person to focus on one task for 25 mins straight. Once the 25 mins are finished, the person takes a break for 5 mins. This technique was created and founded by Francesco Cirillo who is a partner in Cirillo Consulting, a business consulting firm based in Berlin that works with many of the world's largest companies. 

The reason why I call this program *suckless* (despite it using Java as a dependency) is because it is not saturated with too many "user-friendly" features which end up making productivity more complex than simple. It is FOSS & a privacy-respected GUI which stores all your productivity information locally on your computer via a text file. 

### Code Docs
*Under `src/sucklesspomodoro`*

#### `Activity.java`

- This file contains the code for the Activity class, which represents the activity log window.
- It displays the user's activity log and total working minutes.
- Users can navigate back to the home page from this window.

#### `HomePage.java`

- This file contains the code for the HomePage class, which represents the main dashboard window.
- It provides options for users to navigate to different sections of the application, such as activity log, to-do list, and Pomodoro timer.

#### `LoginFrame.java`

- This file contains the code for the LoginFrame class, which represents the login window.
- Users can log in to the application using their credentials or navigate to the sign-up window to create a new account.

#### `Main.java`

- This file contains the main method to launch the application.
- It initializes the login window when the program starts.

#### `PomoTimer.java`

- This file contains the code for the PomoTimer class, which represents the Pomodoro timer window.
- Users can start, pause, and reset the timer to manage their work sessions effectively.

#### `SignUpFrame.java`

- This file contains the code for the SignUpFrame class, which represents the sign-up window.
- Users can create a new account by providing their details and credentials.

#### `ToDo.java`

- This file contains the code for the ToDo class, which represents the to-do list window.
- Users can add tasks to their to-do list and mark them as completed.

### Usage

1. Run the `Main.java` file to start the application.
2. Log in with existing credentials or sign up for a new account.
3. Use the dashboard to navigate between different features:
   - Activity Log: View your activity history.
   - To-Do List: Manage your tasks.
   - Pomodoro Timer: Use the timer to improve productivity.
4. Log out or exit the application when done.

### Dependencies

- Java Swing library for GUI components.
- File handling for data storage and retrieval.

### Contributing

Contributions to the project are welcome. Feel free to fork the repository, make improvements, and submit pull requests.
