all: compile
compile:
	javac -cp junit4-4.12.jar *.java
run:
	java Main
test:
	java -cp junit4-4.12.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore Tests