package org.j8unit.repository.java.nio;

import java.nio.ByteOrder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteOrderClassTest
implements org.j8unit.repository.java.nio.ByteOrderClassTests<ByteOrder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.ByteOrder]

    @Override
    public Class<ByteOrder> createNewSUT() {
        return ByteOrder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.ByteOrder#nativeOrder() public static
     * java.nio.ByteOrder java.nio.ByteOrder.nativeOrder()}.
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
    public void test_nativeOrder()
    throws Exception {
        // write some test for {@link java.nio.ByteOrder#nativeOrder()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.ByteOrder]

}
