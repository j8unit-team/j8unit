package org.j8unit.maven.plugin.genesis;

import static java.lang.String.format;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.Files.createDirectories;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Files.write;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.util.stream.Collectors.joining;
import static org.j8unit.generator.util.Paths.resolve;
import static org.j8unit.generator.util.Resources.resolveResource;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public enum GenesisRenderStyles {

    PACKAGE {

        @Override
        public void render(final File sourceDirectory, final Package pakkage, final List<Class<?>> classes)
        throws IOException {
            final Path templateFile = resolveResource(this, J8UNIT_TEMPLATE_NAME);
            final String templateContent = new String(readAllBytes(templateFile), UTF_8);
            final Path targetSourceFile = resolve(sourceDirectory, pakkage).resolve(J8UNIT_FILE_NAME);
            final String namespace = pakkage.getName();
            final String classesUnderTest = classes.stream().map(Class::getCanonicalName).map(n -> n + ".class").collect(joining(format(", %n    ")));
            final String targetContent = format(templateContent, namespace, classesUnderTest);
            createDirectories(targetSourceFile.getParent());
            write(targetSourceFile, targetContent.getBytes(UTF_8), CREATE);
        }

    };

    public abstract void render(File sourceDirectory, Package pakkage, List<Class<?>> classes)
    throws IOException;

    // Move inside enum constant (but currently, build fails by maven-plugin-plugin)
    // (similar to
    // http://stackoverflow.com/questions/38547239/maven-plugin-plugindescriptor-goal-fails-at-the-and-of-file)
    static final String J8UNIT_FILE_NAME = "PackageAPIJ8UnitConformanceTests.java";

    static final String J8UNIT_TEMPLATE_NAME = J8UNIT_FILE_NAME + ".template";

}
