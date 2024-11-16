# Data Structures Lab Sheet 4

## How to Run the Code

1. **Clone the repository**:
    On the terminal, copy and paste the following command

   ```bash
   git clone https://github.com/Aryan-Dot-Dev/Lab-Sheet-4
   ```

2. **Go to the Lab Sheet 1 directory**
    Navigate to ```Lab-Sheet-4 ```
    ```
    cd .\Lab-Sheet-4
    ```
   
3. **Compile the Code**:
    Use javac to create Class Files for all Java files.
    All the code is compiled in out/src and out/test directories
    ```bash
    javac -d out src/CircularLinkedList.java test/CircularLinkedListTest.java
    javac -d out src/DoublyLinkedList.java test/DoublyLinkedListTest.java
    javac -d out src/PostfixCalculator.java test/PostfixCalculatorTest.java
    javac -d out src/PriorityQueues.java test/PriorityQueuesTest.java
    javac -d out src/SinglyLinkedList.java test/SinglyLinkedListTest.java
    javac -d out src/TicketQueue.java test/TicketQueueTest.java
    ```

4. **Run the Code**:
    Use java command to run files individually.
    ```bash
    java -cp out test.CircularLinkedListTest
    java -cp out test.DoublyLinkedListTest
    java -cp out test.PostfixCalculatorTest
    java -cp out test.PriorityQueuesTest
    java -cp out test.SinglyLinkedListTest
    java -cp out test.TicketQueueTest
    ```

## Repository Overview

1.  All the Java Class files are stored in the ```src``` directory

2. All the TestFiles which will be used to run the program to check test-cases are stored in ```test``` directory

3. After all the javac commands have been executed, all new files will be stored in ```out/src``` and ```out/test``` directory, and will be used to execute the program.