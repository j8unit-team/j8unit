package some.reusable.j8unit.test.repository.java.time.temporal;

import static org.junit.Assert.fail;
import java.time.temporal.TemporalAccessor;
import org.j8unit.J8UnitTest;
import org.j8unit.runners.conformance.APIConformance;
import org.j8unit.runners.conformance.APIConformanceTests;
import org.junit.Test;

/**
 * This component is a j8unit test interface, but is visibility is limited (i.thinsp;e. <em>package-private</em>).
 *
 * It is intended to test the robustness of {@link APIConformance}; see {@link APIConformanceTests}.
 */
/* package-private */interface TemporalAccessorTests<SUT extends TemporalAccessor>
extends J8UnitTest<SUT> {

    @Test
    public default void isSupportedMustBeTrueOrFalse()
    throws Exception {
        fail("This test method of a non-public interface must not be invoked!");
    }

}
