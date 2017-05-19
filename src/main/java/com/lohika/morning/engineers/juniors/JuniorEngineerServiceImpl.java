package com.lohika.morning.engineers.juniors;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class JuniorEngineerServiceImpl implements JuniorEngineerService {

     private final JuniorEngineerRepository engineerRepository;

    @Override
    public JuniorEngineer create(final JuniorEngineer engineer) {
        return engineerRepository.save(engineer);
    }

    @Override
    public void delete(final String id) {
        engineerRepository.delete(id);
    }

    @Override
    public JuniorEngineer get(final String id) {
        return engineerRepository.findOne(id);
    }

    @Override
    public Iterable<JuniorEngineer> getAll() {
        return engineerRepository.findAll();
    }

    @Override
    public JuniorEngineer update(final JuniorEngineer engineer) {
              return engineerRepository.save(engineer);
    }
}
