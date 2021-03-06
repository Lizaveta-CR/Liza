package com.company.homework_17.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class AddThread {
    private List<String> stringList = new ArrayList<>();
    private ReentrantLock locker = new ReentrantLock();

    public void addToList(String string) {
//        // https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/locks/Lock.html#tryLock()
////        // у тебя не совсем корректно написана логика, if должен быть за пределами try, по ссылке выше пример
////        try {
////            // ок, главное понимать насколько для тебя важно чтобы все операции были точно выполнены, если обязатлеьно,
////            // то tryLock не подойдет и нужен просто lock()
////            boolean isLocked = locker.tryLock();
////            if (isLocked) {
////                stringList.add(string);
////            }
////        } finally {
////            locker.unlock(); // не получала IllegalMonitorStateException? если вызвать unlock() у незалоченного объекта
////        }
        try {
            boolean isLocked = locker.tryLock(100, TimeUnit.MILLISECONDS);
            if (isLocked) {
                try {
                    stringList.add(string);
                } finally {
                    locker.unlock();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Smth is broken....");
        }
    }

    public List<String> getList() {
        return stringList;
    }
}
