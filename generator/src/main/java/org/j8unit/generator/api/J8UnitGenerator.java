package org.j8unit.generator.api;

import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.api.LoggingMessagesKeys.LOGGING_MESSAGES_BUNDLE;
import static org.j8unit.generator.util.Logger.getLogger;
import static org.j8unit.generator.util.OptionalString.ofOptional;
import java.util.ResourceBundle;
import org.j8unit.generator.api.render.TargetRenderer;
import org.j8unit.generator.util.Logger;

/**
 * Root of all j8unit source/code generators.
 */
public abstract interface J8UnitGenerator {

    /**
     * Generates the declaration of the {@link TargetRenderer#targetPackageFor(Package) target package} for the given
     * package. If the given package is the <em>default package</em>, an empty String is returned accordingly.
     *
     * @implSpec The default implementation fully implements the aforementioned renderer.
     *
     * @param pakkage
     *            the origin package
     * @param renderer
     *            the render renderer
     * @return the declaration of the target package
     */
    public default String generateTargetPackageDeclaration(final Package pakkage, final TargetRenderer renderer) {
        requireNonNull(pakkage);
        requireNonNull(renderer);
        return ofOptional(renderer.targetPackageFor(pakkage)).format("package %s;%n%n").orEmpty();
    }

    /**
     * Returns a {@link ResourceBundle} based logger for this generator instance. The logger must be linked to the
     * {@link org.j8unit.generator.api.LoggingMessagesKeys#LOGGING_MESSAGES_BUNDLE} {@link ResourceBundle} in order to
     * support all localising message keys of {@link org.j8unit.generator.api.LoggingMessagesKeys}.
     *
     * @implSpec The default implementation fully implements the aforementioned renderer.
     *
     * @return the logger of this generator
     */
    public default Logger logger() {
        return getLogger(this.getClass().getName(), LOGGING_MESSAGES_BUNDLE);
    }

}
