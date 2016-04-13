javac -cp ./../JUNIT/junit-4.12.jar:./../JUNIT/hamcrest-core-1.3.jar echo/EchoTest.java echo/Echo.java
java -cp ./../JUNIT/junit-4.12.jar:./../JUNIT/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore echo.EchoTest
