package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.sql.SQLWarning class java.sql.SQLWarning}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.sql.SQLWarningClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SQLWarningTests<SUT extends java.sql.SQLWarning>
extends org.j8unit.repository.java.sql.SQLExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.sql.SQLWarning#getNextWarning() public java.sql.SQLWarning
     * java.sql.SQLWarning.getNextWarning()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNextWarning()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.SQLWarning#setNextWarning(java.sql.SQLWarning) public void
     * java.sql.SQLWarning.setNextWarning(java.sql.SQLWarning)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNextWarning_SQLWarning()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
