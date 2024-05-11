package com.github.c4rlosmontero.imageprocessorservicespi.provider;

import com.github.c4rlosmontero.imageprocessorservicespi.BasicImageType;
import com.github.c4rlosmontero.imageprocessorservicespi.service.ImageProcessorService;

public class JPGImageProcessorProvider implements ImageProcessorService {
    @Override
    public String getType() {
        return BasicImageType.JPG.name();
    }

    @Override
    public void process() {
        System.out.println("Processing JPG image");
    }
}