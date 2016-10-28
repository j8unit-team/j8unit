package org.j8unit.repository.java.util.jar;

import java.util.jar.Pack200;
import java.util.jar.Pack200.Packer;
import java.util.jar.Pack200.Unpacker;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Pack200ClassTest
implements org.j8unit.repository.java.util.jar.Pack200ClassTests<Pack200> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.jar.Pack200]

    @Override
    public Class<Pack200> createNewSUT() {
        return Pack200.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Pack200#newUnpacker() public static
     * java.util.jar.Pack200$Unpacker java.util.jar.Pack200.newUnpacker()}.
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
    public void test_newUnpacker()
    throws Exception {
        // write some test for {@link Pack200#newUnpacker()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Pack200#newPacker() public static synchronized
     * java.util.jar.Pack200$Packer java.util.jar.Pack200.newPacker()}.
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
    public void test_newPacker()
    throws Exception {
        // write some test for {@link Pack200#newPacker()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.jar.Pack200]

    @RunWith(J8Unit4.class)
    public static class UnpackerClassTest
    implements org.j8unit.repository.java.util.jar.Pack200ClassTests.UnpackerClassTests<Unpacker> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.jar.Pack200$Unpacker]

        @Override
        public Class<Unpacker> createNewSUT() {
            return Unpacker.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.jar.Pack200$Unpacker]

    }

    @RunWith(J8Unit4.class)
    public static class PackerClassTest
    implements org.j8unit.repository.java.util.jar.Pack200ClassTests.PackerClassTests<Packer> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.jar.Pack200$Packer]

        @Override
        public Class<Packer> createNewSUT() {
            return Packer.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.jar.Pack200$Packer]

    }

}
