/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mirea.com.kt.main_4;

import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Практическое задание №4. Вариант 2. Студент: Становова Д.А. Группа РИБО-03-21");

        ArrayList<String> strings = new ArrayList<>();
        String userPATH = getPATH();
        File file = new File(userPATH);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) strings.add(new StringBuilder(scanner.nextLine()).reverse().toString());
        System.out.println(strings);

        scanner.close();

        File newfile = new File(getPATH());
        try(FileWriter writer = new FileWriter(newfile)){
            for (String i : strings) writer.write(i + " ");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getPATH(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь файла: ");
        return scanner.nextLine();
    }
}

