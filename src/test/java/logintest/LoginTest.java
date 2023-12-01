package logintest;

import org.testng.annotations.Test;
import reader.ReadDataFromJason;

import java.io.FileNotFoundException;

public class LoginTest {
    ReadDataFromJason readDataFromJason;
    @Test
    public void t1() throws FileNotFoundException{
        readDataFromJason= new ReadDataFromJason();
        System.out.println(readDataFromJason.readJsonFile().URL);
    }
    @Test
    public void t2() throws FileNotFoundException{
        readDataFromJason= new ReadDataFromJason();
        System.out.println(readDataFromJason.readJsonFile().Login.validCreadential.username());
        System.out.println(readDataFromJason.readJsonFile().Login.validCreadential.password());
    }

    }

