package org.j8unit.repository.java.io;

import static org.junit.Assert.fail;
import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectOutputStreamClassTest
implements org.j8unit.repository.java.io.ObjectOutputStreamClassTests<ObjectOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.ObjectOutputStream]

    @Override
    public Class<ObjectOutputStream> createNewSUT() {
        return ObjectOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.ObjectOutputStream#ObjectOutputStream(java.io.OutputStream) public
     * java.io.ObjectOutputStream(java.io.OutputStream) throws java.io.IOException}.
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
    public void create_ObjectOutputStream_OutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectOutputStream sut = null; // = new ObjectOutputStream(java.io.OutputStream);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.ObjectOutputStream]

    @RunWith(J8Unit4.class)
    public static class PutFieldClassTest
    implements org.j8unit.repository.java.io.ObjectOutputStreamClassTests.PutFieldClassTests<PutField> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.ObjectOutputStream$PutField]

        @Override
        public Class<PutField> createNewSUT() {
            return PutField.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.io.ObjectOutputStream.PutField#PutField() public java.io.ObjectOutputStream$PutField()}.
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
        public void create_PutField()
        throws Exception {
            fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.io.ObjectOutputStream$PutField]

    }

}
