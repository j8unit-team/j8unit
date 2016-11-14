package org.j8unit.repository.java.lang.annotation;

import org.junit.Test;

/**
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>By virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
 * Sec.&thinsp;9.6.1</a>)!
 *
 * Unfortunately, the java compiler translates lambda fields into <em>synthetic</em> methods! In result, the byte code
 * may contain methods that actually do have formal parameters and/or do have a {@code throws} clause. Because of the
 * Java's internal assumptions, working with lambda-field-containing annotations causes strange errors.
 *
 * @since 0.9.4
 */
public class AnnotationClassBugs {

    @Test
    public void javaCompilerFulfillsVirtueOfAnnotationByMethodWithFormalParameters_Supplier() {
        final AnnotationClassTests<AnnotationWithSupplierField> awsf = () -> AnnotationWithSupplierField.class;
        awsf.declaredMethodsCannotHaveFormalParameters();
    }

    @Test
    public void javaCompilerFulfillsVirtueOfAnnotationByMethodWithThrowsClause_Supplier() {
        final AnnotationClassTests<AnnotationWithSupplierField> awsf = () -> AnnotationWithSupplierField.class;
        awsf.declaredMethodsCannotHaveThrowsClause();
    }

    @Test(expected = AssertionError.class /* because there is a bug! */)
    public void javaCompilerCrashesVirtueOfAnnotationByMethodWithFormalParameters_UnaryOperator() {
        final AnnotationClassTests<AnnotationWithUnaryOperatorField> awuof = () -> AnnotationWithUnaryOperatorField.class;
        awuof.declaredMethodsCannotHaveFormalParameters();
    }

    @Test
    public void javaCompilerFulfillsVirtueOfAnnotationByMethodWithThrowsClause_UnaryOperator() {
        final AnnotationClassTests<AnnotationWithUnaryOperatorField> awuof = () -> AnnotationWithUnaryOperatorField.class;
        awuof.declaredMethodsCannotHaveThrowsClause();
    }

    @Test
    public void javaCompilerFulfillsVirtueOfAnnotationByMethodWithFormalParameters_Callable() {
        final AnnotationClassTests<AnnotationWithCallableField> awcf = () -> AnnotationWithCallableField.class;
        awcf.declaredMethodsCannotHaveFormalParameters();
    }

    @Test(expected = AssertionError.class /* because there is a bug! */)
    public void javaCompilerCrashesVirtueOfAnnotationByMethodWithThrowsClause_Callable() {
        final AnnotationClassTests<AnnotationWithCallableField> awcf = () -> AnnotationWithCallableField.class;
        awcf.declaredMethodsCannotHaveThrowsClause();
    }

}
