package org.j8unit;

import java.util.function.Supplier;
import org.junit.Before;

/**
 * Any SupplierBasedJ8UnitTest implements this interface; in result, all those tests provide {@linkplain #subjectUnderTestFactory() a
 * factory method} to query a fresh subject-under-test instance. This behaviour is somehow similar to JUnit's
 * {@link Before} annotated methods (plus its typical usage), whereas within an interface there is no class' member that
 * could be refreshed before each test. Thus, this is the way it works.
 *
 * @param <SUT>
 *            the type of the subject-under-test
 * @author <a href="mailto:stefan.gasterstaedt@informaticum.de">Stefan Gasterst&auml;dt</a>
 */
@FunctionalInterface
public abstract interface SupplierBasedJ8UnitTest<SUT>
extends J8UnitTest<SUT> {

    public abstract Supplier<SUT> subjectUnderTestFactory();

    @Override
    public default SUT getNewSubjectUnderTest() {
        final Supplier<SUT> factory = this.subjectUnderTestFactory();
        assert factory != null;
        final SUT sut = factory.get();
        assert sut != null;
        return sut;
    }

}
