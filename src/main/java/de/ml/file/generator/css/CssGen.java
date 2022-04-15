package de.ml.file.generator.css;

import de.ml.file.generator.config.EConfig;
import de.ml.file.generator.config.ECssConfig;

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


        File cssFile = new File(String.format("%s%s%s", path, File.separator, ECssConfig.CSS_FILE.getCssConf()));


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cssFile.getAbsolutePath()))) {
            writer.write(getCss());

        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }

    }

    private static String getCss() {
        return ECssConfig.CSS_BODY.getCssConf()
                + ECssConfig.CURLY_BRACKET_OPEN.getCssConf()
                + EConfig.NEW_LINE.getConfig()
                + EConfig.TAB.getConfig()
                + ECssConfig.FONT_STYLE.getCssConf()
                + EConfig.NEW_LINE.getConfig()
                + EConfig.TAB.getConfig()
                + ECssConfig.FONT_WEIGHT.getCssConf()
                + EConfig.NEW_LINE.getConfig()
                + EConfig.TAB.getConfig()
                + ECssConfig.DEFAULT_MARGIN.getCssConf()
                + EConfig.NEW_LINE.getConfig()
                + EConfig.TAB.getConfig()
                + ECssConfig.DEFAULT_PADDING.getCssConf()
                + EConfig.NEW_LINE.getConfig()
                + EConfig.TAB.getConfig()
                + ECssConfig.CURLY_BRACKET_CLOSE.getCssConf()
                + EConfig.NEW_LINE.getConfig()
                + ECssConfig.STAR.getCssConf()
                + ECssConfig.CURLY_BRACKET_OPEN.getCssConf()
                + EConfig.NEW_LINE.getConfig()
                + EConfig.TAB.getConfig()
                + ECssConfig.BOX_SIZING.getCssConf()
                + EConfig.NEW_LINE.getConfig()
                + ECssConfig.CURLY_BRACKET_CLOSE.getCssConf();
    }
}
