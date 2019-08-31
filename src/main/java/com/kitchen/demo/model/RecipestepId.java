package com.kitchen.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class RecipestepId implements Serializable {
    private static final long serialVersionUID = 1L;
    private String recipeId;
    private Integer stepId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecipestepId)) return false;
        RecipestepId that = (RecipestepId) o;
        return getRecipeId().equals(that.getRecipeId()) &&
                getStepId().equals(that.getStepId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRecipeId(), getStepId());
    }
}
