package de.ml.file.generator.config;

/**
 * @author Max on 09.04.2022
 * @project FileGenerator
 * @date 09.04.2022
 **/
public enum ECssConfig {


    CSS_FILE("styles.css"),
    CSS_BODY("body"),
    CURLY_BRACKET_OPEN("{"),
    CURLY_BRACKET_CLOSE("}"),
    FONT_STYLE("font-style: normal;"),
    FONT_WEIGHT("font-weight: normal;"),
    DEFAULT_MARGIN("margin: 0;"),
    DEFAULT_PADDING("padding: 0;"),
    STAR("*"),
    BOX_SIZING("box-sizing: border-box;");


    private final String cssConf;

    ECssConfig(String cssConf) {
        this.cssConf = cssConf;
    }

    public String getCssConf() {
        return cssConf;
    }
}
