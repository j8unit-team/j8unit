package org.j8unit.repository.java.io;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.io.ObjectInputValidation interface java.io.ObjectInputValidation}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.io.ObjectInputValidationTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.io.ObjectInputValidationClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.io.ObjectInputValidation
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectInputValidationTests<SUT extends java.io.ObjectInputValidation>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputValidation#validateObject() public abstract void
     * java.io.ObjectInputValidation.validateObject() throws java.io.InvalidObjectException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.io.ObjectInputValidation#validateObject()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_validateObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
