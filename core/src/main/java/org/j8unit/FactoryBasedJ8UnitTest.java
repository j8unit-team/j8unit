package org.j8unit;

import java.util.function.Supplier;
import org.junit.Before;

/**
 * Any FactoryBasedJ8UnitTest implements this interface; in result, all those tests provide
 * {@linkplain #getSUTFactory() a factory method} to query a fresh subject-under-test instance. This behaviour is
 * somehow similar to JUnit's {@link Before} annotated methods (plus its typical usage), whereas within an interface
 * there is no class' member that could be refreshed before each test. Thus, this is the way it works.
 *
 * @param <SUT>
 *            the type of the subject-under-test
 * @author <a href="mailto:stefan.gasterstaedt@informaticum.de">Stefan Gasterst&auml;dt</a>
 */
@FunctionalInterface
public abstract interface FactoryBasedJ8UnitTest<SUT>
extends J8UnitTest<SUT> {

    public abstract Supplier<SUT> getSUTFactory();

    @Override
    public default SUT createNewSUT() {
        final Supplier<SUT> factory = this.getSUTFactory();
        assert factory != null;
        final SUT sut = factory.get();
        assert sut != null;
        return sut;
    }

}
