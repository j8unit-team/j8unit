package org.j8unit.generator.subpackage;

import org.j8unit.generator.OuterClass;

public class UserClass {

    @SuppressWarnings({ "null", "unused" /* main intention is to see the compile time accessibility */ })
    public UserClass() {
        final OuterClass.InnerClass1 i1 = null;
        // final OuterClass.InnerClass2 i2 = null;
        // final OuterClass.InnerClass3 i3 = null;
        // final OuterClass.InnerClass4 i4 = null;
        final OuterClass ou = null;
        ou.method1();
        // ou.method2();
        // ou.method3();
        // ou.method4();
    }

}
