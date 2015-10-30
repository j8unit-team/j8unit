package org.j8unit;

import java.util.function.Supplier;

/**
 * <p>
 * In case a subject-under-test (SUT) based J8Unit test uses a SUT factory to produce fresh SUT instances, this
 * interface should be used preference to {@link J8UnitTest}. In detail, this {@code interface} specifies
 * {@linkplain #getSUTFactory() a factory query method} that is used within the {@code default} implementation of
 * {@link #createNewSUT()}.
 * </p>
 *
 * @see J8UnitTest
 *
 * @param <SUT>
 *            the type of the subject-under-test
 * @since 4.12
 */
@FunctionalInterface
public abstract interface FactoryBasedJ8UnitTest<SUT>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Returns a factory to be used when {@linkplain #createNewSUT() creating new subject-under-test instances} (each of
     * type {@code SUT}).
     * </p>
     *
     * @return a SUT factory
     */
    public abstract Supplier<SUT> getSUTFactory();

    /**
     * {@inheritDoc}
     *
     * <p>
     * Due to the {@linkplain #getSUTFactory() SUT factory based} nature of this J8Unit test, this method has been
     * implemented with the following {@code default} behaviour:
     * </p>
     *
     * <pre>
     * {@code
     * {
     * final Supplier<SUT> factory = this.getSUTFactory();
     * assert factory != null;
     * final SUT sut = factory.get();
     * assert sut != null;
     * return sut;
     * }
     * }
     * </pre>
     */
    @Override
    public default SUT createNewSUT() {
        final Supplier<SUT> factory = this.getSUTFactory();
        assert factory != null;
        final SUT sut = factory.get();
        assert sut != null;
        return sut;
    }

}
