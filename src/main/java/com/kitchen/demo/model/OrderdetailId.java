package com.kitchen.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class OrderdetailId implements Serializable {
    private static final long serialVersionUID = 1L;
    private String orderId;
    private String foodId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderdetailId)) return false;
        OrderdetailId that = (OrderdetailId) o;
        return getOrderId().equals(that.getOrderId()) &&
                getFoodId().equals(that.getFoodId());
    }

    public OrderdetailId(){

    }
    @Override
    public int hashCode() {
        return Objects.hash(getOrderId(), getFoodId());
    }
}