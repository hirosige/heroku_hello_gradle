package com.arms.app.project;

import lombok.Data;

/**
 * Created by arms_matsushita on 西暦2016/07/06.
 */
@Data
public class ProjectForm {
    private int id;
    private String name;

    public ProjectForm(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProjectForm() {}
}
