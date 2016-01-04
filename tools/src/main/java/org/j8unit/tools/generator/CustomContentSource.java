package org.j8unit.tools.generator;

public interface CustomContentSource {

    public default String customImports() {
        return "";
    }

    public default String customImports(final Class<?> clazz) {
        return "";
    }

    public default String customTestInterfaceHead(final int enclosingLevel) {
        return "";
    }

    public default String customTestInterfaceHead(final Class<?> clazz, final int enclosingLevel) {
        return "";
    }

    public default String customTestInterfaceBody(final int enclosingLevel) {
        return "";
    }

    public default String customTestInterfaceBody(final Class<?> clazz, final int enclosingLevel) {
        return "";
    }

}
