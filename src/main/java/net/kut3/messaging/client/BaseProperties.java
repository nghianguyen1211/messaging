/*
 * Copyright 2019 Kut3Net.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.kut3.messaging.client;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public abstract class BaseProperties {
    
    private final String name;
    private final Map<String, Object> props = new HashMap<>();
    
    /**
     * 
     * @param name Name or id of the client
     */
    public BaseProperties(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @return Name of the client
     */
    public final String clientName() {
        return this.name;
    }
    
    /**
     * 
     * @param propertyName Name of the property to get value
     * @return Value of the property
     */
    public final Object get(String propertyName) {
        return this.props.get(propertyName);
    }
    
    /**
     * 
     * @param propertyName Name of the property to check
     * @return true or false
     */
    public final boolean containsProperty(String propertyName) {
        return this.props.containsKey(propertyName);
    }
    
    /**
     * 
     * @param propertyName Name of the property
     * @param propertyValue Value of the property
     */
    protected final void put(String propertyName, Object propertyValue) {
        this.props.put(propertyName, propertyValue);
    }
}
