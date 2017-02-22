package org.j8unit.generator.api;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.generator.api.LoggingMessagesKeys.ABORT_FILE;
import static org.j8unit.generator.api.LoggingMessagesKeys.CREATE_FILE;
import static org.j8unit.generator.api.LoggingMessagesKeys.FINISH_ENTITY;
import static org.j8unit.generator.api.LoggingMessagesKeys.SKIP_FILE;
import static org.j8unit.generator.api.LoggingMessagesKeys.SKIP_TYPE;
import static org.j8unit.generator.api.LoggingMessagesKeys.START_ENTITY;
import static org.j8unit.util.Functional.consumeFalse;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Set;
import org.j8unit.generator.api.control.GeneratorOutputControler;
import org.j8unit.generator.api.control.GeneratorUseControler;
import org.j8unit.generator.api.render.FancyOriginRenderer;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.api.render.TargetRenderer;

/**
 * Root of all j8unit suite generators.
 */
public abstract interface J8UnitSuiteCodeGenerator
extends J8UnitAbstractCodeGenerator {

    /**
     * Generates the j8unit test suite for the given {@code types}.
     *
     * The code generation is controlled by the given {@code control} and {@code renderer}. This test-execution-code
     * generator might need to refer to the according j8unit test interfaces. Thus, this method requires an additional
     * {@code complementary} renderer.
     *
     * @implNote The default implementation skips any type that is {@linkplain GeneratorSetup#skipType(Class) identified
     *           to be skipped} by the given {@code control}.
     *
     *           It then creates the test code source file (see
     *           {@link GeneratorOutputControler#targetSuiteFor(Package)}) containing the code returned by
     *           {@link #generateSourceCode(Set, GeneratorUseControler, FancyOriginRenderer, TargetRenderer)}. If the
     *           target file already exists, it will be overwritten if and only if the {@code control}
     *           {@linkplain GeneratorOutputControler#doOverwrite(Package) allows} to do so.
     *
     * @param types
     *            the target types
     * @param control
     *            the generator control
     * @param renderer
     *            the type name renderer
     * @param complementary
     *            the complementary type name renderer
     */
    public default <Renderer extends FancyOriginRenderer & TargetRenderer, C extends GeneratorUseControler & GeneratorOutputControler> void generateSourceFile(final Set<Class<?>> types,
                                                                                                                                                               final C control,
                                                                                                                                                               final Renderer renderer,
                                                                                                                                                               final TargetRenderer complementary) {
        requireNonNull(types);
        requireNonNull(control);
        requireNonNull(renderer);
        requireNonNull(complementary);
        assert !types.isEmpty();
        final Package pakkage = types.iterator().next().getPackage();
        assert types.stream().allMatch(c -> pakkage.equals(c.getPackage()));
        logger().info(START_ENTITY, pakkage);
        try {
            final File target = control.targetSuiteFor(pakkage).toFile();
            if (!target.exists() || control.doOverwrite(pakkage)) {
                // generate package info's content
                renderer.resetImportMemory();
                final Set<Class<?>> relevants = types.stream() //
                                                     .filter(consumeFalse(control::useType, t -> this.logger().warning(SKIP_TYPE, t))) //
                                                     .collect(toSet());
                final String content = this.generateSourceCode(relevants, control, renderer, complementary);
                // // create target folder (unless existing) and target file
                logger().info(CREATE_FILE, pakkage, target);
                target.getParentFile().mkdirs();
                target.createNewFile();
                // write content
                try (final Writer writer = new FileWriter(target)) {
                    writer.write(content);
                }
            } else {
                logger().info(SKIP_FILE, pakkage, target);
            }
        } catch (final IOException io) {
            logger().severe(ABORT_FILE, pakkage, io);
        }
        logger().info(FINISH_ENTITY, pakkage);
    }

    /**
     * Generates the suite's source code targeting the given {@code types}.
     *
     * The code generation is controlled by the given {@code control} and {@code renderer}. This test-execution-code
     * generator might need to refer to the according j8unit test interfaces. Thus, this method requires an additional
     * {@code complementary} renderer.
     *
     * @param types
     *            the target types
     * @param control
     *            the generator control
     * @param renderer
     *            the type name renderer
     * @param complementary
     *            the complementary type name renderer
     * @return the source code targeting the given {@code type}
     */
    public default <Renderer extends FancyOriginRenderer & TargetRenderer> String generateSourceCode(final Set<Class<?>> types,
                                                                                                     final GeneratorUseControler control,
                                                                                                     final Renderer renderer,
                                                                                                     final TargetRenderer complementary) {
        requireNonNull(types);
        requireNonNull(control);
        requireNonNull(renderer);
        requireNonNull(complementary);
        assert !types.isEmpty();
        final Package pakkage = types.iterator().next().getPackage();
        assert types.stream().allMatch(c -> pakkage.equals(c.getPackage()));
        // content storage
        final StringBuilder out = new StringBuilder();
        // content creation
        final String packageDeclaration = this.generateTargetPackageDeclaration(pakkage, renderer);
        final String classContent = this.generateTestContent(types, control, renderer, complementary);
        final String importDeclarations = this.generateImports(renderer.targetPackageFor(pakkage).orElse(""), renderer);
        out.append(packageDeclaration);
        out.append(importDeclarations);
        out.append(importDeclarations.isEmpty() ? "" : format("%n"));
        out.append(classContent);
        // finalize content
        return out.toString();
    }

    /**
     * Generates the source code of the <em>j8unit</em> test suite targeting the methods of the given target
     * {@code types}.
     *
     * @param types
     *            the target types
     * @param control
     *            the generator control
     * @param renderer
     *            the type name renderer
     * @param complementary
     *            the complementary type name renderer
     * @return the source code of the <em>j8unit</em> test methods
     */
    public abstract <Renderer extends OriginRenderer & TargetRenderer> String generateTestContent(final Set<Class<?>> types, GeneratorUseControler control,
                                                                                                  final Renderer renderer, final TargetRenderer complementary);

}
