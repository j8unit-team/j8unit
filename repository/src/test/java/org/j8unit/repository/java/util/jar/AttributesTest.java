package org.j8unit.repository.java.util.jar;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributesTest
implements org.j8unit.repository.java.util.jar.AttributesTests<java.util.jar.Attributes> {

    @RunWith(J8Unit4.class)
    public static class NameTest
    implements org.j8unit.repository.java.util.jar.AttributesTests.NameTests<java.util.jar.Attributes.Name> {

        @Override
        public java.util.jar.Attributes.Name createNewSUT() {
            throw new AssertionError("There is no default constructor for [java.util.jar.Attributes.Name] available.");
        }

    }

    @Override
    public java.util.jar.Attributes createNewSUT() {
        return new java.util.jar.Attributes();
    }

}
