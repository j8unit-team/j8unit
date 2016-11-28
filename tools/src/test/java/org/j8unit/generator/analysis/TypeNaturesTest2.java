package org.j8unit.generator.analysis;

import static org.j8unit.generator.analysis.TypeNatures.GENERIC;
import static org.j8unit.generator.analysis.TypeNatures.NON_GENERIC;
import static org.j8unit.generator.analysis.TypeNatures.RAW;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TypeNaturesTest2 {

    @Test
    public void testAccordingTypeArgumentness1()
    throws Exception {
        assertEquals(NON_GENERIC, TypeNatures.natureOf(A.class));
    }

    @Test
    public void testAccordingTypeArgumentness2()
    throws Exception {
        assertEquals(GENERIC, TypeNatures.natureOf(I.class));
    }

    @Test
    public void testAccordingTypeArgumentness3()
    throws Exception {
        assertEquals(GENERIC, TypeNatures.natureOf(B.class));
    }

    @Test
    public void testAccordingTypeArgumentness4()
    throws Exception {
        assertEquals(GENERIC, TypeNatures.natureOf(B2.class));
    }

    @Test
    public void testAccordingTypeArgumentness5()
    throws Exception {
        assertEquals(RAW, TypeNatures.natureOf(PartialRawType.class));
    }

    @Test
    public void testAccordingTypeArgumentness6()
    throws Exception {
        assertEquals(GENERIC, TypeNatures.natureOf(B4.class));
    }

    @Test
    public void testAccordingTypeArgumentness7()
    throws Exception {
        assertEquals(NON_GENERIC, TypeNatures.natureOf(C.class));
    }

    @Test
    public void testAccordingTypeArgumentness8()
    throws Exception {
        assertEquals(NON_GENERIC, TypeNatures.natureOf(D.class));
    }

    @Test
    public void testAccordingTypeArgumentness9()
    throws Exception {
        assertEquals(NON_GENERIC, TypeNatures.natureOf(E.class));
    }

    @Test
    public void testAccordingTypeArgumentness10()
    throws Exception {
        assertEquals(NON_GENERIC, TypeNatures.natureOf(F.class));
    }

    @Test
    public void testAccordingTypeArgumentness11()
    throws Exception {
        assertEquals(RAW, TypeNatures.natureOf(R.class));
    }

    @Test
    public void testAccordingTypeArgumentness12()
    throws Exception {
        assertEquals(RAW, TypeNatures.natureOf(S.class));
    }

    @Test
    public void testAccordingTypeArgumentness13()
    throws Exception {
        assertEquals(RAW, TypeNatures.natureOf(T.class));
    }

    @Test
    public void testAccordingTypeArgumentness14()
    throws Exception {
        assertEquals(RAW, TypeNatures.natureOf(U.class));
    }

    public static class A {
    }

    public static interface I<X> {
    }

    public static interface J<X> {
    }

    public static class B<Y extends CharSequence>
    implements I<Y> {
    }

    public static class B2<Y extends CharSequence>
    implements I<Y>, J<Y> {
    }

    @SuppressWarnings("rawtypes")
    public static class PartialRawType<Y extends CharSequence>
    implements I<Y>, J {
    }

    public static class B4<Y extends CharSequence, Z extends CharSequence>
    implements I<Y>, J<Z> {
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

    public static class F
    extends E {
    }

    @SuppressWarnings("rawtypes")
    public static class R
    implements I {
    }

    public static class S
    extends R {
    }

    @SuppressWarnings("rawtypes")
    public static class T
    extends B {
    }

    public static class U
    extends T {
    }

}
