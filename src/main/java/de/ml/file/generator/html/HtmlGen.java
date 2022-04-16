package de.ml.file.generator.html;

import de.ml.file.generator.config.EConfig;
import de.ml.file.generator.config.EHtmlConfig;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

/**
 * @author Max on 09.04.2022
 * @project FileGenerator
 * @date 09.04.2022
 **/


public class HtmlGen {


    public HtmlGen(String path, Set<String> fileNames) {
        createHTML(path, fileNames);
    }

    private void createHTML(String dir, Set<String> fileNames) {

        for (String fileName : fileNames) {

            String path = String.format("%s%s%s", dir, File.separator, fileName);
            File htmlFile = new File(path);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFile.getAbsolutePath()))) {
                writer.write(getHtml(fileName));
            } catch (IOException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }
    }


    private String getHtml(String titleName) {

        return EHtmlConfig.HTML_TAG.getHtmlTag()
                + EConfig.NEW_LINE.getConfig()
                + EHtmlConfig.HTM_OPEN_TAG.getHtmlTag()
                + EConfig.NEW_LINE.getConfig()
                + EHtmlConfig.HEAD_OPEN_TAG.getHtmlTag()
                + EConfig.NEW_LINE.getConfig()
                + EConfig.TAB.getConfig()
                + EHtmlConfig.META_TAG.getHtmlTag()
                + EConfig.NEW_LINE.getConfig()
                + EConfig.TAB.getConfig()
                + EHtmlConfig.META_VIEWPORT.getHtmlTag()
                + EConfig.NEW_LINE.getConfig()
                + EConfig.TAB.getConfig()
                + EHtmlConfig.TITLE_OPEN_TAG.getHtmlTag()
                + titleName.replaceAll(".html", "")
                + EHtmlConfig.TITLE_CLOSE_TAG.getHtmlTag()
                + EConfig.NEW_LINE.getConfig()
                + EConfig.TAB.getConfig()
                + EHtmlConfig.CSS_LINK.getHtmlTag()
                + EConfig.NEW_LINE.getConfig()
                + EHtmlConfig.HEAD_CLOSE_TAG.getHtmlTag()
                + EConfig.NEW_LINE.getConfig()
                + EHtmlConfig.BODY_TAG.getHtmlTag()
                + EConfig.NEW_LINE.getConfig()
                + EHtmlConfig.BODY_CLOSE_TAG.getHtmlTag()
                + EConfig.NEW_LINE.getConfig()
                + EHtmlConfig.HTM_CLOSE_TAG.getHtmlTag();
    }
}
