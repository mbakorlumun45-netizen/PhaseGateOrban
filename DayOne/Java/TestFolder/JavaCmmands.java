java -cp "junit-platform-console-standalone-1.11.0.jar;out" org.junit.platform.console.Console
Launcher --scan-class-path


java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.Console
Launcher --scan-class-path




cd ~/javaTasks/tdd





1. Compile with the JAR on the classpath
javac -cp .:junit-platform-console-standalone-1.13.4.jar TestClass.java

# 2. Run using the 'execute' subcommand and explicit class selection
java -jar junit-platform-console-standalone-1.13.4.jar execute --class-path . --select-class TestClass --details=verbose





import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class numSameValueTest{

    @Test
    public void 
