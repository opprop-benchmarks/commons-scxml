/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.scxml2.model;

/**
 * The class in this SCXML object model that corresponds to the
 * &lt;final&gt; SCXML element.
 *
 * @since 0.7
 */
public class Final extends EnterableState {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default no-args constructor.
     */
    public Final() {
        super();
    }

    /**
     * @return Returns the State parent
     */
    @Override
    public State getParent() {
        return (State)super.getParent();
    }

    /**
     * Set the parent State.
     * @param parent The parent state to set
     */
    public final void setParent(State parent) {
        super.setParent(parent);
    }

    /**
     * {@inheritDoc}
     * @return Returns always true (a state of type Final is always atomic)
     */
    public final boolean isAtomicState() {
        return true;
    }
}

