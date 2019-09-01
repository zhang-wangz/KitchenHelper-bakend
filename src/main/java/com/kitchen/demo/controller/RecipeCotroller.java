package com.kitchen.demo.controller;


import com.kitchen.demo.model.Recipe;
import com.kitchen.demo.model.Recipecomment;
import com.kitchen.demo.model.Recipestep;
import com.kitchen.demo.repo.*;
import com.kitchen.demo.util.ResultUtil;
import com.kitchen.demo.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeCotroller {

    @Autowired
    private  RecipeRepository recipeRepository;

    @Autowired
    private RecipebrowRepository recipebrowRepository;

    @Autowired
    private RecipecollRepository recipecollRepository;

    @Autowired
    private RecipecommentRepository recipecommentRepository;

    @Autowired
    private RecipematerialsRepository recipematerialsRepository;

    @Autowired
    private RecipestepRepository recipestepRepository;

    @GetMapping("/get_all_recipe_list")
    public ResultVO<List<Recipe>> getRecipeList(){
        List<Recipe> recipeList = null;
        try {
            recipeList = recipeRepository.findAll();
        }catch (Exception e){
            return ResultUtil.error(500,"sorry,we make a mistake");
        }
        return ResultUtil.success(recipeList);
    }

    @GetMapping("/get_recipe_by_recipeid")
    public ResultVO<Recipe> findRecipeByRecipeId(String recipeId){
        Recipe recipe = recipeRepository.findById(recipeId).orElse(null);
        if(recipe == null) return ResultUtil.error(404,"not found");
        return ResultUtil.success(recipe);
    }

    @GetMapping("/getRecipeStepsByRecipeId")
    public ResultVO<List<Recipestep>> getRecipeStepsByRecipeId(String recipeId){
        List<Recipestep> recipeList = null;
        try {
            recipeList = recipestepRepository.findRecipestepsByRecipeId(recipeId);
        }catch (Exception e){
            return ResultUtil.error(500,"sorry,we make a mistake");
        }
        if(recipeList.size() == 0) return ResultUtil.error(404,"not found");
        return ResultUtil.success(recipeList);
    }

    @GetMapping("/getRecipeCommentsByRecipeId")
    public ResultVO<List<Recipecomment>> getRecipeCommentsByRecipeId(String recipeId){
        List<Recipecomment> recipeList = null;
        try {
            recipeList = recipecommentRepository.findRecipecommentByRecipeId(recipeId);
        }catch (Exception e){
            return ResultUtil.error(500,"sorry,we make a mistake");
        }
        if(recipeList.size() == 0) return ResultUtil.error(404,"not found");
        return ResultUtil.success(recipeList);
    }









}
