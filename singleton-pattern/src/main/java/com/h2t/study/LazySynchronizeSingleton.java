package com.h2t.study;

/**
 * 基于synchronize加锁的懒汉式单例对象创建
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/25 17:36
 */
public class LazySynchronizeSingleton {
    private static LazySynchronizeSingleton lazySynchronizeSingleton = null;

    /**
     * 构造函数私有化
     */
    private LazySynchronizeSingleton() {
    }

    public synchronized static LazySynchronizeSingleton getLazySynchronizeSingleton() {
        if (lazySynchronizeSingleton == null) {
            lazySynchronizeSingleton = new LazySynchronizeSingleton();
        }

        return lazySynchronizeSingleton;
    }
}