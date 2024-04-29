package com.example.ExpenseTracker.service;

import com.example.ExpenseTracker.model.Expense;

import java.sql.Date;
import java.util.List;

public interface ExpenseService {
    List<Expense> getAllExpenses();
    void saveExpense(Expense expense);
        
        Expense getExpenseById(Long id);
        void deleteExpenseById(Long id);
        
        List<Expense> getExpensesByCategory(String category);
        List<Expense> getExpensesByDateRange(Date startDate, Date endDate);
        
        double getTotalExpenseAmount();
        double getTotalExpenseAmountByCategory(String category);
        // Other methods based on your application requirements
    }

