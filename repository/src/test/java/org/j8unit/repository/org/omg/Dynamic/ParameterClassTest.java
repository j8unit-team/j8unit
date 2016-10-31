package org.j8unit.repository.org.omg.Dynamic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.Dynamic.Parameter;

@RunWith(J8Unit4.class)
public class ParameterClassTest
implements org.j8unit.repository.org.omg.Dynamic.ParameterClassTests<Parameter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.Dynamic.Parameter]

    @Override
    public Class<Parameter> createNewSUT() {
        return Parameter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.Dynamic.Parameter#Parameter() public
     * org.omg.Dynamic.Parameter()}.
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
    public void create_Parameter()
    throws Exception {
        // create new instance
        final Parameter sut = new Parameter();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.Dynamic.Parameter#Parameter(org.omg.CORBA.Any, org.omg.CORBA.ParameterMode) public
     * org.omg.Dynamic.Parameter(org.omg.CORBA.Any,org.omg.CORBA.ParameterMode)}.
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
    public void create_Parameter_Any_ParameterMode()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Parameter sut = null; // = new Parameter(org.omg.CORBA.Any, org.omg.CORBA.ParameterMode);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.Dynamic.Parameter]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.Dynamic.Parameter]

}
