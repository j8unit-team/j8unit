package org.j8unit.generator.api;

import static java.util.Arrays.stream;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.generator.analysis.TypePosition.TOP_LEVEL;
import static org.j8unit.generator.api.LoggingMessagesKeys.ABORT_FILE;
import static org.j8unit.generator.api.LoggingMessagesKeys.CREATE_FILE;
import static org.j8unit.generator.api.LoggingMessagesKeys.DEFER_TYPE;
import static org.j8unit.generator.api.LoggingMessagesKeys.ENVELOPED_TYPES;
import static org.j8unit.generator.api.LoggingMessagesKeys.FINISH_ENTITY;
import static org.j8unit.generator.api.LoggingMessagesKeys.SKIP_FILE;
import static org.j8unit.generator.api.LoggingMessagesKeys.SKIP_TYPE;
import static org.j8unit.generator.api.LoggingMessagesKeys.START_ENTITY;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Set;
import org.j8unit.generator.EnvelopedTypeModifiers;
import org.j8unit.generator.api.control.GeneratorOutputControler;
import org.j8unit.generator.api.control.GeneratorUseControler;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.api.render.TargetRenderer;

/**
 * TODO: JavaDoc
 */
public abstract interface J8UnitCodeGenerator
extends J8UnitGenerator, EnvelopedTypeModifiers {

    /**
     * <p>
     * Generates the j8unit test interface for the given {@code type}.
     *
     * The code generation is controlled by the given {@code control} and {@code renderer}. Since any type should cause
     * two j8unit test interfaces (one testing the instances renderer, one testing the type (a.&thinsp;k.&thinsp;a.
     * {@code static} or {@code class}) renderer) it is quite assumable to have cross references to the corresponding
     * test interface; for example within the JavaDoc statements. Thus, this method requires an additional complementary
     * renderer.
     *
     * Similarly, the test-execution-code generator needs to refer to the according j8unit test interface. Again, there
     * must be such complementary renderer.
     * </p>
     *
     * @impleNote The default implementation skips any type that is not
     *            {@linkplain org.j8unit.generator.analysis.TypePosition#TOP_LEVEL top-level} or is
     *            {@linkplain GeneratorSetup#skipType(Class) identified to be skipped} by the given {@code control}.
     *
     *            It then creates the test code source file (see {@link GeneratorOutputControler#targetFileFor(Class)})
     *            containing the code returned by
     *            {@link #generateSourceCode(Class, GeneratorUseControler, RenderBehaviour, TargetRenderer)}. If the
     *            target file already exists, it will be overwritten if and only if the {@code control}
     *            {@linkplain GeneratorOutputControler#doOverwrite(Class) allows} to do so.
     *
     * @param type
     *            the target type
     * @param control
     *            the generator control
     * @param renderer
     *            the rendeRenderer renderer
     * @param complementary
     *            the complementary rendeRenderer renderer
     */
    public default <Renderer extends OriginRenderer & TargetRenderer, C extends GeneratorUseControler & GeneratorOutputControler> void generateSourceFile(final Class<?> type,
                                                                                                                                                          final C control,
                                                                                                                                                          final Renderer renderer,
                                                                                                                                                          final TargetRenderer complementary) {
        requireNonNull(type);
        requireNonNull(control);
        requireNonNull(renderer);
        requireNonNull(complementary);
        if (TOP_LEVEL.mismatches(type)) {
            // defer enveloped type (will be considered by enveloping class)
            logger().fine(DEFER_TYPE, type);
        } else if (control.skipType(type)) {
            // skip type by current setup
            logger().warning(SKIP_TYPE, type);
        } else {
            logger().info(START_ENTITY, type);
            try {
                final File target = control.targetFileFor(type).toFile();
                if (!target.exists() || control.doOverwrite(type)) {
                    // generate test class' content
                    final String content = this.generateSourceCode(type, control, renderer, complementary);
                    // // create target folder (unless existing) and target file
                    logger().info(CREATE_FILE, type, target);
                    target.getParentFile().mkdirs();
                    target.createNewFile();
                    // write content
                    try (final Writer writer = new FileWriter(target)) {
                        writer.write(content);
                    }
                } else {
                    logger().info(SKIP_FILE, type, target);
                }
            } catch (final IOException io) {
                logger().severe(ABORT_FILE, type, io);
            }
            logger().info(FINISH_ENTITY, type);
        }
    }

    /**
     * <p>
     * Generates the source code targeting the given {@code type}.
     *
     * The code generation is controlled by the given {@code control} and {@code renderer}. Since any type should cause
     * two j8unit test interfaces (one testing the instances renderer, one testing the type (a.&thinsp;k.&thinsp;a.
     * {@code static} or {@code class}) renderer) it is quite assumable to have cross references to the corresponding
     * test interface; for example within the JavaDoc statements. Thus, this method requires an additional complementary
     * renderer.
     *
     * Similarly, the test-execution-code generator needs to refer to the according j8unit test interface. Again, there
     * must be such complementary renderer.
     * </p>
     *
     * @param type
     *            the target type
     * @param control
     *            the generator control
     * @param renderer
     *            the rendeRenderer renderer
     * @param complementary
     *            the complementary rendeRenderer renderer
     * @return the source code targeting the given {@code type}
     */
    public default <Renderer extends OriginRenderer & TargetRenderer> String generateSourceCode(final Class<?> type, final GeneratorUseControler control,
                                                                                                final Renderer renderer, final TargetRenderer complementary) {
        // content storage
        final StringBuilder out = new StringBuilder();
        // content creation
        final String packageDeclaration = this.generateTargetPackageDeclaration(type.getPackage(), renderer);
        final String classContent = this.generateTestContent(type, control, renderer, complementary, 0);
        final String importDeclarations = this.generateImports(type, renderer);
        out.append(packageDeclaration);
        out.append(importDeclarations);
        out.append(classContent);
        // finalize content
        return out.toString();
    }

    /**
     * <p>
     * Generates the source code of the required {@code import} statements according to the given target {@code type}.
     * </p>
     *
     * @param type
     *            the target type
     * @param renderer
     *            the rendeRenderer renderer
     *
     * @return the source code of the required {@code import} statements
     */
    public default <Renderer extends OriginRenderer & TargetRenderer> String generateImports(final Class<?> type, final Renderer renderer) {
        return "";
    }

    /**
     * <p>
     * Generates the source code of the <em>j8unit</em> test methods targeting the methods of the given target
     * {@code type}.
     * </p>
     *
     * @apiNote The required level of type nesting represents should be {@code 0} for any top-level type, {@code 1} for
     *          any member type of a top-level type, {@code 2} for any member of a {@code 1}-level type, &hellip;
     *
     *          The intention of the depth number is to render according indenting.
     *
     * @param type
     *            the target type
     * @param control
     *            the generator control
     * @param renderer
     *            the rendeRenderer renderer
     * @param complementary
     *            the complementary rendeRenderer renderer
     * @param depth
     *            the level of type nesting
     * @return the source code of the <em>j8unit</em> test methods
     */
    public abstract <Renderer extends OriginRenderer & TargetRenderer> String generateTestContent(final Class<?> type, GeneratorUseControler control,
                                                                                                  final Renderer renderer, final TargetRenderer complementary,
                                                                                                  final int depth);

    /**
     * Returns a {@linkplain Set set} of all {@link Class} objects reflecting all the
     * {@linkplain GeneratorUseControler#useType(Class) considerable} classes and interfaces declared as members of the
     * given {@code type}.
     *
     * @implSpec The default implementation fully implements the aforementioned renderer.
     *
     * @param type
     *            the target type
     * @param control
     *            the generator control
     * @return a set of all considerable member {@code Class} objects
     */
    public default Set<Class<?>> exploreEnvelopedTypes(final Class<?> type, final GeneratorUseControler control) {
        final Set<Class<?>> collect = stream(type.getDeclaredClasses()).filter(control::useType).collect(toSet());
        logger().info(ENVELOPED_TYPES, type, collect);
        return collect;
    }

}
