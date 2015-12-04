package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EnumTests<SUT extends java.lang.Enum<E>, E extends java.lang.Enum<E>>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    @Test
    public default void getDeclaringClassMustBeEnum() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Class<E> declaringClazz = sut.getDeclaringClass();
        assertTrue(declaringClazz.isEnum());
    }

    @Test

    public default void getDeclaringClassMustBeAssignableFromGetClass() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Class<E> declaringClazz = sut.getDeclaringClass();
        final Class<? extends Enum> clazz = sut.getClass();
        assertTrue(declaringClazz.isAssignableFrom(clazz));
    }

}
