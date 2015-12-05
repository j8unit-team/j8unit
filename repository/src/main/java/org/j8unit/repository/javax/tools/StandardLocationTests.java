package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.tools.StandardLocation class javax.tools.StandardLocation}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.tools.StandardLocationClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StandardLocationTests<SUT extends javax.tools.StandardLocation>
extends org.j8unit.repository.javax.tools.JavaFileManagerTests.LocationTests<SUT>,
org.j8unit.repository.java.lang.EnumTests<SUT, javax.tools.StandardLocation> {

    /**
     * <p>
     * Test method for {@link javax.tools.StandardLocation#getName() public java.lang.String
     * javax.tools.StandardLocation.getName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.StandardLocation#isOutputLocation() public boolean
     * javax.tools.StandardLocation.isOutputLocation()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isOutputLocation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}