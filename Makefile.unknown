CXX = g++
CXXFLAGS = -Wall -Wextra -Werror -std=c++20
JAVA = java
JAVAC = javac
JAVACFLAGS = -Xlint -Werror

all: Lab1.class

Lab1.class: Lab1.java
	$(JAVAC) $(JAVACFLAGS) Lab1.java

run: Lab1.class
	$(JAVA) Lab1 $(ARG)

clean:
	rm -f Lab1.class
