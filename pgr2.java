package pgram;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pg2 {

    public static void main(String args[]) throws IOException {
        FileInputStream file = new FileInputStream("C:\Users\usuario\Desktop\inp\input.txt");
        InputStreamReader imputread = new InputStreamReader(arquivo);
        BufferedReader buff = new BufferedReader(imputread);
        String line = buff.readLine();
        String input1 = line;
        line = buff.readLine();
        String[] inputsepum = input1.split(" ");
        String[] input = new String[Integer.parseInt(inputsepum[1])];
        int i = -1;
        while (line != null) {
            i = i + 1;
            input[i] = line;
            line = buff.readLine();
        }
        int[] sellers = new int[Integer.parseInt(inputsepum[0])];
        int[] performance = new int[Integer.parseInt(inputsepum[0])];
        int end = 1;
        for (int j = 0; j < sellers.length; j++) {
            try {
                sellers[j] = Integer.parseInt(input[j]);
                input[j] = "0";
            } catch (Exception v) {
                System.out.println("Não existem ligações suficientes para o número de vendedores");
            }
        }
        while (end == 1) {
            end = 0;
            for (int j = 0; j < sellers.length; j++) {
                sellers[j] = sellers[j] - 1;
                if (sellers[j] == 0) {
                    performance[j] = performance[j] + 1;
                }
            }
            for (int j = 0; j < sellers.length; j++) {
                for (int k = 0; k < input.length; k++) {
                    if (sellers[j] == 0 && Integer.parseInt(input[k]) != 0) {
                        try {
                            sellers[j] = Integer.parseInt(input[k]);
                            input[k] = "0";
                        } catch (Exception v) {
                            System.out.println("Não existem ligações suficientes para o número de vendedores");
                        }
                    }
                }
            }
            for (int j = 0; j < sellers.length; j++) {
                if (sellers[j] > 0) {
                    end = 1;
                }
            }
        }
        for (int j = 0; j < sellers.length; j++) {
            System.out.println(j + 1 + " " + performance[j]);
        }
    }
}
