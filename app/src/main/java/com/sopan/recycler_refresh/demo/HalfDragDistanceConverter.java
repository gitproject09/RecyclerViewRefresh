package com.sopan.recycler_refresh.demo;

import com.sopan.recycler_refresh.refresh.IDragDistanceConverter;

public class HalfDragDistanceConverter implements IDragDistanceConverter {

    @Override
    public float convert(float scrollDistance, float refreshDistance) {
        return scrollDistance * 0.5f;
    }
}
