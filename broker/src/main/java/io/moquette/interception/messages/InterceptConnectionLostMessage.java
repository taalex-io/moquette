/*
 * Copyright (c) 2012-2018 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */

package io.moquette.interception.messages;

import java.net.SocketAddress;

public class InterceptConnectionLostMessage implements InterceptMessage {

    private final String clientID;
    private final String username;
    private final SocketAddress client;

    public InterceptConnectionLostMessage(String clientID, String username, SocketAddress client) {
        this.clientID = clientID;
        this.username = username;
        this.client = client;
    }

    public String getClientID() {
        return clientID;
    }

    public String getUsername() {
        return username;
    }

    public String getClientAddress() {
      return client.toString();
    }
}
