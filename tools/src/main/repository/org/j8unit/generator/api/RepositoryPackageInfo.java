package org.j8unit.generator.api;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.api.RepositoryTokens.SASCHA_MAIL;
import static org.j8unit.generator.api.RepositoryTokens.SASCHA_NAME;
import static org.j8unit.generator.api.RepositoryTokens.STEFAN_MAIL;
import static org.j8unit.generator.api.RepositoryTokens.STEFAN_NAME;
import static org.j8unit.generator.api.RepositoryTokens.VERSION_REPO_INITIAL;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.util.OptionalString;

enum RepositoryPackageInfo
implements PackageInfoGenerator {

    J8UNIT_REPOSITORY_PACKAGE_INFO {

        @Override
        public final String generateJavaDoc(final Package pakkage, final OriginRenderer renderer) {
            requireNonNull(pakkage);
            requireNonNull(renderer);
            final String reference = OptionalString.ofOptional(renderer.originPackageFor(pakkage)) //
                                                   .surround("package {@link ", "}") //
                                                   .orElse("the <em>default package</em>");
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            out.append(format("/**%n"));
            out.append(format(" * <p>%n"));
            out.append(format(" * This package is part of the j8unit repository and contains all <strong>reusable tests</strong> targeting the%n"));
            out.append(format(" * renderer of the types of %s.%n", reference));
            out.append(format(" *%n"));
            out.append(format(" * Because the j8unit repository first and foremost intends to provide reusable tests targeting the reusable API%n"));
            out.append(format(" * elements of the types of Java&thinsp;8, these tests cover the usable and extendable (i.&thinsp;e., {@code public})%n"));
            out.append(format(" * types and its usable and extendable (i.&thinsp;e., non-{@code static} {@code public}) methods.%n"));
            out.append(format(" * </p>%n"));
            out.append(format(" *%n"));
            switch (pakkage.getName().split("\\.")[0]) {
                case "java":
                    // <p>
                    // According to <a
                    // href=\"https://docs.oracle.com/javase/specs/jls/se8/html/jls-6.html#jls-6.1\">The
                    // Java Language Specification (Java SE 8 Edition), Section.&nbsp;6.1</a>, some package's
                    // &quot;[&hellip;] first identifier [&hellip;] should not be the identifier {@code java}
                    // [&hellip;]&quot;. Thus, this test class collection is limited to accessible classes
                    // (i.&thinsp;e., top-level, <a
                    // href=\"http://docs.oracle.com/javase/tutorial/java/javaOO/nested.html\">nested, inner</a>)
                    // and
                    // accessible methods&nbsp;&ndash; simply because it cannot place test classes in the
                    // type-under-test's {@code java.*} package (which otherwise would allow access to {@code
                    // protected}, resp. <em>package-private</em> elements).
                    // </p>
                    break;
            }
            out.append(format(" * @since %s%n", VERSION_REPO_INITIAL));
            out.append(format(" * @author <a href=\"mailto:%s\">%s</a>%n", STEFAN_MAIL, STEFAN_NAME));
            out.append(format(" * @author <a href=\"mailto:%s\">%s</a>%n", SASCHA_MAIL, SASCHA_NAME));
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