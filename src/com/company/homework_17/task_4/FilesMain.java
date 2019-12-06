package com.company.homework_17.task_4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FilesMain {
    private static final String FILE_PATH = "/Users/elizaveta/IdeaProjects/Liza/src/com/company/homework_17/task_4/Files";

    public static void main(String[] args) throws Exception {
        countFilesAndValue(FILE_PATH);
    }

    private static void countFilesAndValue(String dir) throws Exception {
        int length = new File(dir).list().length;
        ExecutorService executorService = Executors.newFixedThreadPool(length);

        List<Future<Integer>> futures = new ArrayList<>();
        List<Callable<Integer>> callableList = new ArrayList<>();
        File f = new File(dir);
        File[] files = f.listFiles();
        for (File file : files) {
            String name = file.getAbsolutePath();
            Callable<Integer> fileCallable = new FileClass(name);
            callableList.add(fileCallable);
        }

        for (Callable<Integer> callable : callableList) {
            Future<Integer> submit = executorService.submit(callable);
            futures.add(submit);
        }

        for (Future<Integer> future : futures) {
            Integer integer = future.get();
        }
        System.out.println(futures);
        executorService.shutdown();
    }
}
