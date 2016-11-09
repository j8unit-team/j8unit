package org.j8unit.repository.javax.management;

import javax.management.ObjectInstance;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectInstance} (by simply reusing the
 * J8Unit test interface {@link ObjectInstanceClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectInstanceClassTest
implements ObjectInstanceClassTests<ObjectInstance> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.ObjectInstance]

    @Override
    public Class<ObjectInstance> createNewSUT() {
        return ObjectInstance.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.ObjectInstance#ObjectInstance(String, String) public
     * javax.management.ObjectInstance(java.lang.String,java.lang.String) throws
     * javax.management.MalformedObjectNameException}.
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
    public void create_ObjectInstance_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectInstance sut = null; // = new ObjectInstance(String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.ObjectInstance#ObjectInstance(javax.management.ObjectName, String) public
     * javax.management.ObjectInstance(javax.management.ObjectName,java.lang.String)}.
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
    public void create_ObjectInstance_ObjectName_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectInstance sut = null; // = new ObjectInstance(javax.management.ObjectName, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.ObjectInstance]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.ObjectInstance]

}
