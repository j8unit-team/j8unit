package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ValueBaseHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValueBaseHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.ValueBaseHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ValueBaseHolderClassTest
implements ValueBaseHolderClassTests<ValueBaseHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ValueBaseHolder]

    @Override
    public Class<ValueBaseHolder> createNewSUT() {
        return ValueBaseHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ValueBaseHolder#ValueBaseHolder(java.io.Serializable) public
     * org.omg.CORBA.ValueBaseHolder(java.io.Serializable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ValueBaseHolder_Serializable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ValueBaseHolder sut = null; // = new ValueBaseHolder(java.io.Serializable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.ValueBaseHolder#ValueBaseHolder()
     * public org.omg.CORBA.ValueBaseHolder()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ValueBaseHolder()
    throws Exception {
        // create new instance
        final ValueBaseHolder sut = new ValueBaseHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ValueBaseHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ValueBaseHolder]

}
