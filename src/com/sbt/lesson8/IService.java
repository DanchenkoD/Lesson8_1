package com.sbt.lesson8;

import java.util.List;

public interface IService {
    @Cache(cacheType = CacheType.MEMORY, identityBy = {String.class, int.class})
    double doHardWork(final String work, final int value);

    @Cache(cacheType = CacheType.FILE, fileNamePrefix = "myFile.zip", zip = true, listLength = 2)
    List<Double> doWork(final String item);
}
