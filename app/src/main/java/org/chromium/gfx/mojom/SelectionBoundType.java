
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojo/selection_bound.mojom
//

package org.chromium.gfx.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class SelectionBoundType {


    public static final int LEFT = 0;

    public static final int RIGHT = LEFT + 1;

    public static final int CENTER = RIGHT + 1;

    public static final int EMPTY = CENTER + 1;

    public static final int LAST = (int) (SelectionBoundType.EMPTY);

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

    private SelectionBoundType() {}

}