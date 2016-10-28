package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.ResponseAPDU;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResponseAPDUClassTest
implements org.j8unit.repository.javax.smartcardio.ResponseAPDUClassTests<ResponseAPDU> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.ResponseAPDU]

    @Override
    public Class<ResponseAPDU> createNewSUT() {
        return ResponseAPDU.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.smartcardio.ResponseAPDU#ResponseAPDU(byte[]) public javax.smartcardio.ResponseAPDU(byte[])}.
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
    public void create_ResponseAPDU_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ResponseAPDU sut = null; // = new ResponseAPDU(byte[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.ResponseAPDU]

}
