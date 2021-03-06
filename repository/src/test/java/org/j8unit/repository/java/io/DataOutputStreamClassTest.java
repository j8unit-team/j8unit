package org.j8unit.repository.java.io;

import java.io.DataOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DataOutputStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.DataOutputStreamClassTests}).
 */
@RunWith(J8Unit4.class)
public class DataOutputStreamClassTest
implements DataOutputStreamClassTests<DataOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.DataOutputStream]

    @Override
    public Class<DataOutputStream> createNewSUT() {
        return DataOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.DataOutputStream#DataOutputStream(java.io.OutputStream) public
     * java.io.DataOutputStream(java.io.OutputStream)}.
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
    public void create_DataOutputStream_OutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DataOutputStream sut = null; // = new DataOutputStream(java.io.OutputStream);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.DataOutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.DataOutputStream]

}
