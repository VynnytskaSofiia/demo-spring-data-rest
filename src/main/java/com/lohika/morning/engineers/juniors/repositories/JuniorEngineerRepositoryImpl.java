package com.lohika.morning.engineers.juniors.repositories;

import com.lohika.morning.engineers.juniors.JuniorEngineer;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

@RequiredArgsConstructor
public class JuniorEngineerRepositoryImpl implements CustomRepository {

    private final MongoTemplate mongoTemplate;

    @Override
    public void addSkill(final String id, final String skill) {
        final Update skillsUpdate = new Update().addToSet("skills", skill);
        final Query query = Query.query(Criteria.where("_id").is(id));
        mongoTemplate.updateFirst(query, skillsUpdate, JuniorEngineer.class);
    }
}
