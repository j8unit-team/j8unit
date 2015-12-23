package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.portable.ValueFactory interface
 * org.omg.CORBA.portable.ValueFactory}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.portable.ValueFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.portable.ValueFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.portable.ValueFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ValueFactoryTests<SUT extends org.omg.CORBA.portable.ValueFactory>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ValueFactory#read_value(org.omg.CORBA_2_3.portable.InputStream)
     * public abstract java.io.Serializable
     * org.omg.CORBA.portable.ValueFactory.read_value(org.omg.CORBA_2_3.portable.InputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.portable.ValueFactory#read_value(org.omg.CORBA_2_3.portable.InputStream)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_value_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
