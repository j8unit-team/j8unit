package org.j8unit.repository.java.rmi;

import java.rmi.MarshalledObject;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MarshalledObject} (by simply reusing the
 * J8Unit test interface {@link MarshalledObjectClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class MarshalledObjectClassTest
implements MarshalledObjectClassTests<MarshalledObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.MarshalledObject]

    @Override
    public Class<MarshalledObject> createNewSUT() {
        return MarshalledObject.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.MarshalledObject#MarshalledObject(Object) public java.rmi.MarshalledObject(T) throws
     * java.io.IOException}.
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
    public void create_MarshalledObject_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MarshalledObject sut = null; // = new MarshalledObject(Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.MarshalledObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.MarshalledObject]

}
