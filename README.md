Members: Nesved Londoño Quintero and Tomas Alejandro Vasquez Arredondo
operating system windows 11 pro version 21H2
C++ version: g++12.2.0
java version: java20
Work documentation
C++ part:
The function get_mean takes a 2D array of integers as input and returns the arithmetic mean of all the elements in the array. The function takes two parameters: a pointer to the first element of the array and the size of the array.
The for loop iterates over each element in the array and adds its value to the variable sum. The expression *(arr + i) is equivalent to arr[i] and is used to access the i-th element of the array. Once the sum of all elements has been computed, the function returns the arithmetic mean by dividing the sum by the size of the array.
In the main function, the program reads the filename passed as a command-line argument and opens it using an ifstream object. It then reads the integers from the file and stores them in a 2D array nums. The get_mean function is then called with nums and the size of the array as arguments to compute the arithmetic mean. Finally, the program prints the result to the console.

java part:
The Java file takes care of reading the name of the file containing the integers via command line arguments and then calls the compiled C++ program to compute the arithmetic mean of the numbers. The result is displayed on the standard output of the console.
The communication between the Java file and the C++ file is done by creating a child process using the Java process class and redirecting the standard input and output of the child process to the Java parent process.

Make part:
The Makefile has three targets: all, clean, and run.
The all target is the default target, which builds both the C++ and Java programs. The C++ program is compiled using the g++ compiler with the -Wall, -Wextra, and -Werror options to enable additional warnings and treat warnings as errors. The Java program is compiled using the javac compiler with the -Xlint and -Werror options to enable additional warnings and treat warnings as errors.
The clean target removes any generated files, including the bin directory containing the compiled Java class files and the Mean executable file.
The run target executes the Java program, passing the filename specified as a command-line argument. The program reads the integers from the specified file and computes their arithmetic mean.
The bin/Mean dependency for the run target ensures that the Java program is compiled before it is executed.
The bin/Mean target compiles the C++ program using the g++ compiler with the -Wall, -Wextra, and -Werror options. The compiled executable is placed in the bin directory.

To compile and run the program, you could do the following:
$ make ARG=matrix.txt
$ make run ARG=matrix.txt
