package com.arms.domain.repository;

import com.arms.domain.entity.Project;
import com.arms.domain.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by arms_matsushita on 西暦2016/07/01.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    void deleteByProjectId(int projectId);
}
