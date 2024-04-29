package com.example.ExpenseTracker.controller;

import com.example.ExpenseTracker.model.Expense;
import com.example.ExpenseTracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("expenses", expenseService.getAllExpenses());
        return "index";
    }
    // Other controller methods
}
