package org.j8unit.repository.java.beans;

import java.beans.Encoder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EncoderClassTest
implements org.j8unit.repository.java.beans.EncoderClassTests<Encoder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.Encoder]

    @Override
    public Class<Encoder> createNewSUT() {
        return Encoder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.beans.Encoder#Encoder() public
     * java.beans.Encoder()}.
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
    public void create_Encoder()
    throws Exception {
        // create new instance
        final Encoder sut = new Encoder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.Encoder]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.Encoder]

}
