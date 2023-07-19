package com.jameson.ecommerce.dto;

import com.jameson.ecommerce.entity.Address;
import com.jameson.ecommerce.entity.Customer;
import com.jameson.ecommerce.entity.Order;
import com.jameson.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
