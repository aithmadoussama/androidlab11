package com.example.lab14.external;

import android.content.Context;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public final class ExternalAppFilesStore {

    private ExternalAppFilesStore() {}

    public static String write(Context context, String fileName, String content) throws Exception {
        File dir = context.getExternalFilesDir(null);
        if (dir == null) return null;

        File file = new File(dir, fileName);
        if (Build.VERSION.SDK_INT_FULL >= Build.VERSION_CODES_FULL.BAKLAVA_1) {
            Files.writeString(file.toPath(), content, StandardCharsets.UTF_8);
        }
        return file.getAbsolutePath();
    }

    @RequiresApi(api = Build.VERSION_CODES_FULL.BAKLAVA_1)
    public static String read(Context context, String fileName) throws Exception {
        File dir = context.getExternalFilesDir(null);
        if (dir == null) return null;

        File file = new File(dir, fileName);
        if (!file.exists()) return null;
        return java.nio.file.Files.readString(file.toPath(), StandardCharsets.UTF_8);
    }

    public static boolean delete(Context context, String fileName) {
        File dir = context.getExternalFilesDir(null);
        if (dir == null) return false;

        File file = new File(dir, fileName);
        return file.delete();
    }
}