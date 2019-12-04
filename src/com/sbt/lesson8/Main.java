package com.sbt.lesson8;

import java.io.File;

public class Main {
    //Каталог хранения кэша вычислений
    private static final String CACHE_PATH = "cache" + File.separator;
    private static final CacheType DEFAULT_CACHE_TYPE = CacheType.FILE;

    public static void main(String[] args) {
        CacheProxy cacheProxy = new CacheProxy(CACHE_PATH, DEFAULT_CACHE_TYPE);

        IService service = cacheProxy.cache(new Service());

        System.out.println("\n>Метод doHardWork");
        System.out.println("Результат: " + service.doHardWork("work2",422));
        System.out.println("Результат: " + service.doHardWork("work2",422));
        System.out.println("Результат: " + service.doHardWork("work1",4));
        System.out.println("Результат: " + service.doHardWork("work1",4));

        System.out.println("\n>Метод doWork");
        System.out.println("Результат: " + service.doWork("Test"));
        System.out.println("Результат: " + service.doWork("Test"));
        System.out.println("Результат: " + service.doWork("Test Test"));
        System.out.println("Результат: " + service.doWork("Test Test"));

    }
}
