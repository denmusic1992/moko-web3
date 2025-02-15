/*
 * Copyright 2020 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.web3.contract

import kotlinx.serialization.json.JsonObject

class AbiMethodNotFoundException(
    val method: String,
    val methodsAbi: Map<String, JsonObject>
) : Throwable("method $method not found in ABI $methodsAbi")
