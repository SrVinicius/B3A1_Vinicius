package pgram;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pgr3 {
    public static void main(String args[]) throws IOException {
        FileInputStream file = new FileInputStream("C:\Users\usuario\Desktop\inp\input.txt");
        InputStreamReader inputread = new InputStreamReader(file);
        BufferedReader buff = new BufferedReader(inputread);
        String line = buff.readLine();
        String[] input = new String[2];
        int i = -1;
        while (line != null) {
            i = i + 1;
            input[i] = line;
            line = buff.readLine();
        }
        String[] input1 = input[0].split(" ");
        String[] input2 = input[1].split(" ");
        int[] input1um = new int[input1.length];
        int[] input2dois = new int[input2.length];
        for (int j = 0; j < input1.length; j++) {
            input1um[j] = Integer.parseInt(input1[j]);
            input2dois[j] = Integer.parseInt(input2[j]);
        }
        if (input2dois[0] >= input1um[0] && input2dois[0] <= input1um[2] && input2dois[1] >= input1um[1]
                && input2dois[1] <= input1um[3]) {
            System.out.println("1");
        } else {
            if (input2dois[2] >= input1um[0] && input2dois[2] <= input1um[2] && input2dois[3] >= input1um[1]
                    && input2dois[3] <= input1um[3]) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}