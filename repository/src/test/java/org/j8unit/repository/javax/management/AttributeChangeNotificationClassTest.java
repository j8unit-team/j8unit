package org.j8unit.repository.javax.management;

import javax.management.AttributeChangeNotification;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AttributeChangeNotification} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.AttributeChangeNotificationClassTests}).
 */

@RunWith(J8Unit4.class)
public class AttributeChangeNotificationClassTest
implements AttributeChangeNotificationClassTests<AttributeChangeNotification> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.AttributeChangeNotification]

    @Override
    public Class<AttributeChangeNotification> createNewSUT() {
        return AttributeChangeNotification.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.AttributeChangeNotification#AttributeChangeNotification(Object, long, long, String, String, String, Object, Object)
     * public
     * javax.management.AttributeChangeNotification(java.lang.Object,long,long,java.lang.String,java.lang.String,java.lang.String,java.lang.Object,java.lang.Object)}.
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
    public void create_AttributeChangeNotification_Object_long_long_String_String_String_Object_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AttributeChangeNotification sut = null; // = new AttributeChangeNotification(Object, long, long, String,
                                                      // String, String, Object, Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.AttributeChangeNotification]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.AttributeChangeNotification]

}
