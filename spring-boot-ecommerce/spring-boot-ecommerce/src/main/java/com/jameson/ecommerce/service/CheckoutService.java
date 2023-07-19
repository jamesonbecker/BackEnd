package com.jameson.ecommerce.service;

import com.jameson.ecommerce.dto.Purchase;
import com.jameson.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
