package com.arms.domain.service;

import com.arms.app.project.ProjectForm;
import com.arms.domain.entity.Project;
import com.arms.domain.entity.Task;
import com.arms.domain.repository.ProjectRepository;
import com.arms.domain.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by arms_matsushita on 西暦2016/07/01.
 */
@Service
@Transactional
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    TaskRepository taskRepository;

    public List<Project> findAllProject() {
        return projectRepository.findAll();
    }

    public void save(ProjectForm projectForm) {
        Date date = Calendar.getInstance().getTime();
        Project project = new Project();
        project.setName(projectForm.getName());
        project.setCreatedDate(date);
        project.setUpdatedDate(date);
        projectRepository.save(project);
    }

    public ProjectForm findProjectById(int id) {
        Project project = projectRepository.findOne(id);
        return new ProjectForm(project.getId(), project.getName());
    }

    public void update(ProjectForm projectForm) {
        Project project = projectRepository.findOne(projectForm.getId());
        project.setName(projectForm.getName());
        project.setUpdatedDate(Calendar.getInstance().getTime());
        projectRepository.save(project);
    }

    public Map<Integer, Integer> calcRemainingTaskNumber(List<Project> projectList) {
        Map<Integer, Integer> remainingTaskNumberMap = new HashMap();
        for(Project project : projectList) {
            int taskCount = 0;
            for(Task task : project.getTaskList()) {
                if(!task.isStatus()) {
                    taskCount++;
                }
            }
            remainingTaskNumberMap.put(project.getId(), taskCount);
        }
        return remainingTaskNumberMap;
    }

    public void delete(int projectId) {
        taskRepository.deleteByProjectId(projectId);
        projectRepository.delete(projectId);
    }
}
