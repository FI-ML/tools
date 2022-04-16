package de.ml.file.generator.main;

import de.ml.file.generator.config.EConfig;
import de.ml.file.generator.css.CssGen;
import de.ml.file.generator.html.HtmlGen;

import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Max on 08.04.2022
 * @project FileGenerator
 * @date 09.04.2022
 **/
public class Main {


    public static void main(String[] args) {
        createDirectoriesAndFiles();
    }


    private static void createDirectoriesAndFiles() {
        String titleName = null;
        Set<String> htmlTitles = null;

        try (Scanner sc = new Scanner(System.in)) {
            titleName = getTitle(sc);

            deleteDirectoryIsExist(titleName);

            System.out.println();
            htmlTitles = getHtmlTitles(sc);
        } catch (Exception e) {
            System.err.println("ERROR: Scanner have problem, " + e.getMessage());
            return;
        }

        String dir = getDirectoryForHtmlAndCss(titleName);

        new HtmlGen(dir, htmlTitles);
        new CssGen(dir);
    }

    private static String getTitle(Scanner sc) {
        System.out.println("Please enter your project title");

        return sc.nextLine().toLowerCase(Locale.ROOT).trim();
    }


    private static Set<String> getHtmlTitles(Scanner sc) {

        String input = "";

        Set<String> titles = new HashSet<>();
        if (getWithIndexHtml(sc)) {
            titles.add("index.html");
            System.out.println("index.html files was added");
        }
        System.out.println();
        System.out.println("Add your html files, enter q to exit");

        while (isQuiet(input)) {
            input = sc.next().toLowerCase(Locale.ROOT).trim();

            if (isQuiet(input)) {
                titles.add(checkInputBeforeGet(input));
            }
        }
        return titles;
    }


    private static boolean getWithIndexHtml(Scanner sc) {
        System.out.print("You need a index.html (y/n): ");

        String input = "";
        boolean yesOrNo = false;

        while (!yesOrNo) {
            input = sc.nextLine().toLowerCase(Locale.ROOT).trim();
            yesOrNo = getYesOrNo(input);
        }
        return input.equals("y");
    }

    private static boolean getYesOrNo(String input) {
        return (input.equals("y") || input.equals("n"));
    }


    private static boolean isQuiet(String input) {
        return !input.equals("q");
    }

    private static String getDirectoryForHtmlAndCss(String titleName) {
        String globalDirectory = createDirectory(String.format("%s%s%s", EConfig.DIRECTORY, File.separator, titleName));


        String src = createDirectory(String.format("%s%s%s", globalDirectory, File.separator, "src"));

        createDirectory(String.format("%s%s%s", src, File.separator, "css"));

        return src;
    }


    private static String createDirectory(String path) {
        File fileDirectory = new File(path);

        if (fileDirectory.mkdir()) {
            return fileDirectory.getPath();
        } else {
            System.err.println("Failed to create directory: " + fileDirectory.getPath());
            return "";
        }
    }

    private static void deleteDirectoryIsExist(String titleName) {
        File file = new File(String.format("%s%s%s", EConfig.DIRECTORY, File.separator, titleName));

        if (file.exists()) {
            System.out.println("Directory exist, generator close good bye");
            System.exit(200);
        }
    }

    private static String checkInputBeforeGet(String input) {
        if (input.contains(".html")) {
            return input;
        } else {
            return input + ".html";
        }
    }

}
