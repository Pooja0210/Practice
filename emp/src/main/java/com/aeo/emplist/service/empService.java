package com.aeo.emplist.service;

import java.util.List;

import com.aeo.emplist.dto.Emp;

public interface empService {
	public Emp addemp(Emp emp);
    public List<Emp> getAll();
	public Emp updateEmp(int id,Emp emp);
	public boolean delete(int id);
}
