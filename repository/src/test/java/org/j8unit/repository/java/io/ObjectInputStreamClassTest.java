package org.j8unit.repository.java.io;

import static org.junit.Assert.fail;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectInputStream} (by simply reusing the
 * J8Unit test interface {@link ObjectInputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectInputStreamClassTest
implements ObjectInputStreamClassTests<ObjectInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.ObjectInputStream]

    @Override
    public Class<ObjectInputStream> createNewSUT() {
        return ObjectInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.ObjectInputStream#ObjectInputStream(java.io.InputStream) public
     * java.io.ObjectInputStream(java.io.InputStream) throws java.io.IOException}.
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
    public void create_ObjectInputStream_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectInputStream sut = null; // = new ObjectInputStream(java.io.InputStream);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.ObjectInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.ObjectInputStream]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link GetField} (by simply reusing the
     * J8Unit test interface {@link GetFieldClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class GetFieldClassTest
    implements GetFieldClassTests<GetField> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.ObjectInputStream$GetField]

        @Override
        public Class<GetField> createNewSUT() {
            return GetField.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.io.ObjectInputStream.GetField#GetField() public java.io.ObjectInputStream$GetField()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("Cannot construct an abstract class!")
        @Test
        @Category(Draft.class)
        public void create_GetField()
        throws Exception {
            fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.ObjectInputStream$GetField]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.io.ObjectInputStream$GetField]

    }

}
