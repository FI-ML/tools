package de.ml.file.generator.config;

/**
 * @author Max on 09.04.2022
 * @project FileGenerator
 * @date 09.04.2022
 **/
public enum ECSS {

    CSS_FILE {
        @Override
        public String toString() {
            return "styles.css";
        }
    },
    CSS_BODY {
        @Override
        public String toString() {
            return "body";
        }
    },

    CURLY_BRACKET_OPEN {
        @Override
        public String toString() {
            return "{";
        }
    },

    CURLY_BRACKET_CLOSE {
        @Override
        public String toString() {
            return "}";
        }
    },

    FONT_STYLE {
        @Override
        public String toString() {
            return "font-style: normal;";
        }
    },
    FONT_WEIGHT {
        @Override
        public String toString() {
            return "font-weight: normal;";
        }
    },

    DEFAULT_MARGIN {
        @Override
        public String toString() {
            return "margin: 0;";
        }
    },


    DEFAULT_PADDING {
        @Override
        public String toString() {
            return "padding: 0;";
        }
    },

    STAR {
        @Override
        public String toString() {
            return "*";
        }
    },

    BOX_SIZING {
        @Override
        public String toString() {
            return "box-sizing: border-box;";
        }
    };

    /* GRID */

}
