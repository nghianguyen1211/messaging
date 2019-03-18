///*
// * Copyright 2019 Kut3Net.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package net.kut3.messaging.client;
//
//import java.util.HashMap;
//import java.util.Map;
//import net.kut3.messaging.Producer;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///**
// *
// */
//public enum ProducerClients {
//    
//    /**
//     *
//     */
//    INSTANCE;
//    
//    private static final Logger LOGGER 
//            = LoggerFactory.getLogger(ProducerClients.class);
//
//    private final Map<String, Producer> producers = new HashMap<>();
//
//    /**
//     *
//     * @param producerName Name of the producer.
//     * @return A {@link Producer} object or null
//     */
//    public Producer get(String producerName) {
//        return this.producers.get(producerName);
//    }
//
//    /**
//     *
//     * @param producerName Name of the producer
//     * @param producer The producer object
//     */
//    public synchronized void register(String producerName, Producer producer) {
//        if (this.producers.containsKey(producerName)) {
//            throw new IllegalArgumentException("Producer name '"
//                    + producerName + "' existed");
//        }
//        
//        this.producers.put(producerName, producer);
//        LOGGER.info("Registered '" + producerName + "' producer");
//    }
//}
