package com.GymconnectionAPI.repository;

import com.GymconnectionAPI.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {
    boolean existsByGroupLink(String groupLink);
}
