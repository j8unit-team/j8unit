package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.GridBagConstraints class java.awt.GridBagConstraints}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link GridBagConstraintsClassTests}.
 * </p>
 *
 * @see java.awt.GridBagConstraints class java.awt.GridBagConstraints (the hereby targeted class-under-test class)
 * @see GridBagConstraintsClassTests GridBagConstraintsClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GridBagConstraintsTests<SUT extends java.awt.GridBagConstraints>
extends org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.GridBagConstraints#clone() public java.lang.Object
     * java.awt.GridBagConstraints.clone()}.
     *
     * <p>
     * Test method for {@link java.awt.GridBagConstraints#clone() public java.lang.Object
     * java.awt.GridBagConstraints.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.GridBagConstraints#clone() public java.lang.Object java.awt.GridBagConstraints.clone() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
