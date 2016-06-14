package org.j8unit.generator.subpackage;

import org.j8unit.generator.OuterClass;

public class ExtenderClass
extends OuterClass {

    public ExtenderClass() {
        final OuterClass.InnerClass1 i1 = null;
        // final OuterClass.InnerClass2 i2 = null;
        final OuterClass.InnerClass3 i3 = null;
        // final OuterClass.InnerClass4 i4 = null;
        super.method1();
        // super.method2();
        super.method3();
        // ou.method4();
    }

}
