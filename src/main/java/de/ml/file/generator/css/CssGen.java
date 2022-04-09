package de.ml.file.generator.css;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Max on 09.04.2022
 * @project FileGenerator
 * @date 09.04.2022
 **/
public class CssGen {

    public CssGen(String dir) {
        createCssFile(dir);
    }

    private static final String NEW_LINE = "\n";

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

    private static void createCssFile(String dir) {

        String path = String.format("%s%s%s", dir, File.separator, "css");

        System.out.println("CSS " + path);


        File cssFile = new File(String.format("%s%s%s", path, File.separator, CSS_FILE));


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cssFile.getAbsolutePath()))) {
            writer.write(getCss());

        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }

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
