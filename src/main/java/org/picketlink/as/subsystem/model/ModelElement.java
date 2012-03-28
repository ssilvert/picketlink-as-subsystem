/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.picketlink.as.subsystem.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class represents a subsystem's model element. A model element is an element that is know and handled by the subsystem.
 * </p>
 * 
 * @author <a href="mailto:psilva@redhat.com">Pedro Silva</a>
 * @since Mar 8, 2012
 */
public enum ModelElement {

    COMMON_ALIAS ("alias"),
    COMMON_URL ("url"),
    
    FEDERATION("federation"),
    
    IDENTITY_PROVIDER("identity-provider"),
    TRUST_DOMAIN("trust-domain"),
    TRUST_DOMAIN_NAME("name"),
    IDENTITY_PROVIDER_SIGN_OUTGOING_MESSAGES("signOutgoingMessages"),
    IDENTITY_PROVIDER_IGNORE_INCOMING_SIGNATURES("ignoreIncomingSignatures"),
    
    SERVICE_PROVIDER("service-provider"), 
    SERVICE_PROVIDER_POST_BINDING ("post-binding");
    
    private static final Map<String, ModelElement> modelElements = new HashMap<String, ModelElement>();
    
    static {
        for (ModelElement element : values()) {
            modelElements.put(element.getName(), element);
        }
    }
    
    private String name;

    private ModelElement(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    /**
     * Converts the specified name to a {@link ModelElement}.
     * 
     * @param name a model element name
     * @return the matching model element enum.
     */
    public static ModelElement forName(String name) {
        return modelElements.get(name);
    }
}
