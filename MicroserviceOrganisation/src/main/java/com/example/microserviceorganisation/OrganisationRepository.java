package com.example.microserviceorganisation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationRepository extends JpaRepository<Organisation,Integer> {
}
