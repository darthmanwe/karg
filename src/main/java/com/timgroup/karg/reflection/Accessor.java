package com.timgroup.karg.reflection;

import com.timgroup.karg.reference.Lens;

public interface Accessor<C, V> extends Lens<C, V>, TypeBearer<V> {
    String propertyName();
    boolean isMutable();
}
