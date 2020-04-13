package com.cms.repositories;

import com.cms.model.Conference;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
public class ConferencesRepository {
    Date firstDate = new Date(2000, 12, 24);

    public Conference getById(String id) {
        return new Conference(
                firstDate,
                firstDate,
                firstDate,
                firstDate
        );
    }

    public List<Conference> getConferences() {
        Conference conf1 = new Conference(
                firstDate,
                firstDate,
                firstDate,
                firstDate
        );
        Conference conf2 = new Conference(
                firstDate,
                firstDate,
                firstDate,
                firstDate
        );

        return Arrays.asList(conf1, conf2);
    }
}
