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

/**
 *
 */
public abstract class ConsumerProperties extends BaseProperties {
    
    private boolean autoAck = true;
    
    /**
     * 
     * @param name Name or id of the consumer
     */
    public ConsumerProperties(String name) {
        super(name);
    }
    
    /**
     * Default value is true.
     * @return true or false
     */
    public boolean isAutoAck() {
        return this.autoAck;
    }
    
    /**
     * 
     * @param value true of false
     */
    public void autoAck(boolean value) {
        this.autoAck = value;
    }
}
