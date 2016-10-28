package org.j8unit.repository.javax.management;

import javax.management.StringValueExp;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringValueExpClassTest
implements org.j8unit.repository.javax.management.StringValueExpClassTests<StringValueExp> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.StringValueExp]

    @Override
    public Class<StringValueExp> createNewSUT() {
        return StringValueExp.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.StringValueExp#StringValueExp() public javax.management.StringValueExp()}.
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
    public void create_StringValueExp()
    throws Exception {
        // create new instance
        final StringValueExp sut = new StringValueExp();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.StringValueExp#StringValueExp(String) public
     * javax.management.StringValueExp(java.lang.String)}.
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
    public void create_StringValueExp_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringValueExp sut = null; // = new StringValueExp(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.StringValueExp]

}
