package some.reusable.j8unit.test.repository.java.lang;

import org.j8unit.runners.conformance.APIConformance;
import org.j8unit.runners.conformance.APIConformanceTests;

/**
 * By the name, this component is a reusable j8unit test interface. But actually, it is not.
 *
 * It is intended to test the robustness of {@link APIConformance}; see {@link APIConformanceTests}.
 */
public @interface DeprecatedTests {

    public String value() default "";

}
