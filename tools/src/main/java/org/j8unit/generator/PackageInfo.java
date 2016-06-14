package org.j8unit.generator;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.util.OptionalString.ofOptional;
import org.j8unit.generator.api.PackageInfoGenerator;
import org.j8unit.generator.api.render.OriginRenderer;

/**
 * Container enum of a generic, reusable {@code package-info.java} generator without any specific information:
 * {@link #PACKAGE_INFO}.
 */
public enum PackageInfo
implements PackageInfoGenerator {

    /**
     * A generic, reusable {@code package-info.java} generator without any specific information.
     */
    PACKAGE_INFO {

        @Override
        public final String generateJavaDoc(final Package pakkage, final OriginRenderer renderer) {
            requireNonNull(pakkage);
            requireNonNull(renderer);
            final String reference = ofOptional(renderer.originPackageFor(pakkage)).surround("package {@link ", "}").orElse("the <em>default package</em>");
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            out.append(format("/**%n"));
            out.append(format(" * <p>%n"));
            out.append(format(" * This package contains all <strong>reusable j8unit tests</strong> targeting the API renderer of the types%n"));
            out.append(format(" * of %s.%n", reference));
            out.append(format(" * </p>%n"));
            out.append(format(" */%n"));
            // finalize content
            return out.toString();
        }

    };

    /**
     * Returns a programmer-friendly textually representation of {@code this} j8unit generator.
     */
    @Override
    public final String toString() {
        return format("%s::%s", this.getDeclaringClass().getName(), this.name());
    }

}
