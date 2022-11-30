package com.ute.jspservlettutorial.services;

import com.ute.jspservlettutorial.beans.Category;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategoryService {
    public static List<Category> findAll() {
        Sql2o sql2o = new Sql2o("jdbc:mysql://127.0.0.1:3306/plbh", "root", "adminroot");
        String sql = "SELECT * FROM categories";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Category.class);
        }
    }
}
