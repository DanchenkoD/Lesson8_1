package com.sbt.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Service implements IService {
    @Override
    public double doHardWork(final String work, final int value) {
        double result = 0;
        for (int i = 0; i < work.length(); i++) {
            result = +(double) work.charAt(i) / (value);
        }
        return result;
    }

    @Override
    public List<Double> doWork(final String item) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < item.length(); i++) {
            list.add((double) item.charAt(i) / (2));
        }
        return list;
    }
}
