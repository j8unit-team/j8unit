package org.j8unit.tools.generator;

import static java.util.Objects.requireNonNull;
import static org.j8unit.tools.Generator.CLASS_REPOSITORY;
import static org.j8unit.tools.Generator.INSTANCE_REPOSITORY;
import static org.j8unit.tools.generator.GeneratorTokens.NL;
import static org.j8unit.tools.generator.GeneratorTokens.SPACE;
import static org.j8unit.tools.generator.GeneratorTokens.indent;
import static org.j8unit.tools.util.NamingUtilities.javadocNameOf;
import java.lang.annotation.Annotation;
import java.lang.reflect.Executable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Consumer;
import org.j8unit.tools.Generator;
import junit.framework.Test;

public enum GeneratorCustoms {

    DEFAULT(null, null) {

        @Override
        public String customContent(final int enclosingLevel) {
            return "";
        }

    },

    ENUM_INSTANCE(INSTANCE_REPOSITORY, Enum.class) {

        @Override
        public String customContent(final int enclosingLevel)
        throws Exception {
            final String indent = indent(enclosingLevel);
            final StringBuilder out = new StringBuilder();
            newBy092(out, indent, this.clazz, this.clazz.getMethod("getDeclaringClass"));
            out.append(indent + "@" + Test.class.getSimpleName() + NL);
            out.append(indent + "public default void getDeclaringClassMustBeAssignableFromGetClass() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "final Class<E> declaringClazz = sut.getDeclaringClass();" + NL);
            out.append(indent + SPACE + "final Class<? extends Enum> clazz = sut.getClass();" + NL);
            out.append(indent + SPACE + "assertTrue(declaringClazz.isAssignableFrom(clazz));" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            newBy092(out, indent, this.clazz, this.clazz.getMethod("getDeclaringClass"));
            out.append(indent + "@" + Test.class.getSimpleName() + NL);
            out.append(indent + "public default void getDeclaringClassMustBeEnum() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "final Class<E> declaringClazz = sut.getDeclaringClass();" + NL);
            out.append(indent + SPACE + "assertTrue(declaringClazz.isEnum());" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            newBy092(out, indent, this.clazz, this.clazz.getMethod("ordinal"));
            out.append(indent + "@" + Test.class.getSimpleName() + NL);
            out.append(indent + "public default void ordinalMustBePositive()" + NL);
            out.append(indent + "throws Exception {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "assertTrue(sut.ordinal() >= 0);" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            return out.toString();
        }

    },

    CLASS_INSTANCE(INSTANCE_REPOSITORY, Class.class) {

        @Override
        public String customImports() {
            final StringBuilder sb = new StringBuilder();
            sb.append("import static " + org.junit.Assume.class.getName() + ".*;" + NL);
            return sb.toString();
        }

        @Override
        public String customContent(final int enclosingLevel)
        throws Exception {
            final String indent = indent(enclosingLevel);
            final StringBuilder out = new StringBuilder();
            newBy092(out, indent, this.clazz, Class.class.getMethod("getName"));
            out.append(indent + "@Test" + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.lang.Class.class, executable=\"public java.lang.String
            // java.lang.Class.getName()\",
            // javadoc=\"java.lang.Class#getName()\")"
            // + NL);
            out.append(indent + "public default void getNameMustBeNotNull() {" + NL);
            out.append(indent + SPACE + "final Class<T> sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "assertNotNull(sut.getName());" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            newBy092(out, indent, this.clazz, Class.class.getMethod("getName"));
            out.append(indent + "@Test" + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.lang.Class.class, executable=\"public java.lang.String
            // java.lang.Class.getName()\",
            // javadoc=\"java.lang.Class#getName()\")"
            // + NL);
            out.append(indent + "public default void getNameMustBeSyntacticallyValidIdentifier() {" + NL);
            out.append(indent + SPACE + "final Class<T> sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "assumeTrue(\"The given Class represents a primitive type; Thus, this test becomes useless.\", sut.isPrimitive());"
                       + NL);
            out.append(indent + SPACE + "assumeTrue(\"The given Class represents an array class; Thus, this test becomes useless.\", sut.isArray());" + NL);
            out.append(indent + SPACE + "final String name = sut.getName();" + NL);
            out.append(indent + SPACE + "assertTrue(javax.lang.model.SourceVersion.isIdentifier(name));" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            return out.toString();
        }

    },

    ITERABLE_INSTANCE(INSTANCE_REPOSITORY, Iterable.class) {

        @Override
        public String customImports() {
            final StringBuilder sb = new StringBuilder();
            sb.append("import static " + org.junit.Assume.class.getName() + ".*;" + NL);
            return sb.toString();
        }

        @Override
        public String customContent(final int enclosingLevel)
        throws Exception {
            final String indent = indent(enclosingLevel);
            final StringBuilder out = new StringBuilder();
            newBy092(out, indent, this.clazz, Iterable.class.getMethod("forEach", Consumer.class));
            out.append(indent + "@Test" + NL);
            // out.append(indent
            // + "@Aim(clazz=java.lang.Iterable.class, executable=\"public default void
            // java.lang.Iterable.forEach(java.util.function.Consumer)\",
            // javadoc=\"java.lang.Iterable#forEach(java.util.function.Consumer)\")"
            // + NL);
            out.append(indent + "@Category(TimeLinear.class)" + NL);
            out.append(indent + "public default void forEachMustConsumeNOOP() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "assumeTrue(\"The given Iterable is empty; Thus, this test becomes useless.\", sut.iterator().hasNext());" + NL);
            out.append(indent + SPACE + "sut.forEach(e -> {});" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            newBy092(out, indent, this.clazz, Iterable.class.getMethod("forEach", Consumer.class));
            out.append(indent + "@Test" + NL);
            // out.append(indent
            // + "@Aim(clazz=java.lang.Iterable.class, executable=\"public default void
            // java.lang.Iterable.forEach(java.util.function.Consumer)\",
            // javadoc=\"java.lang.Iterable#forEach(java.util.function.Consumer)\")"
            // + NL);
            out.append(indent + "public default void forEachMustRelayException() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "assumeTrue(\"The given Iterable is empty; Thus, this test becomes useless.\", sut.iterator().hasNext());" + NL);
            out.append(indent + SPACE + "final javax.xml.ws.Holder<Integer> counter = new javax.xml.ws.Holder<>(0);" + NL);
            out.append(indent + SPACE + "try {" + NL);
            out.append(indent + SPACE + "    sut.forEach(e -> {" + NL);
            out.append(indent + SPACE + "        counter.value++;" + NL);
            out.append(indent + SPACE + "        throw new UnsupportedOperationException(\"relayed exception\");" + NL);
            out.append(indent + SPACE + "    });" + NL);
            out.append(indent + SPACE + "    fail(\"Thrown exception has been suppressed!\");" + NL);
            out.append(indent + SPACE + "} catch (final UnsupportedOperationException relayed) {" + NL);
            out.append(indent + SPACE + "    // check exception" + NL);
            out.append(indent + SPACE + "    assertEquals(\"relayed exception\", relayed.getMessage());" + NL);
            out.append(indent + SPACE + "    // check unique execution of consumer block" + NL);
            out.append(indent + SPACE + "    assertEquals((Integer) 1, counter.value);" + NL);
            out.append(indent + SPACE + "    return;" + NL);
            out.append(indent + SPACE + "}" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            newBy092(out, indent, this.clazz, Iterable.class.getMethod("forEach", Consumer.class));
            out.append(indent + "@Test(expected = NullPointerException.class)" + NL);
            // out.append(indent
            // + "@Aim(clazz=java.lang.Iterable.class, executable=\"public default void
            // java.lang.Iterable.forEach(java.util.function.Consumer)\",
            // javadoc=\"java.lang.Iterable#forEach(java.util.function.Consumer)\")"
            // + NL);
            out.append(indent + "@Category(TimeLinear.class)" + NL);
            out.append(indent + "public default void forEachOfNullMustCauseNPE() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "sut.forEach(null);" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            out.append(indent + "@Test" + NL);
            out.append(indent + "public default void iteratorMustReturnNotNull() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "assertNotNull(sut.iterator());" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            newBy092(out, indent, this.clazz, Iterable.class.getMethod("spliterator"));
            out.append(indent + "@Test" + NL);
            // out.append(indent
            // + "@Aim(clazz=java.lang.Iterable.class, executable=\"public default java.util.Spliterator
            // java.lang.Iterable.spliterator()\", javadoc=\"java.lang.Iterable#spliterator()\")"
            // + NL);
            out.append(indent + "public default void spliteratorMustReturnNotNull() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "assertNotNull(sut.spliterator());" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            return out.toString();
        }

    },

    OBJECT_INSTANCE(INSTANCE_REPOSITORY, Object.class) {

        @Override
        public String customContent(final int enclosingLevel)
        throws Exception {
            final String indent = indent(enclosingLevel);
            final StringBuilder out = new StringBuilder();
            newBy092(out, indent, this.clazz, Object.class.getMethod("equals", Object.class));
            out.append(indent + "@Test" + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.lang.Object.class, executable=\"public boolean
            // java.lang.Object.equals(java.lang.Object)\", javadoc=\"java.lang.Object#equals(java.lang.Object)\")"
            // + NL);
            out.append(indent + "@Category(Should.class)" + NL);
            out.append(indent + "public default void equalsShouldBeReflexive() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "assertTrue(sut.equals(sut));" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            newBy092(out, indent, this.clazz, Object.class.getMethod("equals", Object.class));
            out.append(indent + "@Test" + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.lang.Object.class, executable=\"public boolean
            // java.lang.Object.equals(java.lang.Object)\", javadoc=\"java.lang.Object#equals(java.lang.Object)\")"
            // + NL);
            out.append(indent + "@Category(Should.class)" + NL);
            out.append(indent + "public default void equalsShouldRefuseNull() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "assertFalse(sut.equals(null));" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            newBy092(out, indent, this.clazz, Object.class.getMethod("getClass"));
            out.append(indent + "@Test" + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.lang.Object.class, executable=\"public final native java.lang.Class
            // java.lang.Object.getClass()\", javadoc=\"java.lang.Object#getClass()\")"
            // + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.lang.Class.class, executable=\"public native boolean
            // java.lang.Class.isInstance(java.lang.Object)\",
            // javadoc=\"java.lang.Class#isInstance(java.lang.Object)\")"
            // + NL);
            out.append(indent + "public default void getClassMustMatchIsInstance() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "final Class<? extends Object> clazz = sut.getClass();" + NL);
            out.append(indent + SPACE + "assert clazz != null;" + NL);
            out.append(indent + SPACE + "assertTrue(clazz.isInstance(sut));" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            newBy092(out, indent, this.clazz, Object.class.getMethod("getClass"));
            out.append(indent + "@Test" + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.lang.Object.class, executable=\"public final native java.lang.Class
            // java.lang.Object.getClass()\", javadoc=\"java.lang.Object#getClass()\")"
            // + NL);
            out.append(indent + "public default void getClassMustReturnNotNull() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "assertNotNull(sut.getClass());" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            out.append(indent + "/**" + NL);
            out.append(indent + " * <p>According to the general contract of {@link Object#toString()}, it" + NL);
            out.append(indent + " * <q>returns a string that \"textually represents\"</q> the object." + NL);
            out.append(indent + " *" + NL);
            out.append(indent + " * Thus, there is absolutely no reason why {@code null} could be returned. Especially because even a {@code null}" + NL);
            out.append(indent + " * can be easily represented textually by {@link java.util.Objects#toString(Object)}.</p>" + NL);
            out.append(indent + " *" + NL);
            out.append(indent + " * <p>And obviously, no however reached (problematic) inner state of an object is allowed to cause an exception while" + NL);
            out.append(indent + " * computing the textual representation. It instead should be represented accordingly.</p>" + NL);
            out.append(indent + " *" + NL);
            out.append(indent + " * @see " + javadocNameOf(Object.class.getMethod("toString")) + " " + Object.class.getMethod("toString")
                       + " (the hereby targeted method-under-test)" + NL);
            out.append(indent + " *" + NL);
            out.append(indent + " * @since 0.9.2" + NL);
            out.append(indent + " */" + NL);
            out.append(indent + "@Test" + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.lang.Object.class, executable=\"public java.lang.String
            // java.lang.Object.toString()\",
            // javadoc=\"java.lang.Object#toString()\")"
            // + NL);
            out.append(indent + "public default void toStringMustReturnNotNull() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "assertNotNull(sut.toString());" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            return out.toString();
        }

    },

    COLLECTION_INSTANCE(INSTANCE_REPOSITORY, Collection.class) {

        @Override
        public String customContent(final int enclosingLevel)
        throws Exception {
            final String indent = indent(enclosingLevel);
            final StringBuilder out = new StringBuilder();
            newBy092(out, indent, this.clazz, Collection.class.getMethod("iterator"), Collection.class.getMethod("isEmpty"));
            out.append(indent + "@Test" + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract java.util.Iterator
            // java.util.Collection.iterator()\", javadoc=\"java.util.Collection#iterator()\")"
            // + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract boolean
            // java.util.Collection.isEmpty()\", javadoc=\"java.util.Collection#isEmpty()\")"
            // + NL);
            out.append(indent + "public default void testIteratorAccordingToIsEmpty() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "final java.util.Iterator<E> iterator = sut.iterator();" + NL);
            out.append(indent + SPACE + "if (sut.isEmpty()) {" + NL);
            out.append(indent + SPACE + SPACE + "assertFalse(iterator.hasNext());" + NL);
            out.append(indent + SPACE + "} else {" + NL);
            out.append(indent + SPACE + SPACE + "assertTrue(iterator.hasNext());" + NL);
            out.append(indent + SPACE + "}" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            newBy092(out, indent, this.clazz, Collection.class.getMethod("size"));
            out.append(indent + "@Test" + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract int
            // java.util.Collection.size()\",
            // javadoc=\"java.util.Collection#size()\")"
            // + NL);
            out.append(indent + "public default void testNonNegativeSize() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "assertFalse(sut.size() < 0);" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            newBy092(out, indent, this.clazz, Collection.class.getMethod("size"), Collection.class.getMethod("isEmpty"));
            out.append(indent + "@Test" + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract int
            // java.util.Collection.size()\",
            // javadoc=\"java.util.Collection#size()\")"
            // + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract boolean
            // java.util.Collection.isEmpty()\", javadoc=\"java.util.Collection#isEmpty()\")"
            // + NL);
            out.append(indent + "public default void testSizeAccordingToIsEmpty() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "if (sut.isEmpty()) {" + NL);
            out.append(indent + SPACE + SPACE + "assertEquals(0, sut.size());" + NL);
            out.append(indent + SPACE + "} else {" + NL);
            out.append(indent + SPACE + SPACE + "assertNotEquals(0, sut.size());" + NL);
            out.append(indent + SPACE + "}" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            newBy092(out, indent, this.clazz, Collection.class.getMethod("size"), Collection.class.getMethod("toArray"));
            out.append(indent + "@Test" + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract int
            // java.util.Collection.size()\",
            // javadoc=\"java.util.Collection#size()\")"
            // + NL);
            // sb.append(indent
            // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract java.lang.Object[]
            // java.util.Collection.toArray()\", javadoc=\"java.util.Collection#toArray()\")"
            // + NL);
            out.append(indent + "public default void testToArraySize() {" + NL);
            out.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "final Object[] array = sut.toArray();" + NL);
            out.append(indent + SPACE + "assertEquals(sut.size(), array.length);" + NL);
            out.append(indent + "}" + NL);
            return out.toString();
        }

    },

    ENUM_CLASS(CLASS_REPOSITORY, Enum.class) {

        @Override
        public String customImports() {
            final StringBuilder sb = new StringBuilder();
            sb.append("import static " + org.junit.Assume.class.getName() + ".*;" + NL);
            sb.append("import " + java.lang.reflect.Method.class.getName() + ";" + NL);
            sb.append("import " + java.lang.reflect.Modifier.class.getName() + ";" + NL);
            return sb.toString();
        }

        @Override
        public String customContent(final int enclosingLevel)
        throws Exception {
            final String indent = indent(enclosingLevel);
            final StringBuilder out = new StringBuilder();
            GeneratorCustoms.newBy092(out, indent, this.clazz);
            out.append(indent + "@" + Test.class.getSimpleName() + NL);
            out.append(indent + "public default void enumsMustContainImplicitilyDefinedValuesMethod()" + NL);
            out.append(indent + "throws Exception {" + NL);
            out.append(indent + SPACE + "final Class<SUT> sut = this.createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE
                       + "assumeFalse(\"This general test method is not suitable for [\" + Enum.class.getName() + \"] itself.\", Enum.class.equals(sut));"
                       + NL);
            out.append(indent + SPACE + "final Method method = sut.getMethod(\"values\");" + NL);
            out.append(indent + SPACE + "assertNotNull(method);" + NL);
            out.append(indent + SPACE + "assertTrue(method.getReturnType().isArray());" + NL);
            out.append(indent + SPACE + "assertTrue(Modifier.isStatic(method.getModifiers()));" + NL);
            out.append(indent + SPACE + "final Object invocation = method.invoke(null);" + NL);
            out.append(indent + SPACE + "assertNotNull(invocation);" + NL);
            out.append(indent + SPACE + "assertTrue(invocation.getClass().isArray());" + NL);
            out.append(indent + SPACE + "assertEquals(sut, invocation.getClass().getComponentType());" + NL);
            out.append(indent + SPACE + "final @SuppressWarnings(\"unchecked\") SUT[] enums = (SUT[]) invocation;" + NL);
            out.append(indent + SPACE + "assertArrayEquals(sut.getEnumConstants(), enums);" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            return out.toString();
        }

    },

    ANNOTATION_CLASS(CLASS_REPOSITORY, Annotation.class) {

        @Override
        public String customImports() {
            final StringBuilder sb = new StringBuilder();
            sb.append("import " + java.lang.reflect.Method.class.getName() + ";" + NL);
            return sb.toString();
        }

        @Override
        public String customContent(final int enclosingLevel)
        throws Exception {
            final String indent = indent(enclosingLevel);
            final StringBuilder out = new StringBuilder();
            GeneratorCustoms.newBy092(out, indent, Annotation.class);
            out.append(indent + "@Test" + NL);
            // sb.append(indent + "@" + Aim.class.getSimpleName() + "(clazz=" + canonicalClassOf(clazz) + ",
            // javadoc=\""
            // + canonicalNameOf(clazz) + "\")" + NL);
            out.append(indent + "public default void declaredMethodsCannotHaveFormalParameters() {" + NL);
            out.append(indent + SPACE + "final Class<SUT> sut = createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "final Method[] methods = sut.getDeclaredMethods();" + NL);
            out.append(indent + SPACE + "assert methods != null;" + NL);
            out.append(indent + SPACE + "for (final Method method : methods) {" + NL);
            out.append(indent + SPACE + SPACE + "try {" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "final Method origin = Object.class.getMethod(method.getName(), method.getParameterTypes());" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "assert origin != null;" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "continue;" + NL);
            out.append(indent + SPACE + SPACE + "} catch (final NoSuchMethodException ignore) {" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "final Class<?>[] formals = method.getParameterTypes();" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "assert formals != null;" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "assertEquals(0, formals.length);" + NL);
            out.append(indent + SPACE + SPACE + "}" + NL);
            out.append(indent + SPACE + "}" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            GeneratorCustoms.newBy092(out, indent, Annotation.class);
            out.append(indent + "@Test" + NL);
            // sb.append(indent + "@" + Aim.class.getSimpleName() + "(clazz=" + canonicalClassOf(clazz) + ",
            // javadoc=\""
            // + canonicalNameOf(clazz) + "\")" + NL);
            out.append(indent + "public default void declaredMethodsCannotHaveThrowsClause() {" + NL);
            out.append(indent + SPACE + "final Class<SUT> sut = createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "final Method[] methods = sut.getDeclaredMethods();" + NL);
            out.append(indent + SPACE + "assert methods != null;" + NL);
            out.append(indent + SPACE + "for (final Method method : methods) {" + NL);
            out.append(indent + SPACE + SPACE + "try {" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "final Method origin = Object.class.getMethod(method.getName(), method.getParameterTypes());" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "assert origin != null;" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "continue;" + NL);
            out.append(indent + SPACE + SPACE + "} catch (final NoSuchMethodException ignore) {" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "final Class<?>[] exceptions = method.getExceptionTypes();" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "assert exceptions != null;" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "assertEquals(0, exceptions.length);" + NL);
            out.append(indent + SPACE + SPACE + "}" + NL);
            out.append(indent + SPACE + "}" + NL);
            out.append(indent + "}" + NL);
            out.append(NL);
            GeneratorCustoms.newBy092(out, indent, Annotation.class);
            out.append(indent + "@Test" + NL);
            // sb.append(indent + "@" + Aim.class.getSimpleName() + "(clazz=" + canonicalClassOf(clazz) + ",
            // javadoc=\""
            // + canonicalNameOf(clazz) + "\")" + NL);
            out.append(indent + "public default void declaredMethodsCannotHaveTypeParameters() {" + NL);
            out.append(indent + SPACE + "final Class<SUT> sut = createNewSUT();" + NL);
            out.append(indent + SPACE + "assert sut != null;" + NL);
            out.append(indent + SPACE + "final Method[] methods = sut.getDeclaredMethods();" + NL);
            out.append(indent + SPACE + "assert methods != null;" + NL);
            out.append(indent + SPACE + "for (final Method method : methods) {" + NL);
            out.append(indent + SPACE + SPACE + "try {" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "final Method origin = Object.class.getMethod(method.getName(), method.getParameterTypes());" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "assert origin != null;" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "continue;" + NL);
            out.append(indent + SPACE + SPACE + "} catch (final NoSuchMethodException ignore) {" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "final java.lang.reflect.TypeVariable<Method>[] types = method.getTypeParameters();" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "assert types != null;" + NL);
            out.append(indent + SPACE + SPACE + SPACE + "assertEquals(0, types.length);" + NL);
            out.append(indent + SPACE + SPACE + "}" + NL);
            out.append(indent + SPACE + "}" + NL);
            out.append(indent + "}" + NL);
            return out.toString();
        }

    };

    public abstract String customContent(final int enclosingLevel)
    throws Exception;

    public String customContentData(final int enclosingLevel) {
        try {
            return this.customContent(enclosingLevel);
        } catch (final Exception any) {
            return "";
        }
    }

    private final Generator generator;

    protected final Class<?> clazz;

    private GeneratorCustoms(final Generator generator, final Class<?> clazz) {
        this.generator = generator;
        this.clazz = clazz;
    }

    public static GeneratorCustoms valueOf(final Generator generator, final Class<?> clazz) {
        requireNonNull(generator);
        requireNonNull(clazz);
        return Arrays.stream(GeneratorCustoms.values()) //
                     .filter(gc -> Objects.equals(gc.generator, generator)) //
                     .filter(gc -> Objects.equals(gc.clazz, clazz)) //
                     .findFirst() //
                     .orElse(DEFAULT);
    }

    private static void newBy092(final StringBuilder sb, final String indent, final Class<?> clazz, final Executable... execs) {
        sb.append(indent + "/**" + NL);
        for (final Executable exec : execs) {
            sb.append(indent + " * @see " + javadocNameOf(clazz, exec) + " " + exec + " (the hereby targeted method-under-test)" + NL);
        }
        sb.append(indent + " *" + NL);
        sb.append(indent + " * @since 0.9.2" + NL);
        sb.append(indent + " */" + NL);
    }

    public String customImports() {
        return "";
    }

}
