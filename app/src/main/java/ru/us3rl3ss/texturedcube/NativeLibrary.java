package ru.us3rl3ss.texturedcube;

public class NativeLibrary
{
    static
    {
        System.loadLibrary("native-lib");
    }
    public static native void init(int width, int height);
    public static native void step();
}