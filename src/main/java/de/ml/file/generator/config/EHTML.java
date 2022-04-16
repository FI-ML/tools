package de.ml.file.generator.config;

/**
 * @author Max on 09.04.2022
 * @project FileGenerator
 * @date 09.04.2022
 **/
public enum EHTML {

    INDEX_HTML {
        @Override
        public String toString() {
            return "index.html";
        }
    },

    HTML_TAG {
        @Override
        public String toString() {
            return "<!DOCTYPE html>";
        }
    },

    HTM_OPEN_TAG {
        @Override
        public String toString() {
            return "<html lang=\"de\">";
        }
    },
    HTM_CLOSE_TAG {
        @Override
        public String toString() {
            return "</html>";

        }
    },

    HEAD_OPEN_TAG {
        @Override
        public String toString() {
            return "<head>";
        }

    },

    HEAD_CLOSE_TAG {
        @Override
        public String toString() {
            return "</head>";
        }

    },

    META_TAG {
        @Override
        public String toString() {
            return "<meta charset=\"utf-8\">";
        }
    },

    META_VIEWPORT {
        @Override
        public String toString() {
            return "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">";
        }
    },

    TITLE_OPEN_TAG {
        @Override
        public String toString() {
            return "<title>";
        }

    },

    TITLE_CLOSE_TAG {
        @Override
        public String toString() {
            return "</title>";
        }
    },

    CSS_LINK {
        @Override
        public String toString() {
            return String.format("%s%s%s%s", "<link rel=\"stylesheet\" type=\"text/css\" href=\"css", "/", "styles.css", "\">");
        }
    },

    BODY_TAG {
        @Override
        public String toString() {
            return "<body>";
        }
    },


    BODY_CLOSE_TAG {
        @Override
        public String toString() {
            return "</body>";
        }
    }
}
