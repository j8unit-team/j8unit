package org.j8unit.generator.api;

import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.api.LoggingMessagesKeys.ABORT_FILE;
import static org.j8unit.generator.api.LoggingMessagesKeys.CREATE_FILE;
import static org.j8unit.generator.api.LoggingMessagesKeys.FINISH_ENTITY;
import static org.j8unit.generator.api.LoggingMessagesKeys.SKIP_FILE;
import static org.j8unit.generator.api.LoggingMessagesKeys.START_ENTITY;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import org.j8unit.generator.api.control.GeneratorOutputControler;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.api.render.TargetRenderer;

/**
 * Root of all j8unit {@code package-info.java} generators.
 */
public abstract interface PackageInfoGenerator
extends J8UnitGenerator {

    /**
     * Generates the package info for the given package. The code generation is controlled by the given {@code setup}.
     *
     * @param pakkage
     *            the origin package
     * @param control
     *            the generator control
     * @param renderer
     *            the rendeRenderer renderer
     */
    public default <Renderer extends OriginRenderer & TargetRenderer> void generatePackageInfoFile(final Package pakkage,
                                                                                                   final GeneratorOutputControler control,
                                                                                                   final Renderer renderer) {
        requireNonNull(pakkage);
        requireNonNull(control);
        requireNonNull(renderer);
        logger().info(START_ENTITY, pakkage);
        try {
            final File target = control.targetFileFor(pakkage).toFile();
            if (!target.exists() || control.doOverwrite(pakkage)) {
                // generate package info's content
                final String content = this.generatePackageInfoContent(pakkage, renderer);
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
     * Generates the package info's content for the given package. The code generation is controlled by the given
     * {@code renderer}.
     *
     * @param pakkage
     *            the origin package
     * @param renderer
     *            the rendeRenderer renderer
     */
    public default <Renderer extends OriginRenderer & TargetRenderer> String generatePackageInfoContent(final Package pakkage, final Renderer renderer) {
        requireNonNull(pakkage);
        requireNonNull(renderer);
        // data preparations
        final String javaDoc = this.generateJavaDoc(pakkage, renderer);
        final String declaration = this.generateTargetPackageDeclaration(pakkage, renderer);
        // content storage
        final StringBuilder out = new StringBuilder();
        // content creation
        out.append(javaDoc);
        out.append(declaration);
        // finalize content
        return out.toString();
    }

    /**
     * Generates the package info's JavaDoc for the given package. The code generation is controlled by the given
     * {@code renderer}.
     *
     * @param pakkage
     *            the origin package
     * @param renderer
     *            the rendeRenderer renderer
     */
    public abstract String generateJavaDoc(final Package pakkage, final OriginRenderer renderer);

}
