package com.github.c4rlosmonteiro.imageprocessorservicespi.provider;

import com.github.c4rlosmonteiro.imageprocessorservicespi.BasicImageType;
import com.github.c4rlosmonteiro.imageprocessorservicespi.service.ImageProcessorService;

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