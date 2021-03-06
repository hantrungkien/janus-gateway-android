package com.kienht.janus.client.model.request

import com.kienht.janus.client.model.config.JanusCommandName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @author kienht
 * @since 09/09/2020
 */
@JsonClass(generateAdapter = true)
data class JanusRegisterRequest(
    @Json(name = "janus") val name: JanusCommandName,
    @Json(name = "transaction") val transactionId: String,
    @Json(name = "session_id") val sessionId: Long,
    @Json(name = "handle_id") val handleId: Long,
    @Json(name = "body") val body: JanusBodyRequest
)