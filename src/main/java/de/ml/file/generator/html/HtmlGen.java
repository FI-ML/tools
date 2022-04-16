package de.ml.file.generator.html;

import de.ml.file.generator.config.EConfig;
import de.ml.file.generator.config.EHTML;

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

        return new StringBuilder()
                .append(EHTML.HTML_TAG) //
                .append(EConfig.NEW_LINE) //
                .append(EHTML.HTM_OPEN_TAG) //
                .append(EConfig.NEW_LINE)//
                .append(EHTML.HEAD_OPEN_TAG) //
                .append(EConfig.NEW_LINE)//
                .append(EConfig.TAB)//
                .append(EHTML.META_TAG) //
                .append(EConfig.NEW_LINE)//
                .append(EConfig.TAB)//
                .append(EHTML.META_VIEWPORT) //
                .append(EConfig.NEW_LINE)//
                .append(EConfig.TAB)//
                .append(EHTML.TITLE_OPEN_TAG) //
                .append(titleName.replaceAll(".html", "")) //
                .append(EHTML.TITLE_CLOSE_TAG)//
                .append(EConfig.NEW_LINE)//
                .append(EConfig.TAB)//
                .append(EHTML.CSS_LINK)//
                .append(EConfig.NEW_LINE)//
                .append(EHTML.HEAD_CLOSE_TAG)//
                .append(EConfig.NEW_LINE)//
                .append(EHTML.BODY_TAG)//
                .append(EConfig.NEW_LINE)//
                .append(EHTML.BODY_CLOSE_TAG)//
                .append(EConfig.NEW_LINE)//
                .append(EHTML.HTM_CLOSE_TAG) //
                .toString();
    }
}
