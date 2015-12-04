package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.openmbean.CompositeDataView interface
 * javax.management.openmbean.CompositeDataView}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.openmbean.CompositeDataViewClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompositeDataViewTests<SUT extends javax.management.openmbean.CompositeDataView>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.openmbean.CompositeDataView#toCompositeData(javax.management.openmbean.CompositeType)
     * public abstract javax.management.openmbean.CompositeData
     * javax.management.openmbean.CompositeDataView.toCompositeData(javax.management.openmbean.CompositeType)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toCompositeData_CompositeType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
