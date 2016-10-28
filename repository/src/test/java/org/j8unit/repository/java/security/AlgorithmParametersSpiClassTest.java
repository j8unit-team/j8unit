package org.j8unit.repository.java.security;

import static org.junit.Assert.fail;
import java.security.AlgorithmParametersSpi;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlgorithmParametersSpiClassTest
implements org.j8unit.repository.java.security.AlgorithmParametersSpiClassTests<AlgorithmParametersSpi> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.AlgorithmParametersSpi]

    @Override
    public Class<AlgorithmParametersSpi> createNewSUT() {
        return AlgorithmParametersSpi.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.AlgorithmParametersSpi#AlgorithmParametersSpi() public
     * java.security.AlgorithmParametersSpi()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_AlgorithmParametersSpi()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.AlgorithmParametersSpi]

}
