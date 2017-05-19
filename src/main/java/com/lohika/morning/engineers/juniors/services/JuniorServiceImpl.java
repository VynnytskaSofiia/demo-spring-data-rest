package com.lohika.morning.engineers.juniors.services;

import com.lohika.morning.engineers.juniors.JuniorEngineer;
import com.lohika.morning.engineers.juniors.repositories.JuniorEngineerRepository;
import com.lohika.morning.engineers.juniors.repositories.JuniorEngineerRepositoryImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JuniorServiceImpl implements JuniorService{

    private final JuniorEngineerRepository juniorEngineerRepository;

    @Override
    public JuniorEngineer addSkill(final String id, final String newSkill) {
        juniorEngineerRepository.addSkill(id, newSkill);
        return juniorEngineerRepository.findOne(id);
    }

    @Override
    public void delete(final String id) {
        juniorEngineerRepository.delete(id);
    }
}
