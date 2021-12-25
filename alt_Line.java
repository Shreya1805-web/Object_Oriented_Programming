/*

2. Write a program to take input from the user for two files, “file_1.txt” and “file_2.txt” (until they
enter -1) and create another file “file_3.txt” which has alternating lines from file_1.txt and file_2.txt. Print the contents of file_3.txt. Note: First line printed always belongs to file_1.txt,
next line from file_2.txt, then file_1txt and so on.
Input 1
Enter contents of file_1.txt:
a
b
c
-1
Enter contents of file_2.txt:
d
e
f
-1
Output 1
a
d
b
e
c
f
Input 2
Enter contents of file_1.txt:
Iguanas were falling out of the trees.
The lake is a long way from here.
-1
Enter contents of file_2.txt:
The sky is clear; the stars are twinkling.
-1
Output 2
Iguanas were falling out of the trees.
The sky is clear; the stars are twinkling.
The lake is a long way from here.
Input 3
Enter contents of file_1.txt:
stocks
football
overpass
graffiti
-1
Enter contents of file_2.txt:
polyphia
sandman
-1
Output 3
stocks
polyphia
football
sandman
overpass

*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class alt_Line {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw2 = new FileWriter("file_2.txt");
        System.out.println("Enter contents of file_1.txt: ");
        FileWriter fw1 = new FileWriter("file_1.txt");

        String s = "o";
        while (!s.equals("-1")) {
            s = sc.nextLine();
            if (!s.equals("-1")) {
                for (int i = 0; i < s.length(); i++) {
                    fw1.write(s.charAt(i));

                }
                fw1.write("\n");
            }
        }
        fw1.close();
        System.out.println("Enter contents of file_2.txt: ");
        String s2 = "p";
        while (!s2.equals("-1")) {
            s2 = sc.nextLine();
            if (!s2.equals("-1")) {
                for (int i = 0; i < s2.length(); i++) {
                    fw2.write(s2.charAt(i));
                }
                fw2.write("\n");
            }
        }
        fw2.close();
        try {
            File file = new File("file_1.txt");
            File file2 = new File("file_2.txt");
            FileReader fr = new FileReader(file);
            FileReader fr2 = new FileReader(file2);
            BufferedReader br = new BufferedReader(fr);
            BufferedReader br2 = new BufferedReader(fr2);
            String line = br.readLine();
            String line2 = br2.readLine();
            FileWriter fw3 = new FileWriter("file_3.txt");
            while (line != null && line2 != null) {
                if (line != null) {
                    fw3.write(line);
                    fw3.write('\n');
                    line = br.readLine();
                }
                if (line2 != null) {
                    fw3.write(line2);
                    fw3.write('\n');
                    line2 = br2.readLine();
                }
            }
            if (line != null) {
                    fw3.write(line);
                    fw3.write('\n');
                    line = br.readLine();
                }
            if (line2 != null) {
                fw3.write(line2);
                fw3.write('\n');
                line2 = br2.readLine();
            }
            br2.close();
            br.close();
            fw3.close();
            File file3 = new File("file_3.txt");
            FileReader fr3 = new FileReader(file3);
            BufferedReader br3 = new BufferedReader(fr3);
            String line3;
            while ((line3 = br3.readLine()) != null) {
                System.out.println(line3);
            }
            br3.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
        sc.close();
    }
}
