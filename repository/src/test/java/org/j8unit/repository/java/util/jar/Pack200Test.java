package org.j8unit.repository.java.util.jar;

import java.util.jar.Pack200;
import java.util.jar.Pack200.Packer;
import java.util.jar.Pack200.Unpacker;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Pack200Test
implements org.j8unit.repository.java.util.jar.Pack200Tests<Pack200> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.Pack200]

    @Override
    public Pack200 createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.jar.Pack200], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.Pack200]

    @RunWith(J8Unit4.class)
    public static class PackerTest
    implements org.j8unit.repository.java.util.jar.Pack200Tests.PackerTests<Packer> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.Pack200$Packer]

        @Override
        public Packer createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.jar.Pack200.Packer], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.Pack200$Packer]

    }

    @RunWith(J8Unit4.class)
    public static class UnpackerTest
    implements org.j8unit.repository.java.util.jar.Pack200Tests.UnpackerTests<Unpacker> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.Pack200$Unpacker]

        @Override
        public Unpacker createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.jar.Pack200.Unpacker], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.Pack200$Unpacker]

    }

}
