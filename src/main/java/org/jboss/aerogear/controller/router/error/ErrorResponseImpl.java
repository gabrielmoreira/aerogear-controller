/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.controller.router.error;

public class ErrorResponseImpl implements ErrorResponse {
    
    private final int statusCode;
    private final Object content;

    public ErrorResponseImpl(final int statusCode, final Object content) {
        this.statusCode = statusCode;
        this.content = content;
    }

    @Override
    public int statusCode() {
        return statusCode;
    }

    @Override
    public Object content() {
        return content;
    }
    
    @Override
    public String toString() {
        return "ErrorResponseImpl[statusCode=" + statusCode + ", content=" + content + "]";
    }

}
