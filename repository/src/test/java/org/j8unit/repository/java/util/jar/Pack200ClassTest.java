package org.j8unit.repository.java.util.jar;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Pack200ClassTest
implements org.j8unit.repository.java.util.jar.Pack200ClassTests<java.util.jar.Pack200> {

    @Override
    public Class<java.util.jar.Pack200> createNewSUT() {
        return java.util.jar.Pack200.class;
    }

    @RunWith(J8Unit4.class)
    public static class UnpackerClassTest
    implements org.j8unit.repository.java.util.jar.Pack200ClassTests.UnpackerClassTests<java.util.jar.Pack200.Unpacker> {

        @Override
        public Class<java.util.jar.Pack200.Unpacker> createNewSUT() {
            return java.util.jar.Pack200.Unpacker.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class PackerClassTest
    implements org.j8unit.repository.java.util.jar.Pack200ClassTests.PackerClassTests<java.util.jar.Pack200.Packer> {

        @Override
        public Class<java.util.jar.Pack200.Packer> createNewSUT() {
            return java.util.jar.Pack200.Packer.class;
        }

    }

}
