package com.aeo.emplist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeo.emplist.dto.Emp;
import com.aeo.emplist.entity.EmpEntity;
import com.aeo.emplist.repo.EmpRepo;

@Service
public class empServiceImp implements empService {
	
	
	@Autowired
	ModelMapper modelMapper;

	@Autowired
	EmpRepo empRepo;
	
	@Override
	public Emp addemp(Emp emp) {
		EmpEntity empEntity=convertDtointoEntity(emp);
		empRepo.save(empEntity);
		return convertEntityintoDto(empEntity);
		
	}

	
	private EmpEntity convertDtointoEntity(Emp emp)
	{
		EmpEntity empEntity=modelMapper.map(emp, EmpEntity.class);
		return empEntity;
	}
	private Emp convertEntityintoDto(EmpEntity empEntity)
	{
		Emp emp=modelMapper.map(empEntity, Emp.class);
		return emp;
	}


	@Override
	public List<Emp> getAll() {
		// TODO Auto-generated method stub
		Iterable<EmpEntity> entityList= empRepo.findAll();
		List<Emp> empList = new ArrayList<Emp>();
		for(EmpEntity e:entityList)
		{
			empList.add(convertEntityintoDto(e));
		}
		return empList;
	}


	@Override
	public Emp updateEmp(int id ,Emp emp) {
		Optional<EmpEntity> empEntity=empRepo.findById(id);
		if(empEntity.isPresent())
		{
			EmpEntity empEntity2=empEntity.get();
			empEntity2.setFirstName(emp.getFirstName());
			empEntity2.setLastName(emp.getLastName());
			empEntity2.setManagerName(emp.getManagerName());
			empEntity2.setProject(emp.getProject());
			empRepo.save(empEntity2);
			return convertEntityintoDto(empEntity2);
		}
		return null;
		
	}


	@Override
	public boolean delete(int id) {
		if(empRepo.existsById(id))
		{
			empRepo.deleteById(id);
			
			return true;
		}
		return false;
	}
}
