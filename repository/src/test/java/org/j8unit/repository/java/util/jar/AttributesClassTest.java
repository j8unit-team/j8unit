package org.j8unit.repository.java.util.jar;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributesClassTest
implements org.j8unit.repository.java.util.jar.AttributesClassTests<java.util.jar.Attributes> {

    @Override
    public Class<java.util.jar.Attributes> createNewSUT() {
        return java.util.jar.Attributes.class;
    }

    @RunWith(J8Unit4.class)
    public static class NameClassTest
    implements org.j8unit.repository.java.util.jar.AttributesClassTests.NameClassTests<java.util.jar.Attributes.Name> {

        @Override
        public Class<java.util.jar.Attributes.Name> createNewSUT() {
            return java.util.jar.Attributes.Name.class;
        }

    }

}
