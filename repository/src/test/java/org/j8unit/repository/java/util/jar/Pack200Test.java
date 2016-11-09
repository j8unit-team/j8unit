package org.j8unit.repository.java.util.jar;

import java.util.jar.Pack200;
import java.util.jar.Pack200.Packer;
import java.util.jar.Pack200.Unpacker;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Pack200} (by simply reusing the
 * J8Unit test interface {@link Pack200Tests}).
 */

@RunWith(J8Unit4.class)
public class Pack200Test
implements Pack200Tests<Pack200> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.Pack200]

    @Override
    public Pack200 createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.jar.Pack200], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.jar.Pack200]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.jar.Pack200]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Packer} (by simply reusing the
     * J8Unit test interface {@link PackerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class PackerTest
    implements PackerTests<Packer> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.Pack200$Packer]

        @Override
        public Packer createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.jar.Pack200.Packer], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.jar.Pack200$Packer]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.jar.Pack200$Packer]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Unpacker} (by simply reusing the
     * J8Unit test interface {@link UnpackerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class UnpackerTest
    implements UnpackerTests<Unpacker> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.Pack200$Unpacker]

        @Override
        public Unpacker createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.jar.Pack200.Unpacker], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.jar.Pack200$Unpacker]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.jar.Pack200$Unpacker]

    }

}
