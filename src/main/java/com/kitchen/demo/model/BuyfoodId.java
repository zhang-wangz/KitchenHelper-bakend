package com.kitchen.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class BuyfoodId  implements Serializable {
    private static final long serialVersionUID = 1L;
    private String buyOrderId;
    private String foodId;

    public BuyfoodId() {

    }

    public BuyfoodId(String buyOrderId, String foodId) {
        this.buyOrderId = buyOrderId;
        this.foodId = foodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BuyfoodId)) return false;
        BuyfoodId buyfoodId = (BuyfoodId) o;
        return getBuyOrderId().equals(buyfoodId.getBuyOrderId()) &&
                getFoodId().equals(buyfoodId.getFoodId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBuyOrderId(), getFoodId());
    }
}
