package com.xloop.createstaff.IModelRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xloop.createstaff.Model.CreateStaff;

public interface IStaffRepository extends JpaRepository<CreateStaff, Long> {
}
