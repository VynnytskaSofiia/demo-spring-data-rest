package com.lohika.morning.engineers.juniors;

public interface JuniorEngineerService {

    JuniorEngineer create(JuniorEngineer engineer);

    void delete(String id);

    JuniorEngineer get(String id);

    Iterable<JuniorEngineer> getAll();

    JuniorEngineer update(JuniorEngineer engineer);
}
