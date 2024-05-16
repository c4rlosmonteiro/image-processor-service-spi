package com.github.c4rlosmonteiro.imageprocessorservicespi.provider;

import com.github.c4rlosmonteiro.imageprocessorservicespi.BasicImageType;
import com.github.c4rlosmonteiro.imageprocessorservicespi.service.ImageProcessorService;

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
