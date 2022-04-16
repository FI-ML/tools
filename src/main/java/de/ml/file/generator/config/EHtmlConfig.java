package de.ml.file.generator.config;

/**
 * @author Max on 09.04.2022
 * @project FileGenerator
 * @date 09.04.2022
 **/
public enum EHtmlConfig {

    HTML_FILE_NAME("index.html"),

    HTML_TAG("<!DOCTYPE html>"),
    HTM_OPEN_TAG("<html lang=\"de\">"),
    HTM_CLOSE_TAG("</html>"),
    HEAD_OPEN_TAG("<head>"),
    HEAD_CLOSE_TAG("</head>"),
    META_TAG("<meta charset=\"utf-8\">"),
    META_VIEWPORT("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"),
    TITLE_OPEN_TAG("<title>"),
    TITLE_CLOSE_TAG("</title>"),
    CSS_LINK(String.format("%s%s%s%s", "<link rel=\"stylesheet\" type=\"text/css\" href=\"css", "/", "styles.css", "\">")),
    BODY_TAG("<body>"),
    BODY_CLOSE_TAG("</body>");


    private final String htmlTag;

    EHtmlConfig(String htmlTag) {
        this.htmlTag = htmlTag;
    }

    public String getHtmlTag() {
        return htmlTag;
    }

}
