package org.j8unit;

/**
 * Base interface of any subject-under-test based J8Unit test.
 *
 * @param <SUT>
 *            the type of the subject-under-test
 */
public abstract interface J8UnitTest<SUT> {

    /**
     * Factory method to create a new subject-under-test (of type {@code SUT}).
     *
     * @return a new subject-under-test
     */
    public abstract SUT createNewSUT();

}
