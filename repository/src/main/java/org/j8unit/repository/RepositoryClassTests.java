package org.j8unit.repository;

import org.j8unit.J8UnitTest;
import org.junit.Test;

public interface RepositoryClassTests<SUT>
extends J8UnitTest<Class<SUT>> {

    @Test
    default void testAnnotationess()
    throws Exception {
        final Class<SUT> sut = createNewSUT();
        assert sut != null;
    }

    @Test
    public default void testEnumness()
    throws Exception {
        final Class<SUT> sut = createNewSUT();
        assert sut != null;
    }

    @Test
    default void testInterfaceness()
    throws Exception {
        final Class<SUT> sut = createNewSUT();
        assert sut != null;
    }

    @Test
    default void testPrimitiveness()
    throws Exception {
        final Class<SUT> sut = createNewSUT();
        assert sut != null;
    }

}
