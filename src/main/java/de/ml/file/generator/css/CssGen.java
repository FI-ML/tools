package de.ml.file.generator.css;

import de.ml.file.generator.config.ECSS;
import de.ml.file.generator.config.EConfig;

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

    private static void createCssFile(String dir) {

        String path = String.format("%s%s%s", dir, File.separator, "css");

        System.out.println("CSS " + path);


        File cssFile = new File(String.format("%s%s%s", path, File.separator, ECSS.CSS_FILE));


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cssFile.getAbsolutePath()))) {
            writer.write(getCss());

        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }

    }

    private static String getCss() {
        return new StringBuilder()
                .append(ECSS.CSS_BODY) //
                .append(ECSS.CURLY_BRACKET_OPEN) //
                .append(EConfig.NEW_LINE) //
                .append(EConfig.TAB) //
                .append(ECSS.FONT_STYLE) //
                .append(EConfig.NEW_LINE) //
                .append(EConfig.TAB) //
                .append(ECSS.FONT_WEIGHT) //
                .append(EConfig.NEW_LINE) //
                .append(EConfig.TAB) //
                .append(ECSS.DEFAULT_MARGIN) //
                .append(EConfig.NEW_LINE)  //
                .append(EConfig.TAB) //
                .append(ECSS.DEFAULT_PADDING) //
                .append(EConfig.NEW_LINE) //
                .append(EConfig.TAB) //
                .append(ECSS.CURLY_BRACKET_CLOSE) //
                .append(EConfig.NEW_LINE) //
                .append(ECSS.STAR) //
                .append(ECSS.CURLY_BRACKET_OPEN) //
                .append(EConfig.NEW_LINE) //
                .append(EConfig.TAB) //
                .append(ECSS.BOX_SIZING) //
                .append(EConfig.NEW_LINE) //
                .append(ECSS.CURLY_BRACKET_CLOSE) //
                .toString();
    }
}
