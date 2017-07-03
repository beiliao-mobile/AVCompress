package com.babychat.avcompress;


public class FFmpegHelper {
    static {
        System.loadLibrary("AVCompress");
    }
    /**
     * @param inPath 输入路径
     * @param src_width 输入宽
     * @param src_height 输入高
     * @param dst_width 输出宽
     * @param dst_height 输出高
     * @param outPath  输出路径
     * @return
     */
    native int compress(String inPath, int src_width, int src_height, int dst_width, int dst_height, String outPath);

    /**
     * 取消压缩操作
     */
    native void cancel();
}
