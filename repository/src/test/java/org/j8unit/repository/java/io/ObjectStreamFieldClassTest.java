package org.j8unit.repository.java.io;

import java.io.ObjectStreamField;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectStreamField} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.ObjectStreamFieldClassTests}).
 */
@RunWith(J8Unit4.class)
public class ObjectStreamFieldClassTest
implements ObjectStreamFieldClassTests<ObjectStreamField> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.ObjectStreamField]

    @Override
    public Class<ObjectStreamField> createNewSUT() {
        return ObjectStreamField.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.ObjectStreamField#ObjectStreamField(String, Class, boolean) public
     * java.io.ObjectStreamField(java.lang.String,java.lang.Class<?>,boolean)}.
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
    public void create_ObjectStreamField_String_Class_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectStreamField sut = null; // = new ObjectStreamField(String, Class, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.ObjectStreamField#ObjectStreamField(String, Class) public
     * java.io.ObjectStreamField(java.lang.String,java.lang.Class<?>)}.
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
    public void create_ObjectStreamField_String_Class()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectStreamField sut = null; // = new ObjectStreamField(String, Class);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.ObjectStreamField]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.ObjectStreamField]

}
