package org.j8unit.generator.analysis;

import static org.j8unit.generator.analysis.TypeNatures.GENERIC;
import static org.j8unit.generator.analysis.TypeNatures.NON_GENERIC;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TypeNaturesTest2 {

    @Test
    public void testAccordingTypeArgumentness()
    throws Exception {
        assertEquals(NON_GENERIC, TypeNatures.natureOf(A.class));
        assertEquals(GENERIC, TypeNatures.natureOf(I.class));
        assertEquals(GENERIC, TypeNatures.natureOf(B.class));
        assertEquals(NON_GENERIC, TypeNatures.natureOf(C.class));
        assertEquals(NON_GENERIC, TypeNatures.natureOf(D.class));
        assertEquals(NON_GENERIC, TypeNatures.natureOf(E.class));
    }

    public static class A {
    }

    public static interface I<X> {
    }

    public static class B<Y extends CharSequence>
    implements I<Y> {
    }

    public static class C
    implements I<String> {
    }

    public static class D
    extends B<String> {
    }

    public static class E
    extends C {
    }

}
