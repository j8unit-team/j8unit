package org.j8unit.repository.java.security;

import java.security.KeyRep;
import java.security.KeyRep.Type;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeyRep} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.KeyRepClassTests}).
 */
@RunWith(J8Unit4.class)
public class KeyRepClassTest
implements KeyRepClassTests<KeyRep> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyRep]

    @Override
    public Class<KeyRep> createNewSUT() {
        return KeyRep.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.KeyRep#KeyRep(java.security.KeyRep.Type, String, String, byte[]) public
     * java.security.KeyRep(java.security.KeyRep$Type,java.lang.String,java.lang.String,byte[])}.
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
    public void create_KeyRep_Type_String_String_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyRep sut = null; // = new KeyRep(java.security.KeyRep.Type, String, String, byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.KeyRep]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyRep]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Type} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.security.KeyRepClassTests.TypeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.java.security.KeyRepClassTests.TypeClassTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyRep$Type]

        @Override
        public Class<Type> createNewSUT() {
            return Type.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.security.KeyRep.Type#values() public static
         * java.security.KeyRep$Type[] java.security.KeyRep$Type.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_values()
        throws Exception {
            // write some test for {@link java.security.KeyRep.Type#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.security.KeyRep.Type#valueOf(String) public
         * static java.security.KeyRep$Type java.security.KeyRep$Type.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link java.security.KeyRep.Type#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.KeyRep$Type]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyRep$Type]

    }

}
