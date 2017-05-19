package com.lohika.morning.engineers.juniors.services;

import com.lohika.morning.engineers.juniors.JuniorEngineer;

public interface JuniorService {

    JuniorEngineer addSkill(String id, String newSkill);

    void delete(String id);
}
