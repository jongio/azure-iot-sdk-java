/*
 * Copyright (c) Microsoft. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.microsoft.azure.sdk.iot.service.exceptions;

/**
 * Create iot hub device maximum queue depth exceeded exception
 */
public class IotHubDeviceMaximumQueueDepthExceededException extends IotHubException
{
    public IotHubDeviceMaximumQueueDepthExceededException()
    {
        super("Maximum queue depth exceeded");
    }

    public IotHubDeviceMaximumQueueDepthExceededException(String message)
    {
        super(message);
    }
}
