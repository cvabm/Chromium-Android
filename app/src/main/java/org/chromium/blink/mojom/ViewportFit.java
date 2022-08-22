
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/page/display_cutout.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class ViewportFit {


    public static final int AUTO = 0;

    public static final int CONTAIN = AUTO + 1;

    public static final int COVER = CONTAIN + 1;

    public static final int COVER_FORCED_BY_USER_AGENT = COVER + 1;

    public static final int MIN_VALUE = (int) (0);
    public static final int MAX_VALUE = (int) (3);

    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private ViewportFit() {}

}