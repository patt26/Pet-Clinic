package com.prat.petclinic.Service;

import com.prat.petclinic.Model.Owner;
import com.prat.petclinic.Model.Vet;
import com.prat.petclinic.Repository.PetClinicInterface;
import org.springframework.stereotype.Component;

import java.util.Set;

public interface VetService extends PetClinicInterface<Vet,Long> {
}
