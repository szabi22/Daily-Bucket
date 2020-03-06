package com.petadev.backend.seeder;

import com.petadev.backend.DatabaseSeeder;
import com.petadev.backend.controller.dao.DaoStore;
import com.petadev.backend.entity.Post;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class PostSeeder implements DatabaseSeeder {
    @Override
    public void fillTable() throws SQLException {
        final var postDao = DaoStore.getPostDao();
        final var userDao = DaoStore.getUserDao();

        final var user1 = userDao.queryForId(1);
        final var user2 = userDao.queryForId(2);

        postDao.create(List.of(
                new Post(user1, new Date(), "This is a very cool post!"),
                new Post(user2, new Date(), "This is a very cool second post!")
        ));
    }
}
