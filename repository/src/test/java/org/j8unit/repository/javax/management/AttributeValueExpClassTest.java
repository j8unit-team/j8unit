package org.j8unit.repository.javax.management;

import javax.management.AttributeValueExp;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AttributeValueExp} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.AttributeValueExpClassTests}).
 */
@RunWith(J8Unit4.class)
public class AttributeValueExpClassTest
implements AttributeValueExpClassTests<AttributeValueExp> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.AttributeValueExp]

    @Override
    public Class<AttributeValueExp> createNewSUT() {
        return AttributeValueExp.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.AttributeValueExp#AttributeValueExp() public javax.management.AttributeValueExp()}.
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
    public void create_AttributeValueExp()
    throws Exception {
        // create new instance
        @SuppressWarnings({ "unused", "deprecation" })
        final AttributeValueExp sut = new AttributeValueExp();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.AttributeValueExp#AttributeValueExp(String) public
     * javax.management.AttributeValueExp(java.lang.String)}.
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
    public void create_AttributeValueExp_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AttributeValueExp sut = null; // = new AttributeValueExp(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.AttributeValueExp]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.AttributeValueExp]

}
