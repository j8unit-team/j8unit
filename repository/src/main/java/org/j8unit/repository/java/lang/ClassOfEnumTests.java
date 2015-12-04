package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Test;

@FunctionalInterface
public interface ClassOfEnumTests<E extends Enum<E>>
extends ClassTests<E> {

    @Test
    public default void valuesMustExistStatically()
    throws Exception {
        final Class<E> sut = this.createNewSUT();
        assert sut != null;
        final Method method = sut.getMethod("values");
        assertNotNull(method);
        assertTrue(Modifier.isStatic(method.getModifiers()));
    }

    @Test
    public default void valuesMustReturnNotNull()
    throws Exception {
        final Class<E> sut = this.createNewSUT();
        assert sut != null;
        final Method method = sut.getMethod("values");
        assert Modifier.isStatic(method.getModifiers());
        final Object result = method.invoke(null);
        final Object referenceArray = Array.newInstance(sut, 0);
        assertTrue(referenceArray.getClass().isInstance(result));
    }

    @Test
    public default void valuesMustSuitValueOf()
    throws Exception {
        final Class<E> sut = this.createNewSUT();
        assert sut != null;
        final Method method = sut.getMethod("values");
        assert Modifier.isStatic(method.getModifiers());
        final @SuppressWarnings("unchecked") E[] result = (E[]) method.invoke(null);
        for (final E enumm : result) {
            final E valueOf = Enum.valueOf(sut, enumm.name());
            assertNotNull(valueOf);
            assertEquals(enumm, valueOf);
        }
    }

}
