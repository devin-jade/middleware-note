package com.devin.netty;

import io.netty.buffer.PooledByteBufAllocator;

/**
 * <p>
 *
 * </p>
 *
 * @author hkh
 * @since 2020-08-13
 */
public class NettyHello {
    public static void main(String[] args) {
        PooledByteBufAllocator allocator = new PooledByteBufAllocator(true);
        allocator.buffer(113);
    }
}
