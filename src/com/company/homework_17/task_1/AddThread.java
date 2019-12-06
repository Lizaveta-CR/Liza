package com.company.homework_17.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class AddThread {
    private List<String> stringList = new ArrayList<>();
    private ReentrantLock locker = new ReentrantLock();

    public void addToList(String string) {
        try {
            boolean isLocked = locker.tryLock();
            if (isLocked) {
                stringList.add(string);
            }
        } finally {
            locker.unlock();
        }
    }

    public List<String> getList() {
        return stringList;
    }
}
