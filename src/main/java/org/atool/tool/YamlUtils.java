package org.atool.tool;


import org.yaml.snakeyaml.Yaml;

public class YamlUtils {
    /**
     * ζζ±εδΎ
     */
    private static class YamlParserHolder {
        private static final Yaml PARSER = new Yaml();
    }

    private static Yaml getParser() {
        return YamlParserHolder.PARSER;
    }

    public static <T> T toBean(String text, Class<T> clazz) {
        return getParser().loadAs(text, clazz);
    }
}
