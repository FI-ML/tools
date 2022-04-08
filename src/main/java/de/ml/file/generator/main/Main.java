package de.ml.file.generator.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Max on 08.04.2022
 * @project FileGenerator
 * @package
 **/
public class Main {

    public static final String INFO_COLOR = "\u001B[42m";
    public static final String OPERATING_SYSTEM_NAME = System.getProperty("os.name");
    /*FILE*/
    private static final String DIRECTORY = System.getProperty("user.dir");
    private static final String HTML_FILE = "index.html";

    private static final String NEW_LINE = "\n";

    /*HTML*/
    private static final String HTML_TAG = "<!DOCTYPE html>";
    private static final String HTM_OPEN_TAG = "<htm lang=\"de\">";
    private static final String HTM_CLOSE_TAG = "</htm>";
    private static final String HEAD_OPEN_TAG = "<head>";
    private static final String HEAD_CLOSE_TAG = "</head>";
    private static final String META_TAG = " <meta charset=\"utf-8\">";
    private static final String TITLE_OPEN_TAG = " <title>";
    private static final String TITLE_CLOSE_TAG = "</title>";
    private static final String CSS_LINK = String.format("%s%s%s%s%s%s", "<link rel=\"stylesheet\" type=\"text/css\" href=\"src",File.separator,"css",File.separator,"styles.css","\">");
    private static final String BODY_TAG = " <body>";
    private static final String BODY_CLOSE_TAG = " </body>";


    /*CSS*/
    private static final String CSS_FILE = "styles.css";
    private static final String CSS_BODY = "body";
    private static final String CURLY_BRACKET_OPEN = "{";
    private static final String CURLY_BRACKET_CLOSE = "}";
    private static final String FONT_STYLE = "font-style: normal;";
    private static final String FONT_WEIGHT = "font-weight: normal;";
    private static final String DEFAULT_MARGIN = " margin: 0;";
    private static final String DEFAULT_PADDING = "padding: 0;";
    private static final String STAR = "*";
    private static final String BOX_SIZING = "box-sizing: border-box;";


    public static void main(String[] args) {

        System.out.println("Please enter the title of your html file");
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine().trim();

            createDirectoriesAndFiles(name);

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }


    private static void createDirectoriesAndFiles(String titleName) {


        String dir = getDirectoryForHtmlAndCss(titleName);

        if (dir.isEmpty()) {
            return;
        }

        createHTML(dir, titleName);
        createCssFile(dir);
    }

    private static String getDirectoryForHtmlAndCss(String titleName) {
        String globalDirectory = createDirectory(String.format("%s%s%s", DIRECTORY, File.separator, titleName));

        String src = createDirectory(String.format("%s%s%s",
                globalDirectory, File.separator, "src"));

        createDirectory(String.format("%s%s%s", src, File.separator, "css"));

        return src;
    }

    private static void createHTML(String dir, String titleName) {


        String path = String.format("%s%s%s", dir, File.separator, HTML_FILE);

        System.out.println("HTML "+ path);

        File htmlFile = new File(path);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFile.getAbsolutePath()))) {
            writer.write(getHtml(titleName));
        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }


    private static void createCssFile(String dir) {

        String path = String.format("%s%s%s", dir, File.separator, "css");

        System.out.println("CSS "+ path);


        File cssFile = new File(String.format("%s%s%s", path, File.separator, CSS_FILE));


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cssFile.getAbsolutePath()))) {
            writer.write(getCss());

        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }

    }


    private static String createDirectory(String path) {
        File fileDirectory = new File(path);

        deleteDirectoryIsExist(fileDirectory);

        if (fileDirectory.mkdir()) {
            System.out.println("Directory is created: " + fileDirectory.getPath());
            return fileDirectory.getPath();
        } else {
            System.err.println("Failed to create directory: " + fileDirectory.getPath());
            return "";
        }
    }

    private static void deleteDirectoryIsExist( File fileDirectory){


        if(fileDirectory.exists()){
            if(fileDirectory.delete()){
                System.out.println(INFO_COLOR + "This directory is deleted");
            }
        }
    }

    private static String getHtml(String titleName) {

        return HTML_TAG
                + NEW_LINE
                + HTM_OPEN_TAG
                + NEW_LINE
                + HEAD_OPEN_TAG
                + NEW_LINE
                + META_TAG
                + NEW_LINE
                + TITLE_OPEN_TAG
                + titleName
                + TITLE_CLOSE_TAG
                + NEW_LINE
                + CSS_LINK
                + NEW_LINE
                + HEAD_CLOSE_TAG
                + NEW_LINE
                + BODY_TAG
                + NEW_LINE
                + BODY_CLOSE_TAG
                + NEW_LINE +
                HTM_CLOSE_TAG;
    }

    private static String getCss() {
        return CSS_BODY
                + CURLY_BRACKET_OPEN
                + NEW_LINE
                + FONT_STYLE
                + NEW_LINE
                + FONT_WEIGHT
                + DEFAULT_MARGIN
                + NEW_LINE
                + DEFAULT_PADDING
                + NEW_LINE
                + CURLY_BRACKET_CLOSE
                + NEW_LINE
                + STAR
                + CURLY_BRACKET_OPEN
                + NEW_LINE
                + BOX_SIZING
                + NEW_LINE
                + CURLY_BRACKET_CLOSE;

    }

}
