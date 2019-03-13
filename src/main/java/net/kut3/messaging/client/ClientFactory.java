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

import net.kut3.messaging.Producer;
import net.kut3.messaging.Consumer;

/**
 *
 */
public interface ClientFactory {
    
    /**
     * 
     */
    public static final String PRODUCER_NAME = "producerName";
    
    /**
     * 
     */
    public static final String CONSUMER_NAME = "consumerName";
    
    /**
     * 
     * @param producerProperties Properties of the producer
     * @return A {@link Producer} implementation instance
     */
    Producer newProducer(ProducerProperties producerProperties);
    
    /**
     * 
     * @param consumerProperties Properties of the consumer
     * @return A {@link Consumer} implementation instance
     */
    Consumer newConsumer(ConsumerProperties consumerProperties);
    
    /**
     * 
     */
    void close();
}
