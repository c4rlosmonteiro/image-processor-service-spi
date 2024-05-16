package com.github.c4rlosmonteiro.imageprocessorservicespi;

import com.github.c4rlosmonteiro.imageprocessorservicespi.service.ImageProcessorService;

import java.util.*;

public class ImageProcessorApp {

    private final List<ImageProcessorService> imageProcessorProviders;

    public ImageProcessorApp() {
        final ServiceLoader<ImageProcessorService> imageProcessorServiceLoader = ServiceLoader.load(ImageProcessorService.class);
        final Iterator<ImageProcessorService> imageProcessorServiceIterator = imageProcessorServiceLoader.iterator();

        this.imageProcessorProviders = new ArrayList<>();

        while (imageProcessorServiceIterator.hasNext()) {
            imageProcessorProviders.add(imageProcessorServiceIterator.next());
        }
    }

    public void processImages(final String type) {
        for (final ImageProcessorService imageProcessorProvider : imageProcessorProviders) {
            if (Objects.equals(imageProcessorProvider.getType(), type)) {
                imageProcessorProvider.process();
                return;
            }
        }

        throw new RuntimeException("No provider found to process image type: " + type
                + ". Create a new provider for it!");
    }
}
