package com.pluralsight.singleton;

public class DbSingleton {

    private static class LazyHolder {
        static final DbSingleton INSTANCE = new DbSingleton();
    }

    private DbSingleton () {}

    public static DbSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
