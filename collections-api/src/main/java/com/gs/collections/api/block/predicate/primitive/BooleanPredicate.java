/*
 * Copyright 2012 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.api.block.predicate.primitive;

import java.io.Serializable;

/**
 * BooleanPredicate is a primitive Predicate which may be used to reduce the overhead
 * of autoboxing Boolean objects in places where primitive booleans could be used.
 */
public interface BooleanPredicate
        extends Serializable
{
    boolean accept(boolean value);
}
