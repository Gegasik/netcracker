package com.netcracker.Controllers;

import com.netcracker.entity.Category;
import com.netcracker.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
    }

    //TODO категории то на русском
    @RequestMapping(value = "/{categoryName}", method = RequestMethod.GET)
    public ResponseEntity<Category> getCategory(@PathVariable(value = "categoryName") String name) {
        Category category = categoryService.getCategoryByName(name).get();
        return ResponseEntity.ok(category);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    //TODO удаляется если имя на английском
    @RequestMapping(value = "/{categoryName}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "categoryName") String name) {
        Category category = categoryService.getCategoryByName(name).get();
        categoryService.delete(category.getIdCategory());
    }
}
