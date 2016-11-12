package org.j8unit.repository.java.lang.annotation;

import org.junit.Test;

/**
 * @since 0.9.4
 */
public class AnnotationClassBugs {

    @Test
    public void javaCompilerFulfillsVirtueOfAnnotationByMethodWithFormalParameters_Supplier() {
        final AnnotationClassTests<AnnotationWithSupplierField> awsf = () -> AnnotationWithSupplierField.class;
        awsf.declaredMethodsCannotHaveFormalParameters();
    }

    @Test(expected = AssertionError.class)
    public void javaCompilerCrashesVirtueOfAnnotationByMethodWithFormalParameters_UnaryOperator() {
        final AnnotationClassTests<AnnotationWithUnaryOperatorField> awuof = () -> AnnotationWithUnaryOperatorField.class;
        awuof.declaredMethodsCannotHaveFormalParameters();
    }

    @Test
    public void javaCompilerFulfillsVirtueOfAnnotationByMethodWithFormalParameters_Callable() {
        final AnnotationClassTests<AnnotationWithCallableField> awcf = () -> AnnotationWithCallableField.class;
        awcf.declaredMethodsCannotHaveFormalParameters();
    }

    @Test
    public void javaCompilerFulfillsVirtueOfAnnotationByMethodWithThrowsClause_Supplier() {
        final AnnotationClassTests<AnnotationWithSupplierField> awsf = () -> AnnotationWithSupplierField.class;
        awsf.declaredMethodsCannotHaveThrowsClause();
    }

    @Test
    public void javaCompilerFulfillsVirtueOfAnnotationByMethodWithThrowsClause_UnaryOperator() {
        final AnnotationClassTests<AnnotationWithUnaryOperatorField> awuof = () -> AnnotationWithUnaryOperatorField.class;
        awuof.declaredMethodsCannotHaveThrowsClause();
    }

    @Test(expected = AssertionError.class)
    public void javaCompilerCrashesVirtueOfAnnotationByMethodWithThrowsClause_Callable() {
        final AnnotationClassTests<AnnotationWithCallableField> awcf = () -> AnnotationWithCallableField.class;
        awcf.declaredMethodsCannotHaveThrowsClause();
    }

}
