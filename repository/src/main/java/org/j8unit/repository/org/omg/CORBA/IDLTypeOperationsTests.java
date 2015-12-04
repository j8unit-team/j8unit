package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.IDLTypeOperations interface org.omg.CORBA.IDLTypeOperations}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CORBA.IDLTypeOperationsClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IDLTypeOperationsTests<SUT extends org.omg.CORBA.IDLTypeOperations>
extends org.j8unit.repository.org.omg.CORBA.IRObjectOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.IDLTypeOperations#type() public abstract org.omg.CORBA.TypeCode
     * org.omg.CORBA.IDLTypeOperations.type()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_type()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
