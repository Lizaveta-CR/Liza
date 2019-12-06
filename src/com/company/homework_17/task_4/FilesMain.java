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
            String name = file.getName();
            Callable<Integer> fileCallable = new FileClass(name);
            callableList.add(fileCallable);
        }

        for (int i = 0; i < length; i++) {
            //Future<Integer> submit = executorService.submit(fileCallable); как мне сюда передать Callable?
            //futures.add(submit);
        }
        for (Future<Integer> future : futures) {
            future.get();
            //  Integer call = fileCallable.call();
            // System.out.println(call);
        }
        executorService.shutdown();
    }
}
