package com.ute.jspservlettutorial.services;

import com.ute.jspservlettutorial.beans.Category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategoryService {

    public static List<Category> findAll() {
        return new ArrayList<>(
                Arrays.asList(
                        new Category(1, "Sach"),
                        new Category(1, "Sach"),
                        new Category(1, "Sach"),
                        new Category(1, "Sach"),
                        new Category(1, "Sach"),
                        new Category(1, "Sach")

                )
        );
    }
}
