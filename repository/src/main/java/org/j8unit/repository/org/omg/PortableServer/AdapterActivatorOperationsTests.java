package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.AdapterActivatorOperations interface org.omg.PortableServer.AdapterActivatorOperations},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.AdapterActivatorOperationsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AdapterActivatorOperationsTests<SUT extends org.omg.PortableServer.AdapterActivatorOperations>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.AdapterActivatorOperations#unknown_adapter(org.omg.PortableServer.POA,java.lang.String) public abstract boolean org.omg.PortableServer.AdapterActivatorOperations.unknown_adapter(org.omg.PortableServer.POA,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unknown_adapter_POA_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
