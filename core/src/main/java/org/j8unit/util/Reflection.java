package org.j8unit.util;

import static java.lang.String.format;
import static java.lang.invoke.MethodHandles.lookup;
import static java.lang.invoke.MethodHandles.Lookup.PACKAGE;
import static java.lang.invoke.MethodHandles.Lookup.PRIVATE;
import static java.lang.invoke.MethodHandles.Lookup.PROTECTED;
import static java.lang.invoke.MethodHandles.Lookup.PUBLIC;
import static java.lang.reflect.Modifier.isAbstract;
import static java.lang.reflect.Modifier.isFinal;
import static java.lang.reflect.Modifier.isPrivate;
import static java.security.AccessController.doPrivileged;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.empty;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.junit.runners.model.TestClass;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy reflection stuff.
 * </p>
 *
 * @since 4.12.2
 */
public enum Reflection {

    ;

    // TODO (Issue #61): Null-Check-Barriers

    /**
     * Returns the {@link Class} object associated with the Java type with the given string {@code name}. This method is
     * fail-safe, meaning it returns an {@linkplain Optional#empty() empty Optional} if the type cannot be located.
     *
     * @see #classForName(String, Consumer)
     * @see Class#forName(String)
     *
     * @param name
     *            the fully qualified name of the desired {@code Class}
     * @return an {@code Optional} of the {@code Class} object for the type with the specified {@code name}; an empty
     *         {@code Optional} if the type cannot be located
     * @throws NullPointerException
     *             iff the given {@code name} is {@code null}
     */
    public static final Optional<Class<?>> classForName(final String name) {
        return classForName(name, e -> {});
    }

    /**
     * Returns the {@link Class} object associated with the Java type with the given string {@code name}. This method is
     * fail-safe, meaning it returns an {@linkplain Optional#empty() empty Optional} if the type cannot be located,
     * whereas the according {@link ClassNotFoundException} is passed to the given {@code handler}.
     *
     * @see #classForName(String, Consumer)
     * @see Class#forName(String)
     *
     * @param name
     *            the fully qualified name of the desired {@code Class}
     * @param handler
     *            the consumer of any missing {@code Class}
     * @return an {@code Optional} of the {@code Class} object for the type with the specified {@code name}; an empty
     *         {@code Optional} if the type cannot be located
     * @throws NullPointerException
     *             iff the given {@code name} is {@code null}
     */
    public static final Optional<Class<?>> classForName(final String name, final Consumer<? super ClassNotFoundException> handler) {
        try {
            return Optional.of(Class.forName(name));
        } catch (final ClassNotFoundException missing) {
            handler.accept(missing);
            return Optional.empty();
        }
    }

    /**
     * Returns a mutable, ordered {@link Set} of all {@code class}es the given Java {@code type} is representing.
     *
     * This method is {@code null} safe, meaning it returns an according empty set.
     *
     * This method also returns an empty set if the given Java {@code type} is not a true {@code class} but an
     * {@code interface}.
     *
     * @see #allInterfacesOf(Class)
     * @see #allTypesOf(Class)
     *
     * @param type
     *            the Java type to query its {@code class}es
     * @return all {@code class}es the given Java {@code type} is representing
     */
    public static final LinkedHashSet<Class<?>> allClassesOf(final Class<?> type) {
        return getClassHierarchy(type);
    }

    /**
     * Returns a mutable, ordered {@link Set} of all {@code interface}s the given Java {@code type} is representing.
     *
     * This method is {@code null} safe, meaning it returns an according empty set.
     *
     * This method also returns an empty set if neither the given Java {@code type} nor any of its super-classes
     * implements an {@code interface}.
     *
     * @see #allClassesOf(Class)
     * @see #allTypesOf(Class)
     *
     * @param type
     *            the Java type to query its {@code interface}s
     * @return all {@code interface}s the given Java {@code type} is representing
     */
    public static final LinkedHashSet<Class<?>> allInterfacesOf(final Class<?> type) {
        return getTypeHierarchyAsStream(type).filter(Class::isInterface).collect(toCollection(LinkedHashSet::new));
    }

    /**
     * Returns a mutable, ordered {@link Set} of the complete type hierarchy of the given Java {@code type}.
     *
     * This method is {@code null} safe, meaning it returns an according empty set.
     *
     * If the given {@code type} represents a true {@code interface}, this method returns the according
     * {@linkplain #getInterfaceHierarchy(Class) interface hierarchy}.
     *
     * If the given {@code type} represents a true {@code code}, this method returns the complete
     * {@linkplain #getClassHierarchy(Class) class hierarchy} whereas each class is immediately followed by
     * {@linkplain #getInterfaceHierarchy(Class) all interfaces} it represents.
     *
     * @see #allInterfacesOf(Class)
     * @see #allTypesOf(Class)
     *
     * @param type
     *            the Java type to query its types
     * @return all types the given Java {@code type} is representing
     */
    public static final LinkedHashSet<Class<?>> allTypesOf(final Class<?> type) {
        return getTypeHierarchy(type);
    }

    /**
     * Returns a mutable, ordered {@link Set} of the complete {@code class} hierarchy of the given Java class.
     *
     * This method is {@code null} safe, meaning it returns an according empty set.
     *
     * This method also returns an empty set if the given Java class is not a true {@code class} but an
     * {@code interface}.
     *
     * @apiNote For whatever reason, {@link TestClass} does not declare {@link TestClass#getSuperClasses(Class)} in a
     *          reusable way. Thus, we simply specify our own hierarchy exploration implementation.
     *
     *          In case the given class represents a true Java {@code class}, this method behaves <em>similar</em> to
     *          {@link TestClass#getSuperClasses(Class)}. If, otherwise, the given class represents an
     *          {@code interface}, this method behaves <em>differently</em>, because the set will be empty. In order to
     *          explore some interface's hierarchy, use {@link #getInterfaceHierarchy(Class)} instead.
     *
     * @see #getClassHierarchyAsStream(Class)
     * @see #getInterfaceHierarchy(Class)
     * @see #getTypeHierarchy(Class)
     *
     * @param clazz
     *            the Java {@code class} to query its class hierarchy
     * @return the class' hierarchy
     */
    public static final LinkedHashSet<Class<?>> getClassHierarchy(final Class<?> clazz) {
        return getClassHierarchyAsStream(clazz).collect(toCollection(LinkedHashSet::new));
    }

    /**
     * Returns a {@link Stream} of the complete {@code class} hierarchy of the given Java class.
     *
     * This method is {@code null} safe, meaning it returns an according {@linkplain Stream#empty() empty} stream.
     *
     * This method also returns an empty stream if the given Java class is not a true {@code class} but an
     * {@code interface}.
     *
     * @implSpec Java does not allow cyclic type hierarchy. Thus, this recursive implementation will definitely come to
     *           an end.
     *
     * @see #getClassHierarchy(Class)
     * @see #getInterfaceHierarchyAsStream(Class)
     * @see #getTypeHierarchyAsStream(Class)
     *
     * @param clazz
     *            the Java {@code class} to query its class hierarchy
     * @return the class' hierarchy
     */
    public static final Stream<Class<?>> getClassHierarchyAsStream(final Class<?> clazz) {
        if (clazz == null) {
            return empty();
        } else if (clazz.isInterface()) {
            return empty();
        } else {
            return concat(Stream.of(clazz), getClassHierarchyAsStream(clazz.getSuperclass()));
        }
    }

    /**
     * Returns a mutable, ordered {@link Set} of the complete {@code interface} hierarchy of the given Java interface.
     *
     * This method is {@code null} safe, meaning it returns an according empty set.
     *
     * This method also returns an empty set if the given Java interface is not a true {@code interface} but a
     * {@code class}.
     *
     * @see #getInterfaceHierarchyAsStream(Class)
     * @see #getClassHierarchy(Class)
     * @see #getTypeHierarchy(Class)
     *
     * @param interfaze
     *            the Java {@code interface} to query its interface hierarchy
     * @return the interface's hierarchy
     */
    public static final LinkedHashSet<Class<?>> getInterfaceHierarchy(final Class<?> interfaze) {
        return getInterfaceHierarchyAsStream(interfaze).collect(toCollection(LinkedHashSet::new));
    }

    /**
     * Returns a {@link Stream} of the complete {@code interface} hierarchy of the given Java {@code type}.
     *
     * This method is {@code null} safe, meaning it returns an according {@linkplain Stream#empty() empty} stream.
     *
     * This method also returns an empty stream if the given Java {@code type} is not a true {@code interface} but a
     * {@code class}.
     *
     * @implSpec Java does not allow cyclic type hierarchy. Thus, this recursive implementation will definitely come to
     *           an end.
     *
     * @see #getInterfaceHierarchy(Class)
     * @see #getClassHierarchyAsStream(Class)
     * @see #getTypeHierarchyAsStream(Class)
     *
     * @param interfaze
     *            the Java {@code interface} to query its interface hierarchy
     * @return the interface's hierarchy
     */
    public static final Stream<Class<?>> getInterfaceHierarchyAsStream(final Class<?> interfaze) {
        if (interfaze == null) {
            return empty();
        } else if (!interfaze.isInterface()) {
            return empty();
        } else {
            return concat(Stream.of(interfaze), stream(interfaze.getInterfaces()).flatMap(x -> getInterfaceHierarchyAsStream(x)));
        }
    }

    /**
     * Returns a mutable, ordered {@link Set} of the complete type hierarchy of the given Java {@code type}.
     *
     * This method is {@code null} safe, meaning it returns an according empty set.
     *
     * If the given {@code type} represents a true {@code interface}, this method returns the according
     * {@linkplain #getInterfaceHierarchy(Class) interface hierarchy}.
     *
     * If the given {@code type} represents a true {@code code}, this method returns the complete
     * {@linkplain #getClassHierarchy(Class) class hierarchy} whereas each class is immediately followed by
     * {@linkplain #getInterfaceHierarchy(Class) all interfaces} it represents.
     *
     * @see #getTypeHierarchyAsStream(Class)
     * @see #getClassHierarchy(Class)
     * @see #getInterfaceHierarchy(Class)
     *
     * @param type
     *            the Java type to query its type hierarchy
     * @return the type's hierarchy
     */
    public static final LinkedHashSet<Class<?>> getTypeHierarchy(final Class<?> type) {
        return getTypeHierarchyAsStream(type).collect(toCollection(LinkedHashSet::new));
    }

    /**
     * Returns a {@link Stream} of the complete type hierarchy of the given Java {@code type}.
     *
     * This method is {@code null} safe, meaning it returns an according {@linkplain Stream#empty() empty} stream.
     *
     * If the given {@code type} represents a true {@code interface}, this method returns the according
     * {@linkplain #getInterfaceHierarchyAsStream(Class) interface hierarchy}.
     *
     * If the given {@code type} represents a true {@code code}, this method returns the complete
     * {@linkplain #getClassHierarchyAsStream(Class) class hierarchy} whereas each class is immediately followed by
     * {@linkplain #getInterfaceHierarchyAsStream(Class) all interfaces} it represents.
     *
     * @see #getTypeHierarchy(Class)
     * @see #getClassHierarchyAsStream(Class)
     * @see #getInterfaceHierarchyAsStream(Class)
     *
     * @param type
     *            the Java type to query its class hierarchy
     * @return the type's hierarchy
     */
    public static final Stream<Class<?>> getTypeHierarchyAsStream(final Class<?> type) {
        if (type == null) {
            return empty();
        } else if (type.isInterface()) {
            return getInterfaceHierarchyAsStream(type);
        } else {
            return getClassHierarchyAsStream(type).flatMap(t -> concat(Stream.of(t), stream(t.getInterfaces()).flatMap(x -> getInterfaceHierarchyAsStream(x))));
        }
    }

    /**
     * Returns {@code true} if the given base method is either equal to the second method or is overridden by the second
     * method.
     *
     * @param baseMethod
     *            the base method to use for calculation
     * @param overridingMethod
     *            the (potentially overriding) method to use for calculation
     * @return {@code true} iff both methods represent similar behaviour
     */
    public static final boolean isAssignableFrom(final Method baseMethod, final Method overridingMethod) {
        if (baseMethod.equals(overridingMethod)) {
            return true;
        }
        if (baseMethod.getDeclaringClass().isAssignableFrom(overridingMethod.getDeclaringClass())) {
            if (baseMethod.getName().equals(overridingMethod.getName())) {
                if (Arrays.equals(baseMethod.getParameterTypes(), overridingMethod.getParameterTypes())) {
                    if (baseMethod.getReturnType().isAssignableFrom(overridingMethod.getReturnType())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Returns a subset of the given set of types containing all redundant types.
     *
     * @param types
     *            the set of types to look at
     * @return a subset of the given set of types containing all redundant types
     */
    public static final Set<Class<?>> redundantTypes(final Set<Class<?>> types) {
        return types.stream()
                    .filter(candidate -> types.stream()
                                              // A {@code candidate} type is redundant in relation to a {@code
                                              // reference} type if (a) it is assignable from that {@code reference} and
                                              // (b) it is not equal to that {@code reference}. Further, (c) {@link
                                              // Object} is not redundant if the {@code reference} is an {@code
                                              // interface}.
                                              .anyMatch(reference -> candidate.isAssignableFrom(reference) //
                                                                     && !candidate.equals(reference) //
                                                                     && !(candidate.equals(Object.class) && reference.isInterface())))
                    .collect(toSet());
    }

    /**
     * Similar to {@link Lookup#ALL_MODES}, which is {@code private} only -- for whatever reason.
     */
    private static final int ALL_MODES = (PUBLIC | PROTECTED | PACKAGE | PRIVATE);

    /**
     * If there is a security manager, this method requires {@code suppressAccessChecks} permission to execute without
     * failure.
     */
    public static final Lookup vicariousLookup(final Class<?> reference, final int... requiredAccesses)
    throws SecurityException {
        // either (1) use default access or (2) join access modes and remove illegal integer bits
        final int requiredAccess = requiredAccesses.length == 0 ? ALL_MODES : stream(requiredAccesses).reduce(0, (x, y) -> x | y) & ALL_MODES;
        final Lookup lookup = lookup().in(reference);
        if ((lookup.lookupModes() & requiredAccess) == requiredAccess) {
            return lookup;
        } else {
            try {
                final Field field = Lookup.class.getDeclaredField("allowedModes");
                assert isPrivate(field.getModifiers()) : "Java has been refactored and, now, the field 'allowedModes' is not private anymore!";
                assert isFinal(field.getModifiers()) : "Java has been refactored and, now, the field 'allowedModes' is not final anymore!";
                doPrivileged((PrivilegedAction<Void>) () -> {
                    field.setAccessible(true);
                    return null;
                });
                field.setInt(lookup, lookup.lookupModes() | requiredAccess);
                return lookup;
            } catch (final NoSuchFieldException missing) {
                throw new RuntimeException("Java has been refactored and, now, the invoked field 'allowedModes' is missing!", missing);
            } catch (final IllegalAccessException inaccessible) {
                throw new RuntimeException("Java has been refactored and, now, the invoked field 'allowedModes' is inaccessible!", inaccessible);
            }
        }
    }

    /**
     * Returns an {@link InvocationHandler} that immediately returns the given {@code result} object. In case of an
     * invoked {@code void} method, the invocation handler will throw a {@link ClassCastException}. Such exception is
     * thrown similarly if the {@code result} object is not an instance of the invoked method's return type.
     *
     * @param result
     *            the result object
     * @return the invocation handler with a constant return behaviour
     */
    public static final InvocationHandler constantResult(final Object result) {
        final String NOT_INSTANCE = "Supplied object of type '%s' is not an instance of invoked method's return type '%s'!";
        return (proxy, method, args) -> {
            final Class<?> returnType = method.getReturnType();
            if (Void.TYPE.equals(returnType) || (result == null) || returnType.isInstance(result)) {
                return result;
            } else {
                // TODO: Do we need this type check barrier? A ClassCastException will be thrown in any case (see:
                // {@link InvocationTests#wrong_return_type_causes_implicit_ClassCastException_even_without_return_value_assignment()}
                throw new ClassCastException(format(NOT_INSTANCE, result.getClass(), returnType));
            }
        };
    }

    /**
     * Returns a wrapping {@link InvocationHandler} that dispatches the invocation of a {@code specific} method onto a
     * specific invocation {@link InvocationHandler handler} and refers any other method invocations to the given
     * {@code fallback} handler.
     *
     * @apiNote The returned invocation handler is aware of sub-types' methods overriding the given method. Any
     *          invocation of such sub-method will be dispatched too.
     *
     * @param target
     *            the method to dispatch its invocation
     * @param handler
     *            the according specific invocation handler
     * @param fallback
     *            the fall-back invocation handler
     * @return the wrapping invocation handler
     */
    public static final InvocationHandler dispatch(final Method target, final InvocationHandler handler, final InvocationHandler fallback) {
        return (proxy, current, args) -> (isAssignableFrom(target, current) ? handler : fallback).invoke(proxy, current, args);
    }

    /**
     * Flag to indicate to skip the invocation of {@code abstract} methods.
     *
     * @see #ENFORCE_ABSTRACT
     *
     * @see #trySuperInterfacesFirst(InvocationHandler, boolean)
     * @see #trySuperClassesFirst(InvocationHandler, boolean)
     * @see #trySuperTypesFirst(InvocationHandler, boolean)
     */
    public static final boolean SKIP_ABSTRACT = false;

    /**
     * <p>
     * Flag to indicate to enforce the invocation of {@code abstract} methods.
     * </p>
     *
     * <p>
     * <em>Note:</em> Invoking {@code abstract} methods causes an {@link AbstractMethodError} to be thrown.
     * </p>
     *
     * @see #SKIP_ABSTRACT
     *
     * @see #trySuperInterfacesFirst(InvocationHandler, boolean)
     * @see #trySuperClassesFirst(InvocationHandler, boolean)
     * @see #trySuperTypesFirst(InvocationHandler, boolean)
     */
    public static final boolean ENFORCE_ABSTRACT = true;

    private static final Object trySuperTypeInvocation(final Object proxy, final Method method, final Object[] args, final Iterable<Class<?>> superTypes,
                                                       final boolean invokeAbstract, final InvocationHandler fallback)
    throws IllegalAccessException, Throwable {
        for (final Class<?> superType : superTypes) {
            assert superType.isAssignableFrom(proxy.getClass()) : "Illegal Java type!";
            try {
                Method target;
                try {
                    // method either is {@code public} already or might be overridden with extended visibility
                    target = superType.getMethod(method.getName(), method.getParameterTypes());
                } catch (final NoSuchMethodException noPublicMethod) {
                    // alternatively, method may be declared
                    target = superType.getDeclaredMethod(method.getName(), method.getParameterTypes());
                }
                if (method.getReturnType().isAssignableFrom(target.getReturnType()) && (!isAbstract(target.getModifiers()) || invokeAbstract)) {
                    // [A] fully assignable method, either non-abstract or invocation enforced
                    final Lookup lookup = vicariousLookup(superType);
                    final MethodHandle handle = lookup.unreflectSpecial(target, superType);
                    return handle.bindTo(proxy).invokeWithArguments(args);
                }
                // [B] non-assignable method or abstract method without enforced invocation
            } catch (final NoSuchMethodException noDeclaredMethod) {
                // [C] no such method at all
            }
        }
        return fallback.invoke(proxy, method, args);
    }

    /**
     * Returns an {@link InvocationHandler} that tries to provide the invoked method by referring to the nearest
     * implementation of its super classes. In result it behaves similar to an implementation like this:
     *
     * <pre class="brush:java">
     * [&hellip;]
     * public SomeReturnObject someMethod(SomeArguments args) {
     *     return super.someMethod(args);
     * }
     * [&hellip;]
     * </pre>
     *
     * Whether or not the {@code invokeAbstract} flag is set, even {@code abstract} super methods will be invoked. For
     * sure, such invocation causes an {@link AbstractMethodError} to be thrown.
     *
     *
     * @see #SKIP_ABSTRACT
     * @see #ENFORCE_ABSTRACT
     *
     * @see Reflection#trySuperTypesFirst(InvocationHandler, boolean)
     * @see Reflection#trySuperInterfacesFirst(InvocationHandler, boolean)
     *
     * @param fallback
     *            the fall-back invocation handler
     * @param invokeAbstract
     *            whether or not to invoke an abstract super method
     * @return the wrapper invocation handler
     */
    public static final InvocationHandler trySuperClassesFirst(final InvocationHandler fallback, final boolean invokeAbstract) {
        return (proxy, method, args) -> {
            final LinkedHashSet<Class<?>> types = allClassesOf(proxy.getClass());
            types.remove(proxy.getClass());
            return trySuperTypeInvocation(proxy, method, args, types, invokeAbstract, fallback);
        };
    }

    /**
     * Returns an {@link InvocationHandler} that tries to provide the invoked method by referring to the nearest
     * {@code default} implementation of its super interfaces. In result it behaves similar to an implementation like
     * this:
     *
     * <pre class="brush:java">
     * [&hellip;]
     * public SomeReturnObject someMethod(SomeArguments args) {
     *     return SomeInterface.super.someMethod(args);
     * }
     * [&hellip;]
     * </pre>
     *
     * @see #SKIP_ABSTRACT
     * @see #ENFORCE_ABSTRACT
     *
     * @see #trySuperTypesFirst(InvocationHandler, boolean)
     * @see #trySuperClassesFirst(InvocationHandler, boolean)
     *
     * @param fallback
     *            the fall-back invocation handler
     * @param invokeAbstract
     *            whether or not to invoke an abstract super method
     * @return the wrapper invocation handler
     */
    public static final InvocationHandler trySuperInterfacesFirst(final InvocationHandler fallback, final boolean invokeAbstract) {
        return (proxy, method, args) -> {
            final LinkedHashSet<Class<?>> types = allInterfacesOf(proxy.getClass());
            types.removeAll(redundantTypes(types));
            return trySuperTypeInvocation(proxy, method, args, types, invokeAbstract, fallback);
        };
    }

    /**
     * Returns an {@link InvocationHandler} that tries to provide the invoked method by referring to the nearest
     * non-{@code abstract} implementation of its super types (either super classes or super interfaces).
     *
     * @see #SKIP_ABSTRACT
     * @see #ENFORCE_ABSTRACT
     *
     * @see #trySuperClassesFirst(InvocationHandler, boolean)
     * @see #trySuperInterfacesFirst(InvocationHandler, boolean)
     *
     * @param fallback
     *            the fall-back invocation handler
     * @param invokeAbstract
     *            whether or not to invoke an abstract super method
     * @return the wrapper invocation handler
     */
    public static final InvocationHandler trySuperTypesFirst(final InvocationHandler fallback, final boolean invokeAbstract) {
        return trySuperClassesFirst(trySuperInterfacesFirst(fallback, invokeAbstract), invokeAbstract);
    }

    /**
     * Returns an {@link InvocationHandler} that immediately throws a {@link Throwable} according to the given
     * {@code constructor} function. The cause message will contain the type of the invoked object, the invoked method,
     * and the arguments passed in the method invocation.
     *
     * @param constructor
     *            the {@code Throwable} factory
     * @return the failing invocation handler
     */
    public static final InvocationHandler fail(final Function<? super String, ? extends Throwable> constructor) {
        final String FAIL_PATTERN = "Missing invocation behaviour for instance of type '%s', method '%s', and arguments '%s'!";
        return (proxy, method, args) -> {
            // Do not (!) call any other method of {@code proxy} instead of {@link Object#getClass()}! (Especially, do
            // not call {@link Object#toString()}!) It most likely will end up in an endless recursion of this method.
            throw constructor.apply(format(FAIL_PATTERN, proxy.getClass(), method, Arrays.toString(args)));
        };
    }

}
