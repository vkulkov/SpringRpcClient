package com.simple.service;

import javax.jws.WebService;

@WebService
public interface CalculationService {
    long add(int x, int y);
    long subtract(int x, int y);
    long multiply(int x, int y);
    float divide(int x, int y);
}
