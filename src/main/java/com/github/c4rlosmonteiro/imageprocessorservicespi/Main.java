package com.github.c4rlosmonteiro.imageprocessorservicespi;

public class Main {
    public static void main(final String [] args) {
        final ImageProcessorApp imageProcessorApp = new ImageProcessorApp();
        imageProcessorApp.processImages(BasicImageType.PNG.name());
        imageProcessorApp.processImages(BasicImageType.JPG.name());
        imageProcessorApp.processImages("MY_CUSTOM_OR_NOT_SUPPORTED_IMAGE_TYPE");
    }
}
