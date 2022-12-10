/*
 * Copyright (C) 2022 The LineageOS Project
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

package com.android.systemui.biometrics

import android.content.Context
import android.view.Surface

import com.android.systemui.biometrics.UdfpsDisplayModeProvider;

class DummyUdfpsDisplayModeProvider constructor(
    private val context: Context
): UdfpsDisplayModeProvider {
    override fun enable(onHbmEnabled: Runnable?) {
        onHbmEnabled?.run()
    }

    override fun disable(onHbmDisabled: Runnable?) {
        onHbmDisabled?.run()
    }
}
