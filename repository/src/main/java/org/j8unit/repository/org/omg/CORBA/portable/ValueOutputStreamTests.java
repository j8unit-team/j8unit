package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.portable.ValueOutputStream interface org.omg.CORBA.portable.ValueOutputStream},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CORBA.portable.ValueOutputStreamClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ValueOutputStreamTests<SUT extends org.omg.CORBA.portable.ValueOutputStream>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ValueOutputStream#end_value() public abstract void
     * org.omg.CORBA.portable.ValueOutputStream.end_value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_end_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ValueOutputStream#start_value(java.lang.String) public abstract
     * void org.omg.CORBA.portable.ValueOutputStream.start_value(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_start_value_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
