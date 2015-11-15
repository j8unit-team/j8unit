package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public interface EnumTests<SUT extends Enum<SUT>>
extends ObjectTests<SUT> {

    @Test
    public default void getClassMustBeEnum() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Class<? extends Enum> clazz = sut.getClass();
        assertTrue(clazz.isEnum());
    }

    @Test
    public default void getDeclaringClassMustBeAssignableFromGetClass() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Class<SUT> declaringClazz = sut.getDeclaringClass();
        final Class<? extends Enum> clazz = sut.getClass();
        assertTrue(declaringClazz.isAssignableFrom(clazz));
    }

    @Test
    public default void getDeclaringClassMustBeEnum() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Class<SUT> declaringClazz = sut.getDeclaringClass();
        assertTrue(declaringClazz.isEnum());
    }

}
