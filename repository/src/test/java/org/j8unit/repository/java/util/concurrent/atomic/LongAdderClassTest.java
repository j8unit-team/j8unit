package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.LongAdder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongAdderClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.LongAdderClassTests<LongAdder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.atomic.LongAdder]

    @Override
    public Class<LongAdder> createNewSUT() {
        return LongAdder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.atomic.LongAdder#LongAdder() public java.util.concurrent.atomic.LongAdder()}.
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
    public void create_LongAdder()
    throws Exception {
        // create new instance
        final LongAdder sut = new LongAdder();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.atomic.LongAdder]

}
