package de.ml.file.generator.config;

/**
 * @author Max on 09.04.2022
 * @project FileGenerator
 * @date 09.04.2022
 **/
public enum EConfig {


    NEW_LINE("\n"),
    TAB("\t"),
    INFO_COLOR("\u001B[42m"),
    OPERATING_SYSTEM_NAME(System.getProperty("os.name")),
    DIRECTORY(System.getProperty("user.dir"));


    private final String config;

    EConfig(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }
}
