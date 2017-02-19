package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.j8unit.repository.java.io.SerializableClassTests;
import org.junit.Test;

@SuppressWarnings("rawtypes")
public abstract interface EnumClassTests<SUT extends Enum>
extends ComparableClassTests<SUT>, SerializableClassTests<SUT>, ObjectClassTests<SUT> {

    @Test
    public default void isEnumMustReturnTrue()
    throws Exception {
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
        assumeFalse("This general test method is not suitable for [" + Enum.class.getName() + "] itself.", Enum.class.equals(sut));
        assertTrue(sut.isEnum());
    }

    @Test
    public default void enumsMustContainImplicitilyDefinedValuesMethod()
    throws Exception {
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
        assumeFalse("This general test method is not suitable for [" + Enum.class.getName() + "] itself.", Enum.class.equals(sut));
        final Method method = sut.getMethod("values");
        assertNotNull(method);
        assertTrue(method.getReturnType().isArray());
        assertTrue(Modifier.isStatic(method.getModifiers()));
        final Object invocation = method.invoke(null);
        assertNotNull(invocation);
        assertTrue(invocation.getClass().isArray());
        assertEquals(sut, invocation.getClass().getComponentType());
        final @SuppressWarnings("unchecked") SUT[] enums = (SUT[]) invocation;
        assertArrayEquals(sut.getEnumConstants(), enums);
    }

}
