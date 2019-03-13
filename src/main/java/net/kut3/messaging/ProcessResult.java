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
package net.kut3.messaging;

/**
 *
 */
public class ProcessResult {

    private ProcessResultCode code;
    private String errorDesc;
    private boolean doAck;

    /**
     *
     * @return A {@link ProcessResultCode} value
     */
    public ProcessResultCode code() {
        return this.code;
    }

    /**
     *
     * @param value A {@link ProcessResultCode} value
     * @return The current object
     */
    public ProcessResult code(ProcessResultCode value) {
        this.code = value;
        return this;
    }

    /**
     *
     * @return Error description
     */
    public String errorDesc() {
        return this.errorDesc;
    }

    /**
     *
     * @param value Error description
     * @return The current object
     */
    public ProcessResult errorDesc(String value) {
        this.errorDesc = value;
        return this;
    }

    /**
     * Default value is false.
     *
     * @return True or false
     */
    public boolean doAck() {
        return this.doAck;
    }

    /**
     *
     * @param value True or false
     * @return The current object
     */
    public ProcessResult doAck(boolean value) {
        this.doAck = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{\"code\":\"")
                .append(this.code.name())
                .append("\", \"doAck\":").append(this.doAck);

        if (null != this.errorDesc) {
            sb.append(", \"errorDesc\":\"").append(this.errorDesc)
                    .append("\"");
        }

        sb.append("}");

        return sb.toString();
    }
}
