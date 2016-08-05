package com.arms.domain.repository;

import com.arms.domain.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by arms_matsushita on 西暦2016/07/01.
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
