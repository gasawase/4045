package com.individualAssignment.service;

import org.springframework.stereotype.Component;

import com.individualAssignment.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {

	/* (non-Javadoc)
	 * @see com.individualAssignment.service.ISpecimenService#fetchById(int)
	 */
	@Override
	public SpecimenDTO fetchById(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		specimenDTO.setLatitude("39.74");
		specimenDTO.setLogitude("-84.51");
		specimenDTO.setDescription("A beautiful Eastern Redbud");
		return specimenDTO;
	}
	
	/* (non-Javadoc)
	 * @see com.individualAssignment.service.ISpecimenService#save(com.individualAssignment.dto.SpecimenDTO)
	 */
	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}
	
}
