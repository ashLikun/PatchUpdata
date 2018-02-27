package com.ashlikun.patchupdata.library;

/**
 * 作者　　: 李坤
 * 创建时间: 2018/2/24　16:38
 * 邮箱　　：496546144@qq.com
 * <p>
 * 功能介绍：
 */

public class PatchUtils {
    static {
        System.loadLibrary("bspatch");
    }

    public static boolean test() {
        return true;
    }

    public static native boolean bspatch(String oldApk, String newApk, String patch);

}
