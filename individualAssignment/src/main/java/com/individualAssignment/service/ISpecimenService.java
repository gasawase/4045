package com.individualAssignment.service;

import com.individualAssignment.dto.SpecimenDTO;

public interface ISpecimenService {

	SpecimenDTO fetchById(int id);

	void save(SpecimenDTO specimenDTO);

}