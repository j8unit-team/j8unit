package org.j8unit.util;

import static java.lang.invoke.MethodHandles.lookup;
import java.lang.invoke.MethodHandles.Lookup;

public abstract class Bar
extends Foo {

    @Override
    public abstract String foo(Number n);

    public static Lookup getLookupInSuperClass() {
        return lookup();
    }

    @Override
    public String sayYourName() {
        return super.sayYourName();
    }

}