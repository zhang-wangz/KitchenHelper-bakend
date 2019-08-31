package com.kitchen.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class RecipematerialsId implements Serializable {
    private static final long serialVersionUID = 1L;
    private String recipeId;
    private String foodId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecipematerialsId)) return false;
        RecipematerialsId that = (RecipematerialsId) o;
        return getRecipeId().equals(that.getRecipeId()) &&
                getFoodId().equals(that.getFoodId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRecipeId(), getFoodId());
    }
}
