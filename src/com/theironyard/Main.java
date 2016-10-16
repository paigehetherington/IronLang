package com.theironyard;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        File f = new File("test.iron");
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String cmd = line.substring(0, line.indexOf(" "));//get command from line of code
            String params = line.substring(line.indexOf(" ") +1);
            if (cmd.equals("PREACH_IT")) {
                System.out.println(params);
            }
        }

    }
}
