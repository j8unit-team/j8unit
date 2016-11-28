package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationGroupDesc;
import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ActivationGroupDesc} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.rmi.activation.ActivationGroupDescClassTests}).
 */
@RunWith(J8Unit4.class)
public class ActivationGroupDescClassTest
implements ActivationGroupDescClassTests<ActivationGroupDesc> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.activation.ActivationGroupDesc]

    @Override
    public Class<ActivationGroupDesc> createNewSUT() {
        return ActivationGroupDesc.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.activation.ActivationGroupDesc#ActivationGroupDesc(java.util.Properties, java.rmi.activation.ActivationGroupDesc.CommandEnvironment)
     * public
     * java.rmi.activation.ActivationGroupDesc(java.util.Properties,java.rmi.activation.ActivationGroupDesc$CommandEnvironment)}.
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
    public void create_ActivationGroupDesc_Properties_CommandEnvironment()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ActivationGroupDesc sut = null; // = new ActivationGroupDesc(java.util.Properties,
                                              // java.rmi.activation.ActivationGroupDesc.CommandEnvironment);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.activation.ActivationGroupDesc#ActivationGroupDesc(String, String, java.rmi.MarshalledObject, java.util.Properties, java.rmi.activation.ActivationGroupDesc.CommandEnvironment)
     * public
     * java.rmi.activation.ActivationGroupDesc(java.lang.String,java.lang.String,java.rmi.MarshalledObject<?>,java.util.Properties,java.rmi.activation.ActivationGroupDesc$CommandEnvironment)}.
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
    public void create_ActivationGroupDesc_String_String_MarshalledObject_Properties_CommandEnvironment()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ActivationGroupDesc sut = null; // = new ActivationGroupDesc(String, String, java.rmi.MarshalledObject,
                                              // java.util.Properties,
                                              // java.rmi.activation.ActivationGroupDesc.CommandEnvironment);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.activation.ActivationGroupDesc]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.activation.ActivationGroupDesc]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link CommandEnvironment} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.java.rmi.activation.ActivationGroupDescClassTests.CommandEnvironmentClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class CommandEnvironmentClassTest
    implements CommandEnvironmentClassTests<CommandEnvironment> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.activation.ActivationGroupDesc$CommandEnvironment]

        @Override
        public Class<CommandEnvironment> createNewSUT() {
            return CommandEnvironment.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.rmi.activation.ActivationGroupDesc.CommandEnvironment#CommandEnvironment(String, String[]) public
         * java.rmi.activation.ActivationGroupDesc$CommandEnvironment(java.lang.String,java.lang.String[])}.
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
        public void create_CommandEnvironment_String_StringArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final CommandEnvironment sut = null; // = new CommandEnvironment(String, String[]);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.activation.ActivationGroupDesc$CommandEnvironment]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.activation.ActivationGroupDesc$CommandEnvironment]

    }

}
