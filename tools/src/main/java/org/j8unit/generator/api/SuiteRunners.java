package org.j8unit.generator.api;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.joining;
import static org.j8unit.generator.util.Java.ANNOTATION_TOKEN;
import java.util.Set;
import org.j8unit.generator.api.control.GeneratorUseControler;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.api.render.TargetRenderer;
import org.j8unit.runners.conformance.APIConformance;
import org.j8unit.runners.conformance.APIConformance.APIConformanceCandidates;
import org.junit.runner.RunWith;

public enum SuiteRunners
implements J8UnitSuiteCodeGenerator {

    APIConformanceRunner {

        @Override
        public <Renderer extends OriginRenderer & TargetRenderer> String generateTestContent(final Set<Class<?>> types, final GeneratorUseControler control,
                                                                                             final Renderer renderer, final TargetRenderer complementary) {
            requireNonNull(types);
            requireNonNull(control);
            requireNonNull(renderer);
            requireNonNull(complementary);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            final Set<Class<?>> allUsedTypes = this.exploreAllEnvelopedTypes(types, control);
            final String runWith = renderer.originCanonicalNameOf(RunWith.class);
            final String apiConformance = renderer.originCanonicalClassOf(APIConformance.class);
            out.append(format("%s%s(%s)%n", ANNOTATION_TOKEN, runWith, apiConformance));
            final String apiConformanceCandidates = renderer.originCanonicalNameOf(APIConformanceCandidates.class);
            final String candidates = allUsedTypes.stream().map(renderer::originCanonicalClassOf).sorted().collect(joining(", "));
            out.append(format("%s%s({ %s })%n", ANNOTATION_TOKEN, apiConformanceCandidates, candidates));
            out.append(format("public class APIConformanceTestSuite {%n"));
            out.append(format("}%n"));
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
