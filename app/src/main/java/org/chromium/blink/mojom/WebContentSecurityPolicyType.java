
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/navigation_initiator.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class WebContentSecurityPolicyType {


    public static final int WEB_CONTENT_SECURITY_POLICY_TYPE_REPORT = 0;

    public static final int WEB_CONTENT_SECURITY_POLICY_TYPE_ENFORCE = WEB_CONTENT_SECURITY_POLICY_TYPE_REPORT + 1;

    public static final int MIN_VALUE = (int) (0);
    public static final int MAX_VALUE = (int) (1);

    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private WebContentSecurityPolicyType() {}

}