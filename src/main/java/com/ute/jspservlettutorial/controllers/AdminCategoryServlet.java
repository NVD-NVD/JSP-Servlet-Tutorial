package com.ute.jspservlettutorial.controllers;

import com.ute.jspservlettutorial.beans.Category;
import com.ute.jspservlettutorial.services.CategoryService;
import com.ute.jspservlettutorial.utils.ServletUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdminCategoryServlet", value = "/Admin/Category/*")
public class AdminCategoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        if (path == null || path.equals("/")) {
            path = "/Index";
        }

        switch (path) {
            case "/Index":
                Category c = new Category(1, "Sách");

                List<Category> categories = CategoryService.findAll();
                req.setAttribute("category", c);
                req.setAttribute("categories", categories);
                ServletUtils.forward("/views/vwCategory/Index.jsp", req, resp);
                break;
            case "/About":
                ServletUtils.forward("/views/vwCategory/About.jsp", req, resp);
                break;
            default:
                ServletUtils.forward("/views/404.jsp", req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
