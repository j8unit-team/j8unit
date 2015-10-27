package org.j8unit;

/**
 * <p>
 * Base interface of any subject-under-test based J8Unit test. Extending this {@code interface} enables specific test
 * definitions to {@linkplain #createNewSUT() query a fresh subject-under-test instance}.
 * </p>
 *
 * <p>
 * This behaviour is somehow similar to JUnit's {@link org.junit.Before} used to re-initialise {@code class}' members.
 * However, interfaces can specify methods but cannot specify members. Thus, specifying a subject-under-test factory
 * method is the way it works.
 * </p>
 *
 * @see FactoryBasedJ8UnitTest
 *
 * @param <SUT>
 *            the type of the subject-under-test
 */
@FunctionalInterface
public abstract interface J8UnitTest<SUT> {

    /**
     * Factory method to create a new subject-under-test (of type {@code SUT}).
     *
     * @return a new subject-under-test
     */
    public abstract SUT createNewSUT();

}
