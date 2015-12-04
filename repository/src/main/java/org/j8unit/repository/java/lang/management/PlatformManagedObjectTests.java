package org.j8unit.repository.java.lang.management;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.management.PlatformManagedObject interface
 * java.lang.management.PlatformManagedObject}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.management.PlatformManagedObjectClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PlatformManagedObjectTests<SUT extends java.lang.management.PlatformManagedObject>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.management.PlatformManagedObject#getObjectName() public abstract
     * javax.management.ObjectName java.lang.management.PlatformManagedObject.getObjectName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
