package com.example.in_app_calls_demo.models

import java.io.Serializable

class CallData(
        val channelId: String?,
        val callerId: String?,
        val callerPhone: String?,
        val callerName: String?,
        val hasVideo: Boolean?,
) : Serializable {
    fun hasVideoToInt(): Int {
        if (hasVideo == true) {
            return 1;
        }
        return 0;
    }
}