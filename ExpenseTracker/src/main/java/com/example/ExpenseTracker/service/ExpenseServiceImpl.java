package com.example.ExpenseTracker.service;

import com.example.ExpenseTracker.model.Expense;
import com.example.ExpenseTracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	public List<Expense> getAllExpenses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveExpense(Expense expense) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Expense getExpenseById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteExpenseById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Expense> getExpensesByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Expense> getExpensesByDateRange(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getTotalExpenseAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalExpenseAmountByCategory(String category) {
		// TODO Auto-generated method stub
		return 0;
	}

}
