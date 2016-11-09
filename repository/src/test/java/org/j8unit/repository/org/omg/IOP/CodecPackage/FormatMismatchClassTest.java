package org.j8unit.repository.org.omg.IOP.CodecPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.IOP.CodecPackage.FormatMismatch;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FormatMismatch} (by simply reusing the
 * J8Unit test interface {@link FormatMismatchClassTests}).
 */

@RunWith(J8Unit4.class)
public class FormatMismatchClassTest
implements FormatMismatchClassTests<FormatMismatch> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.CodecPackage.FormatMismatch]

    @Override
    public Class<FormatMismatch> createNewSUT() {
        return FormatMismatch.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.IOP.CodecPackage.FormatMismatch#FormatMismatch() public
     * org.omg.IOP.CodecPackage.FormatMismatch()}.
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
    public void create_FormatMismatch()
    throws Exception {
        // create new instance
        final FormatMismatch sut = new FormatMismatch();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.IOP.CodecPackage.FormatMismatch#FormatMismatch(String) public
     * org.omg.IOP.CodecPackage.FormatMismatch(java.lang.String)}.
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
    public void create_FormatMismatch_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FormatMismatch sut = null; // = new FormatMismatch(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.CodecPackage.FormatMismatch]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.CodecPackage.FormatMismatch]

}
