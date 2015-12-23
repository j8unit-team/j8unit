package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.portable.ValueInputStream interface
 * org.omg.CORBA.portable.ValueInputStream}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.portable.ValueInputStreamTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.portable.ValueInputStreamClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.portable.ValueInputStream
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ValueInputStreamTests<SUT extends org.omg.CORBA.portable.ValueInputStream>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ValueInputStream#end_value() public abstract void
     * org.omg.CORBA.portable.ValueInputStream.end_value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.portable.ValueInputStream#end_value()
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
     * Test method for {@link org.omg.CORBA.portable.ValueInputStream#start_value() public abstract void
     * org.omg.CORBA.portable.ValueInputStream.start_value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.portable.ValueInputStream#start_value()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_start_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
