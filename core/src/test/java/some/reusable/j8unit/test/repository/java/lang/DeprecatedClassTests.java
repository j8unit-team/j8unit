package some.reusable.j8unit.test.repository.java.lang;

import org.j8unit.J8UnitTest;
import org.j8unit.runners.conformance.APIConformance;
import org.j8unit.runners.conformance.APIConformanceTests;

/**
 * By the name, this component is a reusable j8unit test interface. But actually, it is not.
 *
 * It is intended to test the robustness of {@link APIConformance}; see {@link APIConformanceTests}.
 */
public enum DeprecatedClassTests
implements J8UnitTest<Class<Deprecated>> {

    SINGLETON;

    @Override
    public Class<Deprecated> createNewSUT() {
        return Deprecated.class;
    }

}
