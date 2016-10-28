package org.j8unit.repository.java.security;

import java.security.Guard;
import java.security.GuardedObject;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GuardedObjectClassTest
implements org.j8unit.repository.java.security.GuardedObjectClassTests<GuardedObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.GuardedObject]

    @Override
    public Class<GuardedObject> createNewSUT() {
        return GuardedObject.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link GuardedObject#GuardedObject(Object, Guard)
     * public java.security.GuardedObject(java.lang.Object,java.security.Guard)}.
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
    public void create_GuardedObject_Object_Guard()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GuardedObject sut = null; // = new GuardedObject(Object, Guard);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.GuardedObject]

}
