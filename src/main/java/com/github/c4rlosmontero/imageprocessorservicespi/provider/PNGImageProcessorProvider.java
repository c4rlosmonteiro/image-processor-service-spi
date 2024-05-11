package com.github.c4rlosmontero.imageprocessorservicespi.provider;

import com.github.c4rlosmontero.imageprocessorservicespi.BasicImageType;
import com.github.c4rlosmontero.imageprocessorservicespi.service.ImageProcessorService;

public final class PNGImageProcessorProvider implements ImageProcessorService {
    @Override
    public String getType() {
        return BasicImageType.PNG.name();
    }

    @Override
    public void process() {
        System.out.println("Processing PNG image");
    }
}
