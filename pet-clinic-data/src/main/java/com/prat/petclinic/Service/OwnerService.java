package com.prat.petclinic.Service;

import com.prat.petclinic.Model.Owner;
import com.prat.petclinic.Repository.PetClinicInterface;

import java.util.Set;

public interface OwnerService extends PetClinicInterface<Owner,Long> {

    Owner findByLastName(String lastName);

}
