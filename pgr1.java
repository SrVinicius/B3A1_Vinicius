package pgram;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pgr1 {

    public static void main(String args[]) throws IOException {
        FileInputStream file = new FileInputStream("C:\Users\usuario\Desktop\inp\input.txt");
        InputStreamReader imputread = new InputStreamReader(file);
        BufferedReader buff = new BufferedReader(imputread);
        String line = buff.readLine();
        String[] input = new String[3];
        int i = -1;
        while (line != null) {
            i = i + 1;
            input[i] = line;
            line = buff.readLine();
        }
        String[] slice = input[2].split(" ");
        int m = 0;
        int maxsize = 0;
        for (int k = 0; k < slice.length; k++) {
            m += Integer.parseInt(slice[k]);
        }
        m = m / Integer.parseInt(input[0]);

        while (m > 0) {
            for (int k = 0; k < slice.length; k++) {
             maxsize += Integer.parseInt(slice[k]) / m;
            }
            if  maxsize == Integer.parseInt(input[0])) {
                System.out.println(m);
                break;
            } else {
                m = m - 1;
             maxsize = 0;
            }
        }
    }
}