package com.kitchen.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class RecipecommentId implements Serializable {
    private static final long serialVersionUID = 1L;
    private String recipeId;
    private String userId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecipecommentId)) return false;
        RecipecommentId that = (RecipecommentId) o;
        return getRecipeId().equals(that.getRecipeId()) &&
                getUserId().equals(that.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRecipeId(), getUserId());
    }
}
