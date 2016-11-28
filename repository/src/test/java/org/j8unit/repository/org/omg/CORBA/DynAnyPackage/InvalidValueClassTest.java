package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidValue} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.DynAnyPackage.InvalidValueClassTests}).
 */
@RunWith(J8Unit4.class)
public class InvalidValueClassTest
implements org.j8unit.repository.org.omg.CORBA.DynAnyPackage.InvalidValueClassTests<InvalidValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynAnyPackage.InvalidValue]

    @Override
    public Class<InvalidValue> createNewSUT() {
        return InvalidValue.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.DynAnyPackage.InvalidValue#InvalidValue() public
     * org.omg.CORBA.DynAnyPackage.InvalidValue()}.
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
    public void create_InvalidValue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidValue sut = new InvalidValue();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.DynAnyPackage.InvalidValue#InvalidValue(String) public
     * org.omg.CORBA.DynAnyPackage.InvalidValue(java.lang.String)}.
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
    public void create_InvalidValue_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidValue sut = null; // = new InvalidValue(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DynAnyPackage.InvalidValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynAnyPackage.InvalidValue]

}
