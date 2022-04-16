package de.ml.file.generator.config;

/**
 * @author Max on 09.04.2022
 * @project FileGenerator
 * @date 09.04.2022
 **/
public enum EConfig {


    NEW_LINE {
        @Override
        public String toString() {
            return "\n";
        }
    },
    TAB {
        @Override
        public String toString() {
            return "\t";
        }
    },
    INFO_COLOR {
        @Override
        public String toString() {
            return "\u001B[42m";
        }
    },
    OPERATING_SYSTEM_NAME {
        @Override
        public String toString() {
            return System.getProperty("os.name");
        }
    },

    DIRECTORY {
        @Override
        public String toString() {
            return System.getProperty("user.dir");
        }
    };
}
